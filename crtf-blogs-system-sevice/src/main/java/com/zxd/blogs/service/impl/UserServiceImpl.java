package com.zxd.blogs.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.zxd.blogs.controller.UserController;
import com.zxd.blogs.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@Override
	public String qryUserInfo() {
		
		logger.info("UserServiceImpl-------------sys");
		
		return "{\"id\":1,\"name\":\"张无忌\",\"pwd\":\"111\"}";
	}

}
