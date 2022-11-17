package com.sabanciuniv.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sabanciuniv.model.Author;
import com.sabanciuniv.model.Book;


public interface BookRepository extends MongoRepository<Book, String>{

	
	public List<Book> findByTitleContainsIgnoreCase(String title);
	
	
}
