package com.iwanttofaang.parkinglot;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ExitTerminal extends Terminal {

	private PriceList priceList;
	
	public ExitTerminal(long id) {
		super(id);
		priceList = PriceList.getPriceList(0, 0, 0);
	}
	
	public Ticket scanTicket(long ticketId) {
		return ParkingLot.getTicketById(ticketId);
	}
	
	public double calculateTicketPrice(Ticket ticket) {
		LocalDate currentDate = LocalDate.now();
		LocalTime currentTime = LocalTime.now();
		LocalDate issuedDate = ticket.getIssueDate();
		LocalTime issuedTime = ticket.getIssueTime();
		long hoursSpent = issuedTime.until(currentTime, ChronoUnit.HOURS) +
				issuedDate.until(currentDate, ChronoUnit.DAYS) * 8;
		double price = 0;
		if(hoursSpent <= 1) {
			price = priceList.getHourPrice();
		}
		if(hoursSpent > 1 && hoursSpent <= 8) {
			price = priceList.getHourPrice() + priceList.getNextHourPrice() * hoursSpent;
		}
		if(hoursSpent > 8) {
			price = priceList.getDayPrice() * hoursSpent / 8;
		}
		return price;
	}
	
	public String processPayment(Ticket ticket, double price) {
		removeTicket(ticket);
		return "You succesfully paid " + price + " Have a great day!";
	}
	
	public void removeTicket(Ticket ticket) {
		ticket.getParkingSpot().release();
		ParkingLot.removeTicket(ticket);
	}
}
