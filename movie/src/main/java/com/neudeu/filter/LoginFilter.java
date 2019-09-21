package com.neudeu.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.neudeu.pojo.User;

public class LoginFilter implements Filter {

	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) resp;
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		String uri = request.getRequestURI();
		if (user != null) {
			chain.doFilter(req, resp);
		} else {
			if (uri.contains("find")||uri.contains("movieinfo")||uri.contains("list.jsp")) {
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
		}
		chain.doFilter(req, resp);
	}

}
