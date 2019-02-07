package com.example.springboot.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@EnableAutoConfiguration 
@ComponentScan(basePackages={"com.example.springboot.repository", "com.example.springboot.services.impl", "com.example.springboot.controllers"})
public class MyConfigure {

/*	@Bean
	@Scope("prototype")
	public MyModel getBean() {
		MyModel model = new MyModel();
		return model;
	}*/
}
