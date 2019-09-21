package com.neudeu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neudeu.mapper.UserMapper;
import com.neudeu.pojo.User;
import com.neudeu.service.UserService;
@Service
public class UserServiceImpl implements UserService{
    @Autowired
	private UserMapper userMapper;

	@Override
	public User login(String u_id, String u_passwd) {
		return userMapper.login(u_id, u_passwd);
	}
	



}
