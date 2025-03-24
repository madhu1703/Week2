import java.lang.*;
import java.util.*;
public class book {
    private String title;
    private String author;
    private double price;
    public book(String title,String author,double price)
    {
        this.title=title;
        this.author=author;
        this.price=price;
    }
    public void display()
    {
        System.out.println("Book details");
        System.out.println("Book name:"+ title);
        System.out.println("Book author:"+ author);
        System.out.println("Book price:"+ price);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the book details");
        String title=sc.nextLine();
        String author=sc.nextLine();
        double price=sc.nextDouble();
        book b=new book(title,author,price);
        b.display();
    }
}
