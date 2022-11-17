package com.sabanciuniv.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.sabanciuniv.model.Author;


public interface AuthorRepository extends MongoRepository<Author, String>{


	public List<Author> findByAgeGreaterThan(int age);
	public List<Author> findByAgeLessThan(int age);
	public Author findByName(String name);
	public List<Author> findByNameIgnoreCase(String name);
	public List<Author> findByNameContainsIgnoreCase(String name);
	
}
