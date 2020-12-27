package com.ip.test;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Post {

	private long id;
	private String title;
	private String description;
	private String content;
	private Date postedAt = new Date();
	private Date lastUpdatedAt = new Date();
	private Set<Tags> tagss = new HashSet<>();
	
	public Post() {
		
	}

	public Post( String title, String description, String content) {
	
		this.title = title;
		this.description = description;
		this.content = content;
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getPostedAt() {
		return postedAt;
	}

	public void setPostedAt(Date postedAt) {
		this.postedAt = postedAt;
	}

	public Date getLastUpdatedAt() {
		return lastUpdatedAt;
	}

	public void setLastUpdatedAt(Date lastUpdatedAt) {
		this.lastUpdatedAt = lastUpdatedAt;
	}

	public Set<Tags> getTagss() {
		return tagss;
	}

	public void setTagss(Set<Tags> tagss) {
		this.tagss = tagss;
	}
	
	
}
