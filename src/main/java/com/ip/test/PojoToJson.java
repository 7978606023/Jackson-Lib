package com.ip.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class PojoToJson {

	public static void main(String[] args) throws IOException  {
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(SerializationFeature.INDENT_OUTPUT);
		
		Post post = new Post();
		post.setTitle("Java guide");
		post.setId(100L);
		post.setDescription("post about java lib");
		post.setContent("java content");
		post.setLastUpdatedAt(new Date());
		post.setPostedAt(new Date());
		
		Set<Tags> tagss = new HashSet<>();
		Tags java = new Tags(1L,"java");
		Tags jackson = new Tags(2L,"jackson");
		Tags json = new Tags(3L,"Json");
		tagss.add(java);
		tagss.add(jackson);
		tagss.add(json);
		
		post.setTagss(tagss);
		
		String postJson = mapper.writeValueAsString(post);
		System.out.println(postJson);
		
		FileOutputStream fos = new FileOutputStream("post.json");
		mapper.writeValue(fos, post);
		fos.close();

	}

}
