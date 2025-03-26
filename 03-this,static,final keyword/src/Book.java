import java.lang.*;
import java.util.*;
class Book {
    static String libraryName;
    private String title;
    private String author;
    private final String ISBN;
    public Book(String libraryName,String title,String author,String ISBN)
    {
        this.libraryName=libraryName;
        this.title=title;
        this.author=author;
        this.ISBN=ISBN;
    }
    static void displayLibraryName()
    {
        System.out.println(libraryName);
    }
    public void display()
    {
        System.out.println("The library name is "+ libraryName);
        System.out.println("The title of the book is "+ title);
        System.out.println("The author name is "+ author);
        System.out.println("The ISBN number is "+ISBN);
    }
    public static void main(String[] args) {
        System.out.println("The details are:");
        Book b = new Book("TN library", "Atomic habits", "James clear", "123456789012");
        if (b instanceof Book) {
            System.out.println("It is an instance");
        } else {
            System.out.println("It is not");
        }
        b.display();
    }
}
