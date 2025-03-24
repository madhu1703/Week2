import java.lang.*;
import java.util.*;
class mobile {
    private String brand;
    private String model;
    private double price;
    public mobile(String brand,String model,double price)
    {
        this.brand=brand;
        this.model=model;
        this.price=price;
    }
    public void display()
    {
        System.out.println("The mobile details");
        System.out.println("Brand name:"+ brand);
        System.out.println("Brand model:"+ model);
        System.out.println("Brand price:"+ price);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the mobile brand");
        String brand=sc.nextLine();
        System.out.println("Enter the model name");
        String model=sc.nextLine();
        System.out.println("Enter the mobile price");
        double price=sc.nextDouble();
        mobile m=new mobile(brand,model,price);
        m.display();
    }
}
