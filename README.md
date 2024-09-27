# KATA: Library Management System

## Objective

This project is a simple **Library Management System** built with Java that allows users to:
- Add books to the library
- Borrow books (with availability checks)
- Return borrowed books
- View a list of available books

## Features

1. **Add Books**:  
   - Users can add new books to the library with a unique ISBN, title, author, and publication year.

2. **Borrow Books**:  
   - Users can borrow books if available.  
   - The system checks if the book is available before borrowing and throws an error if it's not available.

3. **Return Books**:  
   - Users can return borrowed books, and the system updates the availability.

4. **View Available Books**:  
   - Users can view a list of all books that are currently available in the library.

  
## Project Structure

```bash
src/
├── main/
│   └── java/
│       └── com/library/management/
|           ├── BookLibrary.java
│           ├── LibraryBook.java
│           ├── LibraryManager.java
│
└── test/
    └── java/
        └── com/library/management/
            └── LibraryTests.java

```


## Git Workflow
1. **Initialize Git repository:**
   ```sh
   git init
   ```

2. **Create a new branch:**
   ```sh
   git checkout -b feature/your-feature
   ```

3. **Stage and commit changes:**
   ```sh
   git add .
   git commit -m "Your commit message"
   ```

4. **Push changes to the remote repository:**
   ```sh
   git push remote origin feature/your-feature
   ```

5. Create a Pull Request on GitHub to merge changes into the main branch.

## Test cases

Here is the output of the test cases that executed successfully:

![Test Output](https://github.com/Mahesh33217/LMS/blob/86eb3108dc4b259719577439ed747ce46bdfe407/Screenshot%202024-09-27%20115115.png)


 <p align='center'>Visitors Count <br><img align="center" alt="Repo Visitors" src="https://profile-counter.glitch.me/LMS/count.svg"/></p>









