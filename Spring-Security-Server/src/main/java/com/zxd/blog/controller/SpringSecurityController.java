package com.zxd.blog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringSecurityController {

	@GetMapping("/hello")
	public String hello() {
		return "Hello, Spring Security!";
	} 
}
