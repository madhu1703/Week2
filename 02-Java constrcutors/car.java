import java.lang.*;
import java.util.*;
class carRental {
   private String customerName;
   private String carModel;
   private int rentalDays;
   private double rate;
   public carRental(String customerName,String carModel,int rentalDays,double rate)
   {
       this.customerName=customerName;
       this.carModel = carModel;
       this.rentalDays = rentalDays;
       this.rate = rate;
   }
   public double calculateCost()
   {
       return rate*rentalDays;
   }
   public void display()
   {
       System.out.println("Customer name:"+ customerName);
       System.out.println("Car model:"+ carModel);
       System.out.println("Rental days:"+ rentalDays);
       System.out.println("cost:"+ rate);
       System.out.println("Total cost"+ calculateCost());
   }
   public static void main(String[] args)
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the customer name");
       String c=sc.nextLine();
       System.out.println("Car model");
       String m=sc.nextLine();
       System.out.println("Rental days");
       int d=sc.nextInt();
       System.out.println("Cost");
       double ct=sc.nextDouble();
       carRental cr=new carRental(c,m,d,ct);
       cr.display();
   }
}
