package com.iwanttofaang.parkinglotdesign;

public class ParkingLotSystem {

	public static void main(String[] args) {
		ParkingLot parkingLot = new ParkingLot(200, 3, 2.5, 9);
		parkingLot.displayAvailability();
		Ticket ticket = parkingLot.createTicket();
		parkingLot.printTicket(ticket);
		Ticket ticket1 = parkingLot.createTicket();
		parkingLot.printTicket(ticket1);
		parkingLot.displayAvailability();
		double price = parkingLot.getTerminal().calculatePrice(ticket);
		parkingLot.processPayment(price);
		
		parkingLot.displayAvailability();
	}
}


