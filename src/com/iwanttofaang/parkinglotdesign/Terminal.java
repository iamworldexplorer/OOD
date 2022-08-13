package com.iwanttofaang.parkinglotdesign;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Terminal {
	
	private PriceList priceList;
	
	public Terminal(PriceList priceList) {
		this.priceList = priceList;
	}
	
	public double calculatePrice(Ticket ticket) {
		if(ticket == null) {
			return 0;
		}
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
	
	public void printReceipt(double price) {
		System.out.println("Payment has been completed successfully. The amount paid: " + price);
		System.out.println("Thank you for staying at our parking. Have a great day!");
	}
}

