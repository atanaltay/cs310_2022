package com.sabanciuniv.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.sabanciuniv.model.Customer;

public interface CustomerRepo extends MongoRepository<Customer, String>{
	
	@Query("{name:'?0'}")
	public List<Customer> findWithParamName(String name);
	
	//findByName(String name)
	//findByAge(int age)
	
	public Customer findByName(String name);
	
	public List<Customer> findByAgeLessThan(int age);
	
	public List<Customer> findByNameContainsIgnoreCase(String name);
	
	@Query("{'address.city':'?0'}")
	public List<Customer> findSpecificCity(String city);
	
	

}
