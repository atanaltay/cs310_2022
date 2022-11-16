package com.sabanciuniv.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sabanciuniv.model.Supplier;

public interface SupplierRepo extends MongoRepository<Supplier, String>{

	public Supplier findByTitle(String title);
}
