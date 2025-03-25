import java.lang.*;
import java.util.*;
class Employee {
   public int employeeID;
   protected String department;
   private double salary;
   public Employee(int employeeID,String department,double salary)
   {
       this.employeeID=employeeID;
       this.department=department;
       this.salary=salary;
   }
   public void setSalary(double newSalary) {
       if (newSalary > 0) {
           this.salary = newSalary;
       } else {
           System.out.println("Salary must be positive.");
       }
   }
   public double getSalary() {
       return this.salary;
   }
}
class Manager extends Employee{
   public Manager(int employeeID,String department,double salary)
   {
       super(employeeID,department,salary);
   }
   public void display()
   {
       System.out.println("Manager ID is "+ employeeID);
       System.out.println("Departement is "+ department);
   }
}
class Main{
public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the employee department");
   String dept = sc.nextLine();
   System.out.println("Enter the employee ID");
   int id = sc.nextInt();
   Manager m = new Manager(id, dept, 75000);
   m.display();
}
}
import java.lang.*;
import java.util.*;
class Employee {
   public int employeeID;
   protected String department;
   private double salary;
   public Employee(int employeeID,String department,double salary)
   {
       this.employeeID=employeeID;
       this.department=department;
       this.salary=salary;
   }
   public void setSalary(double newSalary) {
       if (newSalary > 0) {
           this.salary = newSalary;
       } else {
           System.out.println("Salary must be positive.");
       }
   }
   public double getSalary() {
       return this.salary;
   }
}
class Manager extends Employee{
   public Manager(int employeeID,String department,double salary)
   {
       super(employeeID,department,salary);
   }
   public void display()
   {
       System.out.println("Manager ID is "+ employeeID);
       System.out.println("Departement is "+ department);
   }
}
class Main{
public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the employee department");
   String dept = sc.nextLine();
   System.out.println("Enter the employee ID");
   int id = sc.nextInt();
   Manager m = new Manager(id, dept, 75000);
   m.display();
}
}
