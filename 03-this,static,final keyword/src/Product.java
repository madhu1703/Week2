import java.lang.*;
import java.util.*;
class Product {
    static int discount;
    private String productName;
    private double price;
    private int quantity;
    private final String productID;
    public Product(String productName,double price,int quantity,String productID)
    {
        this.productName=productName;
        this.price=price;
        this.quantity=quantity;
        this.productID=productID;
    }
    public void updateDiscount()
    {
        if(price>=1000)
        {
            discount=30;
            price=price-(price*discount/100);
            System.out.println("Discount applied! New price: " + price);
        }
    }
    public double totalPrice()
    {
        return price*quantity;
    }
    public void display()
    {
        System.out.println("The product name:"+ productName);
        System.out.println("The price is:"+ price);
        System.out.println("The quantity is:"+ quantity);
        System.out.println("The product ID is:"+ productID);
        System.out.println("The discount is:"+ discount);
        System.out.println("The total price is:"+ totalPrice());
    }
    public static void main(String[] args)
    {
        System.out.println("The details:");
        Product p=new Product("apple",1200,50,"1234");
        p.display();
        p.updateDiscount();
        p.display();
        if(p instanceof Product)
        {
            System.out.println("It is an instance");
        }
        else System.out.println("It is not");
    }
}
