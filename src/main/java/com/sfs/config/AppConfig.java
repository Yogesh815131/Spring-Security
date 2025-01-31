package com.sfs.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

import jakarta.annotation.security.PermitAll;

@Configuration
public class AppConfig {

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http
			.csrf(csrf -> csrf.disable())
			.authorizeHttpRequests(req -> req.requestMatchers("/welcome").permitAll()
					.anyRequest().authenticated()
			)
			.httpBasic();
		return http.build();
	}
}
