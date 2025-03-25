import java.lang.*;
import java.util.*;
class person {
   private String name;
   private int age;
   public person(String name,int age)
   {
       this.name=name;
       this.age=age;
   }
   public person(person another)
   {
       this.name=another.name;
       this.age=another.age;
   }
   public String getName() {
       return name;
   }
   public int getAge() {
       return age;
   }
   public void display()
   {
       System.out.println("Name:"+name + "Age:"+ age);
   }
   public static void main(String[] args)
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the name");
       String name=sc.nextLine();
       System.out.println("Enter the age");
       int age=sc.nextInt();
       person per1=new person(name,age);
       person per2=new person(per1);
       per1.display();
       per2.display();
   }
}
