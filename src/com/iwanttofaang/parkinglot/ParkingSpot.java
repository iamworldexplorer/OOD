package com.iwanttofaang.parkinglot;

public class ParkingSpot {

	private long id;
	private boolean available;
	
	public ParkingSpot(long id) {
		this.id = id;
		available = true;
	}
	
	public long getId() {
		return id;
	}
	
	public boolean isAvailable() {
		return available;
	}
	
	public void assign() {
		available = false;
	}
	
	public void release() {
		available = true;
	}
}
