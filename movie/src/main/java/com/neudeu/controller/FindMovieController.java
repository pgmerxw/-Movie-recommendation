package com.neudeu.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neudeu.pojo.Movie;
import com.neudeu.service.MovieService;

@Controller
public class FindMovieController {
	@Autowired
	private MovieService movieService;

	@RequestMapping("/findAll")
	public String findAll(HttpServletRequest request,
			@RequestParam(required = true, value = "pageNum", defaultValue = "1") Integer pageNum,
			@RequestParam(required = true, value = "pageSize", defaultValue = "8") Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<Movie> movies = movieService.findAll(pageNum, pageSize);
		PageInfo<Movie> pageInfo = new PageInfo<>(movies, 10);
		if (movies.size() > 0) {
			request.setAttribute("pageInfo", pageInfo);
			request.setAttribute("movies", movies);
			return "list.jsp";
		} else {
			request.setAttribute("msg", "没有找到相关电影");
			return "list.jsp";
		}
	}

	@RequestMapping("/findMovie")
	public String findMovie(HttpServletRequest request,
			@RequestParam(required = true, value = "pageNum", defaultValue = "1") Integer pageNum,
			@RequestParam(required = true, value = "pageSize", defaultValue = "8") Integer pageSize, String m_name) {
		PageHelper.startPage(pageNum, pageSize);
		List<Movie> movies = movieService.findMovie(pageNum, pageSize, m_name);
		PageInfo<Movie> pageInfo = new PageInfo<>(movies, 10);
		if (movies.size() > 0) {
			request.setAttribute("pageInfo", pageInfo);
			request.setAttribute("m_name", m_name);
			request.setAttribute("movies", movies);
			return "list.jsp";
		} else {
			request.setAttribute("msg", "没有找到相关电影");
			return "list.jsp";
		}
	}

	@RequestMapping("/findInfo")
	public String findInfo(HttpServletRequest request, String m_id) {
		Movie movie = movieService.findInfo(m_id);
		String recMovies = movieService.findRecMovie(m_id);
		String[] b = recMovies.split(",");
		String[] stars = movie.getStar().split(",");
		List<Movie> recList = new ArrayList<>();
		for (String s : b) {
			recList.add(movieService.findInfo(s));
		}
		if (movie != null) {
			request.setAttribute("movie", movie);
			request.setAttribute("recList", recList);
			request.setAttribute("stars", stars);
			return "movieInfo.jsp";
		} else {
			request.setAttribute("msg", "error");
			return "list.jsp";
		}
	}
}
