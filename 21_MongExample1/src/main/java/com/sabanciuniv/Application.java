package com.sabanciuniv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner{

	
	@Autowired private ProductRepository repo;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	
	
	@Override
	public void run(String... args) throws Exception {
		
		repo.insert(new Product("TV"));
		repo.insert(new Product("MOUSE"));
		
		
		
	}
}
