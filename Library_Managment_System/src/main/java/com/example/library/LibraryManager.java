package com.example.library;

import java.util.Scanner;

public class LibraryManager {

	public static void main(String[] args) {
		BookLibrary bookLibrary = new BookLibrary();
		Scanner scanner = new Scanner(System.in);
		boolean isActive = true;

		while (isActive) {
			System.out.println("\nLibrary Management System");
			System.out.println("1. Add a Book");
			System.out.println("2. Borrow a Book");
			System.out.println("3. Return a Book");
			System.out.println("4. View Available Books");
			System.out.println("5. Exit");
			System.out.print("Select an option: ");
			int option = scanner.nextInt();
			scanner.nextLine(); // Consume the newline character

			switch (option) {
				case 1:
					System.out.print("Enter ISBN: ");
					String isbn = scanner.nextLine();
					System.out.print("Enter Title: ");
					String title = scanner.nextLine();
					System.out.print("Enter Author: ");
					String author = scanner.nextLine();
					System.out.print("Enter Publication Year: ");
					int year = scanner.nextInt();
					bookLibrary.addLibraryBook(new LibraryBook(isbn, title, author, year));
					System.out.println("Book successfully added!");
					break;

				case 2:
					System.out.print("Enter ISBN to borrow: ");
					isbn = scanner.nextLine();
					try {
						bookLibrary.borrowLibraryBook(isbn);
						System.out.println("Book successfully borrowed!");
					} catch (IllegalArgumentException e) {
						System.out.println(e.getMessage());
					}
					break;

				case 3:
					System.out.print("Enter ISBN to return: ");
					isbn = scanner.nextLine();
					try {
						bookLibrary.returnLibraryBook(isbn);
						System.out.println("Book successfully returned!");
					} catch (IllegalArgumentException e) {
						System.out.println(e.getMessage());
					}
					break;

				case 4:
					System.out.println("Available books:");
					bookLibrary.listAvailableBooks();
					break;

				case 5:
					isActive = false;
					System.out.println("Exiting the system. Goodbye!");
					break;

				default:
					System.out.println("Invalid option. Please try again.");
			}
		}
		scanner.close();
	}
}
