package com.iwanttofaang.parkinglot;

import java.util.HashMap;
import java.util.Map;

public class ParkingLot {
	
	private static Map<Long, ParkingSpot> parkingSpots;
	private Map<Long, EnterTerminal> enterTerminals;
	private Map<Long, ExitTerminal> exitTerminals;
	private static Map<Long, Ticket> tickets;
	private PriceList priceList;
	private static long entityId;
	private int size;
	
	public ParkingLot(double hourPrice, double nextHourPrice, double eightHourPrice, int size) {
		parkingSpots = new HashMap<Long, ParkingSpot>();
		enterTerminals = new HashMap<Long, EnterTerminal>();
		exitTerminals = new HashMap<Long, ExitTerminal>();
		tickets = new HashMap<Long, Ticket>();
		priceList = PriceList.getPriceList(hourPrice, nextHourPrice, eightHourPrice);
		entityId = 1;
		this.size = size;
		
		for(int i = 0; i < size; i++) {
			addParkingSpot();
		}
	}
	
	public static Map<Long, ParkingSpot> getParkingSpots() {
		return parkingSpots;
	}
	
	public Map<Long, EnterTerminal> getEnterTerminals() {
		return enterTerminals;
	}
	
	public Map<Long, ExitTerminal> getExitTerminals() {
		return exitTerminals;
	}
	
	public ParkingSpot getParkingSpotById(long id) {
		return parkingSpots.get(id);
	}
	
	public EnterTerminal getEnterTerminalById(long id) {
		return enterTerminals.get(id);
	}
	
	public ExitTerminal getExitTerminalById(long id) {
		return exitTerminals.get(id);
	}
	
	public static Ticket getTicketById(long id) {
		return tickets.get(id);
	}
	
	public long getNextEntityId() {
		return ++entityId;
	}
	
	public void addParkingSpot() {
		ParkingSpot newParkingSpot = new ParkingSpot(getNextEntityId());
		parkingSpots.put(newParkingSpot.getId(), newParkingSpot);
	}
	
	public EnterTerminal addEnterTerminal() {
		EnterTerminal newTerminal = new EnterTerminal(getNextEntityId());
		enterTerminals.put(newTerminal.getId(), newTerminal);
		return newTerminal;
	}
	
	public ExitTerminal addExitTerminal() {
		ExitTerminal newTerminal = new ExitTerminal(getNextEntityId());
		exitTerminals.put(newTerminal.getId(), newTerminal);
		return newTerminal;
	}
	
	public static void addTicket(Ticket ticket) {
		tickets.put(ticket.getId(), ticket);
	}
	
	public static void removeTicket(Ticket ticket) {
		tickets.remove(ticket.getId());
	}
}
