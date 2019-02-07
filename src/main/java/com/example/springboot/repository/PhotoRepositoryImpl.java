package com.example.springboot.repository;

import java.util.List;
import java.util.Map;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.springboot.model.Photo;

@Service
public class PhotoRepositoryImpl implements IPhotoRepository {

	private String url = "https://jsonplaceholder.typicode.com/photos";
	@Override
	public Map<Integer, Photo> getPhotoesFromCache() {

		if (this.photomap.isEmpty()) {
			RestTemplate template = new RestTemplate();
			ParameterizedTypeReference<List<Photo>> photo = new ParameterizedTypeReference<List<Photo>>() {
			};

			ResponseEntity<List<Photo>> response = template.exchange(url,
					HttpMethod.GET, null, photo);
			
			List<Photo> photos = response.getBody();
			
			for(Photo eachPhoto : photos) {
				this.photomap.put(eachPhoto.id, eachPhoto);
			}

		}
		return this.photomap;
	}

}
