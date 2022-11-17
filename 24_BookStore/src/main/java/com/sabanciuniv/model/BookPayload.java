package com.sabanciuniv.model;

public class BookPayload {
	

	private String authorid;
	private String publisherid;
	private String title;
	private int year;
	private String content;
	
	public BookPayload() {
		// TODO Auto-generated constructor stub
	}

	public BookPayload(String authorid, String publisherid, String title, int year, String content) {
		super();
		this.authorid = authorid;
		this.publisherid = publisherid;
		this.title = title;
		this.year = year;
		this.content = content;
	}

	public String getAuthorid() {
		return authorid;
	}

	public void setAuthorid(String authorid) {
		this.authorid = authorid;
	}

	public String getPublisherid() {
		return publisherid;
	}

	public void setPublisherid(String publisherid) {
		this.publisherid = publisherid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
	
	
}
