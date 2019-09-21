package com.neudeu.mapper;

import org.apache.ibatis.annotations.Param;

import com.neudeu.pojo.User;

public interface UserMapper {
    User login(@Param("u_id")String u_id,@Param("u_passwd")String u_passwd); 
}
