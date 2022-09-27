package com.iwanttofaang.librarymanagementsystem;

import java.util.UUID;

public class BookItem {
	
	private UUID barcode;
	private User userBorrowed;
	private Book book;
	
	public BookItem(Book book) {
		this.userBorrowed = null;
		this.book = book;
	}

	public UUID getBarcode() {
		return barcode;
	}

	public Book getBook() {
		return book;
	}

	public User getUserBorrowed() {
		return userBorrowed;
	}

	public void setUserBorrowed(User userBorrowed) {
		this.userBorrowed = userBorrowed;
	}
}
