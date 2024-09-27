package com.example.library;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class BookLibrary {
    private final Map<String, LibraryBook> libraryBooks = new HashMap<>();

    // Adds a new book to the library
    public void addLibraryBook(LibraryBook book) {
        libraryBooks.put(book.getIsbnNumber(), book);
    }

    // Borrows a book by its ISBN
    public void borrowLibraryBook(String isbn) {
        LibraryBook book = libraryBooks.get(isbn);
        if (book != null && !book.isCurrentlyBorrowed()) {
            book.setBorrowedStatus(true);
        } else {
            throw new IllegalArgumentException("This book is not available for borrowing.");
        }
    }

    // Returns a borrowed book by its ISBN
    public void returnLibraryBook(String isbn) {
        LibraryBook book = libraryBooks.get(isbn);
        if (book != null && book.isCurrentlyBorrowed()) {
            book.setBorrowedStatus(false);
        } else {
            throw new IllegalArgumentException("This book was not borrowed or does not exist.");
        }
    }

    // Lists all available books in the library
    public List<LibraryBook> listAvailableBooks() {
        List<LibraryBook> availableBooks = new ArrayList<>();
        for (LibraryBook book : libraryBooks.values()) {
            if (!book.isCurrentlyBorrowed()) {
                availableBooks.add(book);
            }
        }
        if (availableBooks.isEmpty()) {
            System.out.println("No books are currently available.");
        } else {
            System.out.println("Available Books:");
            for (LibraryBook book : availableBooks) {
                System.out.println(book);
            }
        }

        return availableBooks;
    }

    // Retrieves all books in the library
    public Map<String, LibraryBook> getAllLibraryBooks() {
        return libraryBooks;
    }
}
