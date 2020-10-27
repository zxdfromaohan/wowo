package com.crtf.blogs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class CrtfBlogsZuulServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrtfBlogsZuulServiceApplication.class, args);
	}

}
