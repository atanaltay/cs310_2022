package com.sabanciuniv.model;

//Entity
public class Flight {
	
	private Pilot pilot1;
	private Pilot pilot2;
	private Plane plane;
	
	public Flight() {
		// TODO Auto-generated constructor stub
	}
	

	public Flight(Pilot pilot1, Pilot pilot2, Plane plane) {
		super();
		this.pilot1 = pilot1;
		this.pilot2 = pilot2;
		this.plane = plane;
	}




	public Pilot getPilot1() {
		return pilot1;
	}
	public void setPilot1(Pilot pilot1) {
		this.pilot1 = pilot1;
	}
	public Pilot getPilot2() {
		return pilot2;
	}
	public void setPilot2(Pilot pilot2) {
		this.pilot2 = pilot2;
	}
	public Plane getPlane() {
		return plane;
	}
	public void setPlane(Plane plane) {
		this.plane = plane;
	}
	
	

}
