package com.crtf.blogs.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		//关闭csrf
		http.csrf().disable();
//		http.csrf().ignoringAntMatchers("/eureka/**");
        super.configure(http);
//		http
//		.authorizeRequests()
//			.anyRequest().authenticated()
//			.and()
//		.httpBasic();
	}
}
