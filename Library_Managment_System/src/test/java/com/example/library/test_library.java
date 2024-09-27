package com.example.library;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTests {

	private BookLibrary bookLibrary;
	private LibraryBook book1;
	private LibraryBook book2;

	@BeforeEach
	void setUp() {
		bookLibrary = new BookLibrary();
		book1 = new LibraryBook("978-0132350884", "Clean Code: A Handbook of Agile Software Craftsmanship", "Robert C. Martin", 2008);
		book2 = new LibraryBook("978-0262033848", "Introduction to Algorithms", "Thomas H. Cormen", 2009);

		bookLibrary.addLibraryBook(book1);
		bookLibrary.addLibraryBook(book2);
	}

	@Test
	void testListAvailableBooks() {
		assertEquals(2, bookLibrary.listAvailableBooks().size(), "There should be 2 available books.");
	}

	@Test
	void testBorrowAllBooks() {
		bookLibrary.borrowLibraryBook("978-0132350884");
		bookLibrary.borrowLibraryBook("978-0262033848");
		assertTrue(book1.isCurrentlyBorrowed(), "Book 1 should be borrowed.");
		assertTrue(book2.isCurrentlyBorrowed(), "Book 2 should be borrowed.");
	}

//	@Test
//	void testBorrowBookAlreadyBorrowed() {
//		bookLibrary.borrowLibraryBook("978-0132350884");
//		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
//			bookLibrary.borrowLibraryBook("978-0132350884"); // Attempt to borrow again
//		});
//
//		String expectedMessage = "This book is already borrowed.";
//		assertEquals(expectedMessage, exception.getMessage(), "Borrowing an already borrowed book should throw an exception.");
//	}

	@Test
	void testReturnBookNotInLibrary() {
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
			bookLibrary.returnLibraryBook("123-4567890123"); // Non-existent ISBN
		});

		String expectedMessage = "This book was not borrowed or does not exist.";
		assertEquals(expectedMessage, exception.getMessage(), "Returning a book not in the library should throw an exception.");
	}

	@Test
	void testViewAvailableBooksAfterBorrowing() {
		bookLibrary.borrowLibraryBook("978-0132350884");
		assertEquals(1, bookLibrary.listAvailableBooks().size(), "There should be 1 available book after borrowing one.");
	}

//	@Test
//	void testAddDuplicateBook() {
//		bookLibrary.addLibraryBook(book1);
//		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
//			bookLibrary.addLibraryBook(book1); // Attempt to add the same book
//		});
//
//		String expectedMessage = "This book already exists in the library.";
//		assertEquals(expectedMessage, exception.getMessage(), "Adding a duplicate book should throw an exception.");
//	}

	@Test
	void testViewAllBooksCount() {
		assertEquals(2, bookLibrary.getAllLibraryBooks().size(), "The total count of books in the library should be 2.");
	}
}
