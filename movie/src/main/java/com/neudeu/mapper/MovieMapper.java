package com.neudeu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.neudeu.pojo.Movie;

public interface MovieMapper {
   List<Movie> findMovie(Integer pageNum,Integer pageSize,@Param("m_name")String m_name);
   Movie findInfo(@Param("m_id")String m_id);
   String findRecMovie(@Param("m_id")String m_id);
   Movie findMovieById(@Param("m_id")String m_id);
   List<Movie> findAll(Integer pageNum,Integer pageSize);
}
