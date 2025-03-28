import  java.lang.*;
import java.util.*;
class product {
    private String productName;
    private double price;
    private static int totalProducts=0;
    public product(String productName,double price)
    {
        this.productName=productName;
        this.price=price;
        totalProducts++;
    }
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
    }
    public static void displayTotalProducts()
    {
        System.out.println("Total products"+ totalProducts);
    }
    public static void main(String[] args)
    {
        product product1 = new product("Laptop", 1000);
        product product2 = new product("Smartphone", 499.99);
        product product3 = new product("Headphones", 149.99);
        product1.displayProductDetails();
        product2.displayProductDetails();
        product3.displayProductDetails();
        product.displayTotalProducts();
    }


}
