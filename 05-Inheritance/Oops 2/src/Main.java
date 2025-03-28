import java.lang.*;
import java.util.*;
class book
{
    private String title;
    private String author;
    private double price;
    public book()//default
    {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }
    public book(String title, String author, double price)//parameterized
    {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public String getTitle()
    {
        return title;
    }
    public String getAuthor()
    {
        return author;
    }
    public double getPrice()
    {
        return price;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }
public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the book name");
    String title=sc.nextLine();
    System.out.println("Enter the book author");
    String author=sc.nextLine();
    System.out.println("Enter the price");
    double price=sc.nextDouble();
    book defaultBook = new book();
    System.out.println("Default Book Details:");
    defaultBook.displayBookInfo();

    book c=new book(title,author,price);
    c.displayBookInfo();
}
}