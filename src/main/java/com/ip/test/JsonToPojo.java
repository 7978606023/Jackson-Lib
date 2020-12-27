package com.ip.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToPojo {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		FileInputStream fis = new FileInputStream("post.json");
		Post post = mapper.readValue(fis, Post.class);
		fis.close();
		
		System.out.print("Printing post details");
		System.out.println(post.getId());
		System.out.println(post.getTitle());
		System.out.println(post.getDescription());
		System.out.println(post.getContent());
		System.out.println(post.getLastUpdatedAt());
		System.out.println(post.getPostedAt());
		
		System.out.println("printing tag details of post: :"+post.getTitle());
		for(Iterator<Tags> iterator = post.getTagss().iterator(); iterator.hasNext();) {
			Tags tagss = (Tags) iterator.next();
			
			System.out.println(tagss.getId());
			System.out.println(tagss.getName());
		}
				
	}

}
