package com.example.springboot.controllers;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.model.Photo;
import com.example.springboot.model.RequestData;
import com.example.springboot.repository.IPhotoRepository;
import com.example.springboot.services.IService;

@Component
@RestController
public class MyRestController {
	
	@Autowired
	private IPhotoRepository photoRepo;
	
	@Resource(name = "iService")
	private IService myService;

	@RequestMapping(path="/hello")
	public void getName(@RequestParam String s) throws Exception {
		myService.goWork(s);
	}
	
	@RequestMapping(path="/posts")
	public void getPhotos(RequestData requestData) {
		Map<Integer, Photo> cache = photoRepo.getPhotoesFromCache();
		
		int totalPages = cache.size()/requestData.pageSize;
		
		if(requestData.page > totalPages) {
			//throw error;
		} else {
			
		}
		
	}

}


