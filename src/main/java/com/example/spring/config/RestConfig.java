package com.example.spring.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import com.example.spring.controller.IndexController;

@Configuration
public class RestConfig
		extends ResourceConfig {

	public RestConfig() {
		register(IndexController.class);
	}

}
