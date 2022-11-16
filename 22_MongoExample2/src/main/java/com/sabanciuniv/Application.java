package com.sabanciuniv;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sabanciuniv.model.Address;
import com.sabanciuniv.model.Customer;
import com.sabanciuniv.model.Product;
import com.sabanciuniv.model.Supplier;
import com.sabanciuniv.repo.CustomerRepo;
import com.sabanciuniv.repo.ProductRepo;
import com.sabanciuniv.repo.SupplierRepo;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	CustomerRepo customerRepo;
	@Autowired
	SupplierRepo supplierRepo;
	@Autowired
	ProductRepo productRepo;

	static final Logger logger = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		  // CUSTOMERS
		  
		  if (customerRepo.count() == 0) { 
			 Address add1 = new Address("bagdat","ISTANBUL"); 
			 Customer cust1 = new Customer("Jack Johns", add1,33);
		  
			  Address add2 = new Address("esatpasa", "ISTANBUL"); 
			  Customer cust2 = new Customer("Henry Williams", add2,22);
		  
			  customerRepo.save(cust1); 
			  customerRepo.save(cust2);
		  
		  }
		  
		  // find customers
		  logger.info("-------ALL CUSTOMERS----------");
		  
		  // db.customer.find();
		  customerRepo.findAll().forEach(cust -> 
		  { 
			  logger.info(cust.getName()); 
		  });
		  
		  
		  logger.info("---------CUSTOMER WITH ID---------");
		  
		  
		  Customer cust=
				  customerRepo.findById("63748287b043c24bf57754f1").get();
		  
		  logger.info(cust.getId());
		  logger.info(cust.getName());
		  
		  logger.info("---------CUSTOMER WITH NAME / QUERY---------");
		  
		  
		  List<Customer> custs =  customerRepo.findWithParamName("Jack Johns");
		  
		  logger.info(custs.get(0).getName());
		  
		  logger.info("---------CUSTOMER WITH NAME / findBy Method---------");
		  
		  Customer cust2 = customerRepo.findByName("Jack Johns");
		  
		  logger.info(cust2.getName());
		  
		  
		  logger.info("---------Find by age less than---------");

		  List<Customer> customers = customerRepo.findByAgeLessThan(30);
		  
		  customers.forEach(cust22->{
			  logger.info(cust22.getName());
		  });
		  
		  logger.info("---------Find by age less than---------");

		  List<Customer> customers2 = customerRepo.findByNameContainsIgnoreCase("jack");
		  
		  customers2.forEach(cust22->{
			  logger.info(cust22.getName());
		  });
		  
		  logger.info("---------Find by city---------");

		  List<Customer> customers3 = customerRepo.findSpecificCity("ISTANBUL");
		  
		  customers3.forEach(cust22->{
			  logger.info(cust22.getName());
		  });
		  
		  
		  
		  // SUPPLIERS
		  
		  if (supplierRepo.count() == 0) { 
		  Address add1 = new Address("bagdat","ISTANBUL"); 
		  Supplier supp1 = new Supplier("TV Co.", add1);
		  
		  Address add2 = new Address("esat", "ANKARA"); 
		  Supplier supp2 = new Supplier("Books Co.", add2);
		  
		  supp1 = supplierRepo.save(supp1); 
		  supp2 = supplierRepo.save(supp2);
		  
		  }

		  // PRODUCTS
		  
		  if (productRepo.count() == 0) { 
		  Supplier supp1 = supplierRepo.findByTitle("TV Co.");

		  Product p1 = new Product(supp1,"LCD TV",3000);
		  
		  Supplier supp2 = supplierRepo.findByTitle("Books Co."); 
		  Product p2 = new Product(supp2, "History 101",200);
		  
		  productRepo.save(p1); 
		  productRepo.save(p2);
		  
		  }
		  
		  // find all products
		  
		  productRepo.findAll().forEach(prod -> { 
		  	logger.info(prod.getName() + " - " +
		  	prod.getPrice()); 
		  	logger.info(prod.getSupplier().getTitle());
		  });
		  
		  
		  logger.info("-----------QUERY PRODUCTS BY SUPPLIERS----------");
		  
		  
		  Supplier suppQuery = new Supplier();
		  suppQuery.setId("63748e1ed820b300387503d8");
		  
		  List<Product> prods = productRepo.findBySupplier(suppQuery);
		  
		 prods.forEach(prodd->{
			logger.info(prodd.getName());
			logger.info(String.valueOf(prodd.getPrice()));
			logger.info(prodd.getSupplier().getTitle());
			
		 });
		 
		 
	}

}
