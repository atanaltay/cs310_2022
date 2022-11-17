package com.sabanciuniv.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

@Document
public class Book {

	@Id
	private String id;
	
	private String title;
	private int year;
	private String content;
	
	//Also @DocumentReference
	@DBRef
	private Author author;
	
	@DBRef
	private Publisher publisher;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Book(String title, int year, String content, Author author, Publisher publisher) {
		super();
		this.title = title;
		this.year = year;
		this.content = content;
		this.author = author;
		this.publisher = publisher;
	}



	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}
	
	
	
	
}
