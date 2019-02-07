package com.example.springboot.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.example.springboot.configuration"})
public class SpringbootApplication {

	public static void main(String[] args){
		SpringApplication.run(SpringbootApplication.class, args);
		 
	}
}
