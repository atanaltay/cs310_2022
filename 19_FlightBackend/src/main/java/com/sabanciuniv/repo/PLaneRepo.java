package com.sabanciuniv.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.sabanciuniv.model.Plane;

@Repository
public class PLaneRepo {

	List<Plane> planes = new ArrayList<>();
	
	public Plane assignPlane(String name, String type) {
		Plane plane = new Plane(name, type);
		planes.add(plane);
		return plane;

	}
	
	public List<Plane> findAll(){
		return this.planes;
	}
	
	
}
