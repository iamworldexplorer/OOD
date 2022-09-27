package com.iwanttofaang.librarymanagementsystem;

public class Library {
	
	private String name;
	private String address;
	private BookCatalog bookCatalog;
	
	public Library(String name, String address) {
		this.name = name;
		this.address = address;
		bookCatalog = new BookCatalog();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public BookCatalog getBookCatalog() {
		return bookCatalog;
	}

	public void setBookCatalog(BookCatalog bookCatalog) {
		this.bookCatalog = bookCatalog;
	}
	
	
}