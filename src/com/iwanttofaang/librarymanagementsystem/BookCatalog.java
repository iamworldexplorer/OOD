package com.iwanttofaang.librarymanagementsystem;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class BookCatalog {

	private List<Book> books;
	
	//<book id, list of copies of the book>
	private Map<UUID, LinkedList<BookItem>> availableBookItems;
	//<bookItem barcode, BookItem>
	private Map<UUID, BookItem> borrowedBookItems;
	
	public BookCatalog() {
		books = new LinkedList<>();
		availableBookItems = new HashMap<>();
		borrowedBookItems = new HashMap<>();
	}
	
	public Book createBook(String title, String author) {
		Book newBook = new Book(title, author);
		books.add(newBook);
		System.out.println("New book has been created: " + newBook.getTitle() + newBook.getAuthor());
		return newBook;
	}
	
	public void createBookCopies(Book book, int numberOfCopies) {
		LinkedList<BookItem> bookCopies = new LinkedList<>();
		for(int i = 0; i < numberOfCopies; i++) {
			bookCopies.add(new BookItem(book));
		}
		availableBookItems.put(book.getId(), bookCopies);
		System.out.println(numberOfCopies + " book copies have been created.");
		book.setAvailableCopies(numberOfCopies);
	}
	
	public Book searchBook(String searchParameter) {
		if(searchParameter == null) {
			return null;
		}
		for(Book book: books) {
			if(searchParameter.equals(book.getTitle()) || searchParameter.equals(book.getAuthor())) {
				System.out.println(book.getTitle() + ", " + book.getAuthor());
				return book;
			}
		}
		System.out.println("The book has not been found. Please try other title or author.");
		return null;
	}
	
	public BookItem borrowBook(Book book, User user) {
		if(book == null) {
			return null;
		}
		LinkedList<BookItem> availableBookCopies = availableBookItems.get(book.getId());
		if(availableBookCopies == null || availableBookCopies.size() == 0) {
			System.out.println("There is no available copy of the book with title " + 
					book.getTitle() + " by " + book.getAuthor());
			return null;
		}
		BookItem bookItem = availableBookItems.get(book.getId()).removeFirst();
		bookItem.setUserBorrowed(user);
		borrowedBookItems.put(bookItem.getBarcode(), bookItem);
		System.out.println("The " + bookItem.getBook().getTitle() + " has been borrowed by " + user.getName());
		book.setAvailableCopies(book.getAvailableCopies() - 1);
		return bookItem;
	}
	
	public void returnBookItem(BookItem bookItem) {
		if(bookItem == null) {
			return;
		}
		Book book = bookItem.getBook();
		availableBookItems.get(book.getId()).add(bookItem);
		borrowedBookItems.remove(bookItem.getBarcode());
		System.out.println("The " + book.getTitle() + " has been returned by " + bookItem.getUserBorrowed().getName());
		bookItem.setUserBorrowed(null);
		book.setAvailableCopies(book.getAvailableCopies() + 1);
	}
	
}