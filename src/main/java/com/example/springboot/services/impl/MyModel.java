package com.example.springboot.services.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("MyModel")
@Scope("prototype")
public class MyModel {
	private String name = "Sonia";

	public void setName(String name) {
		this.name += name;
	}

	public String getName() {
		return name;
	}
}
