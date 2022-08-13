package com.iwanttofaang.parkinglot;

public class ParkingLotSystem {

	public static void main(String[] args) {
		ParkingLot parkingLot = new ParkingLot(3, 2.5, 6, 101);
		EnterTerminal enterTerminal = parkingLot.addEnterTerminal();
		Ticket ticket1 = enterTerminal.createTicket();
		Ticket ticket2 = enterTerminal.createTicket();
		Ticket ticket3 = enterTerminal.createTicket();
		ExitTerminal exitTerminal = parkingLot.addExitTerminal();
		Ticket ticket = exitTerminal.scanTicket(ticket2.getId());
		double price = exitTerminal.calculateTicketPrice(ticket);
		System.out.println("Ticket #" + ticket.getId() + " price is: " + price);
		exitTerminal.processPayment(ticket, price);
	}
}





