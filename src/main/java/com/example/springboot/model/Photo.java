package com.example.springboot.model;

public class Photo {
	
	public String albumId;
    public int id;
    public String title;
    public String url;
    public String thumbnailUrl;

    @Override
	public String toString() {
		return "Photo [albumId=" + albumId + ", id=" + id + ", title=" + title
				+ ", url=" + url + ", thumbnailUrl=" + thumbnailUrl + "]";
	}

}
