import java.lang.*;
import java.util.*;
interface Reservable {
    boolean reserveItem(String borrowerName);
    boolean checkAvailability();
}
abstract class LibraryItem implements Reservable {
    private String itemId;
    private String title;
    private String author;
    private boolean isReserved;
    private String borrowerName;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        this.isReserved = false;
        this.borrowerName = null;
    }
    public String getItemId() { return itemId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    protected String getBorrowerInfo() {
        return isReserved ? "Borrowed by: " + borrowerName : "Not borrowed";
    }
    public void getItemDetails() {
        System.out.println("ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Loan Duration: " + getLoanDuration() + " days");
        System.out.println(getBorrowerInfo());
        System.out.println("-----------------------------");
    }
    public boolean reserveItem(String borrowerName) {
        if (!isReserved) {
            this.borrowerName = borrowerName;
            this.isReserved = true;
            return true;
        }
        return false;
    }

    public boolean checkAvailability() {
        return !isReserved;
    }
    public abstract int getLoanDuration();
}
class Book extends LibraryItem {
    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14;
    }
}
class Magazine extends LibraryItem {
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7;
    }
}
class DVD extends LibraryItem {
    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 3;
    }
}
public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryItem item1 = new Book("B001", "The Alchemist", "Paulo Coelho");
        LibraryItem item2 = new Magazine("M001", "National Geographic", "Editorial Team");
        LibraryItem item3 = new DVD("D001", "Inception", "Christopher Nolan");

        LibraryItem[] items = { item1, item2, item3 };

        item1.reserveItem("Alice");
        item3.reserveItem("Bob");

        System.out.println("Library Items Overview:");
        for (LibraryItem item : items) {
            item.getItemDetails();
        }
    }
}

