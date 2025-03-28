import java.lang.*;
import java.util.*;
interface Taxable {
    double calculateTax();
    String getTaxDetails();
}
abstract class Product
{
    private String productID;
    private String name;
    private double price;
    public Product(String productID,String name,double price)
    {
        this.productID=productID;
        this.name=name;
        this.price=price;
    }
    public String getProductId() {
        return productID;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void displayProduct() {
        System.out.println("Product ID: " + productID);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }

    public abstract double calculateDiscount();
}
class Electronics extends Product implements Taxable
{
    public Electronics(String productID,String name,double price) {
        super(productID, name, price);
    }
    public double calculateDiscount() {
        return getPrice() * 0.1;
    }

    public double calculateTax() {
        return getPrice() * 0.18;
    }

    public String getTaxDetails() {
        return "Electronics Tax (18%):" + calculateTax();
    }
}
class Clothing extends Product implements Taxable{
    public Clothing(String productID,String name,double price)
    {
        super(productID,name,price);
    }
    public double calculateDiscount()
    {
        return getPrice()*0.1;
    }
    public double calculateTax()
    {
        return getPrice()*0.05;
    }
    public String getTaxDetails()
    {
        return "Clothing tax(5%)"+ calculateTax();
    }
}
class Groceries extends Product implements Taxable{
    public Groceries(String productID,String name,double price)
    {
        super(productID,name,price);
    }
    public double calculateDiscount()
    {
        return getPrice()*0.1;
    }
    public double calculateTax()
    {
        return getPrice()*0.15;
    }
    public String getTaxDetails()
    {
        return "Groceries tax(15%)"+ calculateTax();
    }
}
class ECommercePlatform {
    public static void printFinalPrice(Product product) {
        product.displayProduct();

        double discount = product.calculateDiscount();
        double tax = (product instanceof Taxable) ? ((Taxable) product).calculateTax() : 0.0;
        double finalPrice = product.getPrice() + tax - discount;

        System.out.println("Discount:" + discount);
        if (product instanceof Taxable) {
            System.out.println(((Taxable) product).getTaxDetails());
        } else {
            System.out.println("No tax applicable.");
        }
        System.out.println("Final Price:" + finalPrice);
        System.out.println("--------------------------------");
    }

    public static void main(String[] args) {
        Product p1 = new Electronics("E101", "Smartphone", 25000);
        Product p2 = new Clothing("C202", "T-Shirt", 1000);
        Product p3 = new Groceries("G303", "Rice Bag", 800);

        Product[] products = {p1, p2, p3};

        System.out.println("E-Commerce Product Summary:");
        for (Product p : products) {
            printFinalPrice(p);
        }
    }
}