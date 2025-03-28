import java.lang.*;
import java.util.*;
class BookLibrary {
    public String ISBN;
    protected String title;
    private String author;
    public BookLibrary(String ISBN, String title,String author)
    {
        this.ISBN=ISBN;
        this.title=title;
        this.author=author;
    }
    public String getAuthor()
    {
        return author;
    }
    public void setAuthor(String author)
    {
        this.author=author;
    }
    public void display()
    {
        System.out.println("The ISBN number is "+ ISBN);
        System.out.println("The title is "+ title);
        System.out.println("The author is "+author);
    }
}
class EBook extends BookLibrary {
    private double fileSize;

    public EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    public void displayEBookDetails() {
        System.out.println("E-Book Details:");
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("File Size: " + fileSize + "MB");
    }
}
class library
{
    public static void main(String[] args)
    {
        BookLibrary b=new BookLibrary("123-446","atomic","james clear");
        b.display();
        b.setAuthor("jp");
        System.out.println("Updated");
        EBook e=new EBook("123-123","java","myself",5.4);
        e.displayEBookDetails();

    }
}
