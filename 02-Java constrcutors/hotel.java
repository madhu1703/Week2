import java.lang.*;
import java.util.*;
class hotel {
   private String guestName;
   private String roomType;
   private int nights;
   public hotel()
   {
       this.guestName="a";
       this.roomType="b";
       this.nights=3;
   }
   public hotel(String guestName,String roomType,int nights)
   {
       this.guestName=guestName;
       this.roomType=roomType;
       this.nights=nights;
   }
   public hotel(hotel another)
   {
       this.guestName=another.guestName;
       this.roomType=another.roomType;
       this.nights=another.nights;
   }
   public String getguestName()
   {
       return guestName;
   }
   public String getroomType()
   {
       return roomType;
   }
   public int getnights()
   {
       return nights;
   }
   public void display()
   {
       System.out.println("Name:"+ guestName + "Room type:"+ roomType + "Number of nights:" + nights);
   }
   public static void main(String[] args)
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter name");
       String name=sc.nextLine();
       System.out.println("Room type");
       String roomType=sc.nextLine();
       System.out.println("Number of nights");
       int nights=sc.nextInt();
       hotel d=new hotel();
       System.out.println("The name is "+ d.getguestName());
       System.out.println("The room type is "+ d.getroomType());
       System.out.println("The number of nights is "+ d.getnights());
       hotel h1=new hotel(name,roomType,nights);
       hotel h2=new hotel(h1);
       h1.display();
       h2.display();
   }
}
import java.lang.*;
import java.util.*;
class hotel {
   private String guestName;
   private String roomType;
   private int nights;
   public hotel()
   {
       this.guestName="a";
       this.roomType="b";
       this.nights=3;
   }
   public hotel(String guestName,String roomType,int nights)
   {
       this.guestName=guestName;
       this.roomType=roomType;
       this.nights=nights;
   }
   public hotel(hotel another)
   {
       this.guestName=another.guestName;
       this.roomType=another.roomType;
       this.nights=another.nights;
   }
   public String getguestName()
   {
       return guestName;
   }
   public String getroomType()
   {
       return roomType;
   }
   public int getnights()
   {
       return nights;
   }
   public void display()
   {
       System.out.println("Name:"+ guestName + "Room type:"+ roomType + "Number of nights:" + nights);
   }
   public static void main(String[] args)
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter name");
       String name=sc.nextLine();
       System.out.println("Room type");
       String roomType=sc.nextLine();
       System.out.println("Number of nights");
       int nights=sc.nextInt();
       hotel d=new hotel();
       System.out.println("The name is "+ d.getguestName());
       System.out.println("The room type is "+ d.getroomType());
       System.out.println("The number of nights is "+ d.getnights());
       hotel h1=new hotel(name,roomType,nights);
       hotel h2=new hotel(h1);
       h1.display();
       h2.display();
   }
}
