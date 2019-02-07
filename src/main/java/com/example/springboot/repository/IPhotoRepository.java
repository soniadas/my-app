package com.example.springboot.repository;

import java.util.HashMap;
import java.util.Map;

import com.example.springboot.model.Photo;

public interface IPhotoRepository {

	public Map<Integer, Photo> photomap = new HashMap<Integer, Photo>();
	
	public Map<Integer, Photo> getPhotoesFromCache();
}
