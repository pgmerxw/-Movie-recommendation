package com.neudeu.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neudeu.pojo.User;
import com.neudeu.service.UserService;

@Controller
public class UserLoginController {
    @Autowired
    private UserService userService;
	@RequestMapping("/login")
	public String login(Model model,HttpSession session,String u_id,String u_passwd) {
		User user=userService.login(u_id, u_passwd);
		if (user!=null) {
			session.setAttribute("user", user);
			return "findAll.action";
		}else {
			model.addAttribute("msg", "用户名或密码错误");
			return "login.jsp";
		}
		
		
	}
		@RequestMapping("/logout")
		public String logout(HttpSession session) {
			if (session.getAttribute("user")!=null) {
				session.removeAttribute("user");
				return "login.jsp";
			}
			return "login.jsp";
			}
	
}
