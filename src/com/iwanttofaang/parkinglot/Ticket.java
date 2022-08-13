package com.iwanttofaang.parkinglot;

import java.time.LocalDate;
import java.time.LocalTime;

public class Ticket {
	
	private long id;
	private ParkingSpot parkingSpot;
	private LocalDate issueDate;
	private LocalTime issueTime;
	private PriceList priceList;
	
	
	public Ticket(long id, LocalDate issueDate, LocalTime issueTime) {
		this.id = id;
		this.issueDate = issueDate;
		this.issueTime = issueTime;
		priceList = PriceList.getPriceList(0, 0, 0);
	}
	
	public long getId() {
		return id;
	}
	
	public LocalDate getIssueDate() {
		return issueDate;
	}
	
	public LocalTime getIssueTime() {
		return issueTime;
	}
	
	public void assignParkingSpot(ParkingSpot parkingSpot) {
		this.parkingSpot = parkingSpot;
		this.parkingSpot.assign();
	}
	
	public ParkingSpot getParkingSpot() {
		return this.parkingSpot;
	}
	
	public void printTicket() {
		System.out.println("Ticket Number: " + id);
		System.out.println("Issued Date and Time: " + issueDate);
		System.out.println("Prices: " + priceList.print());
	}
}
