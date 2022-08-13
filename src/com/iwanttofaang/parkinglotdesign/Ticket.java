package com.iwanttofaang.parkinglotdesign;

import java.time.LocalDate;
import java.time.LocalTime;

public class Ticket {

	private LocalDate issueDate;
	private LocalTime issueTime;
	
	public Ticket() {
		issueDate = LocalDate.now();
		issueTime = LocalTime.now();
	}
	
	public void print() {
		System.out.println("Welcome to our Parking Lot");
		System.out.println("Date of Parking is " + issueDate);
		System.out.println("Time of Parking is " + issueTime);
	}

	public LocalDate getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(LocalDate issueDate) {
		this.issueDate = issueDate;
	}

	public LocalTime getIssueTime() {
		return issueTime;
	}

	public void setIssueTime(LocalTime issueTime) {
		this.issueTime = issueTime;
	}
	
}
