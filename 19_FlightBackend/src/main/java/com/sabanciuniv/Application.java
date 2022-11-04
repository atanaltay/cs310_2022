package com.sabanciuniv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sabanciuniv.service.FlightService;

@SpringBootApplication(scanBasePackages = {"com.sabanciuniv.service","com.sabanciuniv.repo"})
public class Application implements CommandLineRunner{

	@Autowired private FlightService srv;
	
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	}


	@Override
	public void run(String... args) throws Exception {
		
		srv.generateFlight("jack", "henry", "ataturk", "airbus");
		srv.generateFlight("william", "jonas", "eskisehir", "airbus");
		srv.generateFlight("gokay", "osman", "istanbul", "airbus");
		
		System.out.println("Flight Count:");
		System.out.println(srv.getFlightCount());
		
		System.out.println("List Flights:");
		
		srv.getAllFlights().forEach(flight->{
			System.out.println(flight.getPilot1().getName());
			System.out.println(flight.getPlane().getName());
		});
		
		
		
		
		
	}

}
