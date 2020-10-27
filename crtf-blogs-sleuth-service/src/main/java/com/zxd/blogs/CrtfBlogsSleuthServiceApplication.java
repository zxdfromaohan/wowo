package com.zxd.blogs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CrtfBlogsSleuthServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrtfBlogsSleuthServiceApplication.class, args);
	}

}
