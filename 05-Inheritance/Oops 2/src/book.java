import java.lang.*;
import java.util.*;
class book {
    private String title;
    private String author;
    private double price;
    private boolean availability;
    public book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = true;
    }
    public void borrowBook() {
        if (availability ) {
            availability  = false;
            System.out.println("You have successfully borrowed: " + title);
        } else {
            System.out.println(title + "is currently not available.");
        }
    }
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Availability: " + (availability ? "Available" : "Not Available"));

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        book book1 = new book("Java", "James Gosling", 45.99);
        book book2 = new book("Python", "Guido van Rossum", 39.99);
        book1.displayDetails();
        book2.displayDetails();
        System.out.println("Enter the book title you want to borrow:");
        String bookToBorrow = scanner.nextLine();
        if (bookToBorrow.equalsIgnoreCase(book1.title)) {
            book1.borrowBook();
        } else if (bookToBorrow.equalsIgnoreCase(book2.title)) {
            book2.borrowBook();
        } else {
            System.out.println("Book not found.");
        }

        scanner.close();
    }
}
