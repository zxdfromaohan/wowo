package com.zxd.blogs.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zxd.blogs.service.UserService;

@RestController
@RequestMapping("/sys")
public class UserController {

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	@Autowired
	private UserService userService;
	
	@RequestMapping("/userInfo")
	public String gainUserInfo() {
		logger.info("UserController-------------sys");
		return userService.qryUserInfo();
	}
}
