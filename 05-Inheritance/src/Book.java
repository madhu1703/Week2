import java.lang.*;
import java.util.*;
class Book {
private String title;
private double publicationYear;
public Book(String title,double publicationYear)
{
    this.title=title;
    this.publicationYear=publicationYear;
}
    public void setTitle(String str)
    {
        this.title=str;
    }
    public void display()
    {
        System.out.println("The title is "+title);
        System.out.println("The published year is "+publicationYear);
    }
}
class Author extends Book{
    private String name;
    private String bio;
    public Author(String title,double publicationYear,String name,String bio)
    {
        super(title,publicationYear);
        this.name=name;
        this.bio=bio;
    }
    @Override
    public void display() {
        super.display();
        System.out.println("Author name: " + name);
        System.out.println("Bio: " + bio);
    }
}
class Management
{
    public static void main(String[] args)
    {
        Author a=new Author("Atomic habits",2020,"James clear","Author of 5 books");
        a.display();
    }
}
