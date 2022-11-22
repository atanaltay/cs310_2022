package com.sabanciuniv.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sabanciuniv.model.Publisher;


public interface PublisherRepo extends MongoRepository<Publisher, String>{

}
