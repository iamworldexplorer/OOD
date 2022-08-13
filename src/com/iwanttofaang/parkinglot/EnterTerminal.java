package com.iwanttofaang.parkinglot;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Map;

public class EnterTerminal extends Terminal {
	
	private Map<Long, ParkingSpot> parkingSpots = ParkingLot.getParkingSpots();
	
	public EnterTerminal(long id) {
		super(id);
	}
	
	public Ticket createTicket() {
		Ticket newTicket = new Ticket(EntityIdGenerator.getNextId(), LocalDate.now(),
				LocalTime.now() );
		ParkingLot.addTicket(newTicket);
		for(Map.Entry<Long, ParkingSpot> entry: parkingSpots.entrySet()) {
			if(entry.getValue().isAvailable()) {
				newTicket.assignParkingSpot(entry.getValue());
				break;
			}
		}
		System.out.println("New Ticket. Ticket Number: " + newTicket.getId() + ", Date: " + newTicket.getIssueDate() + ", Time: " + newTicket.getIssueTime());
		return newTicket;
	}
	
	public void printTicket(Ticket ticket) {
		ticket.printTicket();
	}
}