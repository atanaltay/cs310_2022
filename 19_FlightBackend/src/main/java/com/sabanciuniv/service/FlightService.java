package com.sabanciuniv.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sabanciuniv.model.Flight;
import com.sabanciuniv.model.Pilot;
import com.sabanciuniv.model.Plane;
import com.sabanciuniv.repo.PLaneRepo;
import com.sabanciuniv.repo.PilotRepo;

@Service
public class FlightService {

	List<Flight> flights = new ArrayList<>();
	
	@Autowired
	PLaneRepo planeRepo;
	
	@Autowired
	PilotRepo pilotRepo;

	//Constructor based dependency injection
	/*
	public FlightService(PLaneRepo planeRepo) {
		this.planeRepo = planeRepo;
	}
	*/
	
	
	public Flight generateFlight(String pilot1Name, 
			String pilot2Name, String planeName, 
			String planeType) {
		
		Plane plane = planeRepo.assignPlane(planeName, planeType);
		Pilot pilot1 = pilotRepo.assignPilot(pilot1Name);
		Pilot pilot2 = pilotRepo.assignPilot(pilot2Name);
		
		Flight flight = new Flight(pilot1, pilot2, plane);
		
		flights.add(flight);
		
		return flight;
		
	}
	
	public int getFlightCount() {
		return flights.size();
	}

	
	public List<Flight> getAllFlights(){
		return this.flights;
	}
	
	
}
