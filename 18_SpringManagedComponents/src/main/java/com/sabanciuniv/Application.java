package com.sabanciuniv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sabanciuniv.service.ShopService;

@SpringBootApplication(scanBasePackages = {"com.sabanciuniv.repo","com.sabanciuniv.service"})
public class Application implements CommandLineRunner{
	
	
	@Autowired
	private ShopService srv;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		srv.getAllProducts().forEach(prod->{
			System.out.println(prod.getName());
		});
		
	}

}
