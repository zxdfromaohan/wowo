package com.crtf.blogs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CrtfBlogsEurekaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrtfBlogsEurekaServiceApplication.class, args);
	}

}
