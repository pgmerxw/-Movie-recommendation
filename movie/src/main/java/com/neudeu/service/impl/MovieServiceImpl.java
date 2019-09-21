package com.neudeu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neudeu.mapper.MovieMapper;
import com.neudeu.pojo.Movie;
import com.neudeu.service.MovieService;
@Service
public class MovieServiceImpl implements MovieService{
    @Autowired
	private MovieMapper movieMapper;
	@Override
	public List<Movie> findMovie(Integer pageNum,Integer pageSize,String m_name) {
		return movieMapper.findMovie(pageNum,pageSize,m_name);
	}
	@Override
	public Movie findInfo(String m_id) {
		return movieMapper.findInfo(m_id);
	}
	@Override
	public String findRecMovie(String m_id) {
		return movieMapper.findRecMovie(m_id);
	}
	@Override
	public List<Movie> findAll(Integer pageNum, Integer pageSize) {
		// TODO Auto-generated method stub
		return movieMapper.findAll(pageNum, pageSize);
	}
}
