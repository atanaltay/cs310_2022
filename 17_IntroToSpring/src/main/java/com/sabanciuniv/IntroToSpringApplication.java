package com.sabanciuniv;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class IntroToSpringApplication implements CommandLineRunner{

	//Log4J -> SL4j (Spring's Logging Library)
	
	@Autowired
	private ApplicationContext ctx;
	
	
	private static final Logger logger 
		= LoggerFactory.getLogger(IntroToSpringApplication.class);
	
	
	public static void main(String[] args) {
		SpringApplication.run(IntroToSpringApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		

		//System.out.println("Hello to Spring Framework...");
		
		logger.info("Hello to spring framework....");
		logger.info("Hello to spring framework....");
		logger.info("Hello to spring framework....");
		logger.info("Hello to spring framework....");
		
		
		/*
		ProductRepository productRepo = ctx.getBean(ProductRepository.class);
		
		productRepo.findAllProducts().forEach(prod->{
			
			logger.info(prod.getName());
		});
		*/
		
		
		ShopService srv =  ctx.getBean(ShopService.class);
		
		srv.getAllProducts().forEach(prod->{
			
			logger.info(prod.getName());
		});
		
		logger.info("----------add product---------------");
		
		ShopService srv2 =  ctx.getBean(ShopService.class);
		
		Product prod = new Product("Shoes",10,1000);
		
		srv2.addProduct(prod);
		
		logger.info("----------list products---------------");
		
		srv2.getAllProducts().forEach(pr->{
			
			logger.info(pr.getName());
		});
		
		
		
		
		
	}
	//Scopes: singleton and prototype
	// prototype -> Create a new instance whenever the object is needed
	@Bean
	//@Scope("prototype")
	public ProductRepository productRepository() {
		return  new ProductRepository();
	}
	
	@Bean
	//@Scope("prototype")
	public ShopService shopService() {
		return new ShopService(productRepository());
	}

}
