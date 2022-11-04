package com.sabanciuniv.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.sabanciuniv.model.Pilot;

@Repository
public class PilotRepo {

	List<Pilot> pilots = new ArrayList<>();
	
	
	public Pilot assignPilot(String name) {
		
		Pilot pilot = new Pilot(name);
		pilots.add(pilot);
		return pilot;
		
	}
	
	public List<Pilot> findAll(){
		return this.pilots;
	}
	
	
	
}
