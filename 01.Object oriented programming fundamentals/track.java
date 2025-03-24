import java.lang.*;
import java.util.*;
class track {
    private String Item;
    private int itemCode;
    private double price;
    public track(String Item,int itemCode,double price)
    {
        this.Item=Item;
        this.itemCode=itemCode;
        this.price=price;
    }
    public void display()
    {
        System.out.println("Track inventory of items");
        System.out.println("Name of the item: "+ Item);
        System.out.println("Item code: "+ itemCode);
        System.out.println("Price of the item "+ price);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the item name");
        String Item=sc.nextLine();
        System.out.println("Enter the item code");
        int itemCode=sc.nextInt();
        System.out.println("Enter the item price");
        double price=sc.nextDouble();
        track t=new track(Item,itemCode,price);
        t.display();
    }
}
