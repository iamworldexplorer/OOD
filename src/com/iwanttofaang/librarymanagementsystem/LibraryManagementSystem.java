package com.iwanttofaang.librarymanagementsystem;

public class LibraryManagementSystem {

	public static void main(String[] args) {
		Library library = new Library("Central Library", "111 Main Street");
		BookCatalog bookCatalog = library.getBookCatalog();
		Book book = bookCatalog.createBook("New Title", "Author Name");
		System.out.println("There are " + book.getAvailableCopies() +
				" available copies of the " + book.getTitle() + " book");
		int numberOfCopies = 30;
		bookCatalog.createBookCopies(book, numberOfCopies);
		System.out.println("There are " + book.getAvailableCopies() +
				" available copies of the " + book.getTitle() + " book");
		User userRachel = new User("rachelgreen@gmail.com", "Rachel Green");
		User userRoss = new User("rossgellar@gmail.com", "Ross Gellar");
		BookItem bookItemRachel = bookCatalog.borrowBook(book, userRachel);
		System.out.println("There are " + book.getAvailableCopies() +
				" available copies of the " + book.getTitle() + " book");
		BookItem bookItemRoss = bookCatalog.borrowBook(book, userRoss);
		System.out.println("There are " + book.getAvailableCopies() +
				" available copies of the " + book.getTitle() + " book");
		bookCatalog.returnBookItem(bookItemRoss);
		System.out.println("There are " + book.getAvailableCopies() +
				" available copies of the " + book.getTitle() + " book");
	}
}