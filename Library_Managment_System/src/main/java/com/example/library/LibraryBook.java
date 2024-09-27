package com.example.library;

public class LibraryBook {
    private String isbnNumber;
    private String bookTitle;
    private String bookAuthor;
    private int yearOfPublication;
    private boolean isCurrentlyBorrowed;

    public LibraryBook(String isbnNumber, String bookTitle, String bookAuthor, int yearOfPublication) {
        this.isbnNumber = isbnNumber;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.yearOfPublication = yearOfPublication;
        this.isCurrentlyBorrowed = false;
    }

    // Retrieves the ISBN number of the book
    public String getIsbnNumber() {
        return isbnNumber;
    }

    // Retrieves the title of the book
    public String getBookTitle() {
        return bookTitle;
    }

    // Retrieves the author of the book
    public String getBookAuthor() {
        return bookAuthor;
    }

    // Retrieves the year of publication of the book
    public int getYearOfPublication() {
        return yearOfPublication;
    }

    // Checks if the book is currently borrowed
    public boolean isCurrentlyBorrowed() {
        return isCurrentlyBorrowed;
    }

    // Updates the borrowing status of the book
    public void setBorrowedStatus(boolean isBorrowed) {
        this.isCurrentlyBorrowed = isBorrowed;
    }

    // Provides a string representation of the LibraryBook object
    @Override
    public String toString() {
        return "LibraryBook{" +
                "isbnNumber='" + isbnNumber + '\'' +
                ", bookTitle='" + bookTitle + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                ", isCurrentlyBorrowed=" + isCurrentlyBorrowed +
                '}';
    }
}
