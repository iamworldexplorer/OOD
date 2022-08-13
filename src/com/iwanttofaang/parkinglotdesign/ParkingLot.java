package com.iwanttofaang.parkinglotdesign;

public class ParkingLot {

	private int size;
	private int availableSpotsNumber;
	private PriceList priceList;
	private Terminal terminal;
	
	public ParkingLot(int size, double hourPrice, double nextHourPrice, double dayPrice) {
		this.size = size;
		this.availableSpotsNumber = size;
		priceList = new PriceList(hourPrice, nextHourPrice, dayPrice);
		terminal = new Terminal(priceList);
	}

	public Ticket createTicket() {
		availableSpotsNumber--;
		return new Ticket();
	}
	
	public void printTicket(Ticket ticket) {
		if(ticket != null) {
			ticket.print();
		}
	}
	
	public double scanTicket(Ticket ticket) {
		return terminal.calculatePrice(ticket);
	}
	
	public void processPayment(double price) {
		terminal.printReceipt(price);
		availableSpotsNumber++;
	}
	
	public void displayAvailability() {
		System.out.println("There are " + availableSpotsNumber + " spots available.");
	}
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getAvailableSpotsNumber() {
		return availableSpotsNumber;
	}

	public void setAvailableSpotsNumber(int availableSpotsNumber) {
		this.availableSpotsNumber = availableSpotsNumber;
	}

	public PriceList getPriceList() {
		return priceList;
	}

	public void setPriceList(PriceList priceList) {
		this.priceList = priceList;
	}

	public Terminal getTerminal() {
		return terminal;
	}

	public void setTerminal(Terminal terminal) {
		this.terminal = terminal;
	}
}