package com.example.springboot.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;

import com.example.springboot.services.IService;

@Service("iService")
public class MyService implements IService {

	@Autowired
	private WebApplicationContext context;
		
	public String goWork(String s) throws Exception {
		MyModel model = context.getBean("MyModel", MyModel.class);
		model.setName(s);
		System.out.println(model.getName());
		
		if (model.getName().equals("Sonias")) {
			System.out.println("Sonia das not happening");
		} else {
			System.out.println("Sonia das");
			throw new Exception("exception");
		}
		return model.getName();
	}

	@Override
	public void myWork() {
		// TODO Auto-generated method stub
		
	}

}
