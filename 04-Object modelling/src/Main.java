import java.lang.*;
import java.util.*;
class Book
{
    private String title;
    private String author;
    public Book(String title,String author)
    {
        this.title=title;
        this.author=author;
    }
    public void setTitle(String title)
    {
        System.out.println("The title is "+ title);
    }
    public String getTitle()
    {
        return title;
    }
    public void setAuthor(String author)
    {
        System.out.println("The author is "+ author);
    }
    public String getAuthor()
    {
        return author;
    }
    public void displayBook()
    {
        System.out.println("The title is "+ title + " and the author is "+ author);
    }
}
class Library
{
    private String name;
    private List<Book>books;
    public Library(String name)
    {
        this.name=name;
        books=new ArrayList<>();
    }
    public void setName(String name)
    {
        System.out.println("The library name is "+ name);
    }
    public String getName()
    {
        return name;
    }
    public void addBook(Book book)
    {
        books.add(book);
    }
    public void displayLibrary()
    {
        System.out.println("Library name:"+ name);
        for(Book b:books)
        {
            b.displayBook();
        }
    }
}
class Main
{
    public static void main(String[] args)
    {
        Book b1 = new Book("The Alchemist", "Paulo Coelho");
        Book b2 = new Book("1984", "George Orwell");
        Library l1 = new Library("City Library");
        Library l2 = new Library("School Library");
        l1.addBook(b1);
        l1.addBook(b2);
        l2.addBook(b1);
        l2.addBook(b2);
        l1.displayLibrary();
        l2.displayLibrary();
    }
}
