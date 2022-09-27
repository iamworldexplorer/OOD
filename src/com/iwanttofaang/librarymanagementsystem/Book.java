package com.iwanttofaang.librarymanagementsystem;

import java.util.UUID;

public class Book {
	
	private UUID id;
	private String title;
	private String author;
	private int availableCopies;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		availableCopies = 0;
	}
	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}
	public UUID getId() {
		return id;
	}
	public int getAvailableCopies() {
		return availableCopies;
	}
	public void setAvailableCopies(int availableCopies) {
		this.availableCopies = availableCopies;
	}
}