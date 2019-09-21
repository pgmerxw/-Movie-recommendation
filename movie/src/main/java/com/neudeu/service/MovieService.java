package com.neudeu.service;

import java.util.List;

import com.neudeu.pojo.Movie;

public interface MovieService {
   List<Movie> findMovie(Integer pageNum,Integer pageSize,String m_name);
   Movie findInfo(String m_id);
   String findRecMovie(String m_id);
   List<Movie> findAll(Integer pageNum,Integer pageSize);
}
