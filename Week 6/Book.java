public class Book {
    public String isbn;
    public String title;
    public String author;
    public boolean isAvailable;

    // Constructor
    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isAvailable = true; // By default, the book is available
    }

    // Method to borrow the book
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have borrowed the book: " + title);
        } else {
            System.out.println("Sorry, the book is currently not available.");
        }
    }

    // Method to return the book
    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("You have returned the book: " + title);
        } else {
            System.out.println("The book was not borrowed.");
        }
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("ISBN: " + isbn);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
    }

    // Main method to test the Book class
    public static void main(String[] args) {
        // Creating a new book
        Book book = new Book("978-0134685991", "Effective Java", "Shikha Kumari");

        // Displaying book details
        book.displayDetails();

        // Borrowing the book
        book.borrowBook();
        
        // Trying to borrow the book again
        book.borrowBook();

        // Returning the book
        book.returnBook();
        
        // Displaying book details again
        book.displayDetails();
    }
}
