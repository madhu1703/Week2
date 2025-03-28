import java.lang.*;
import java.util.*;
class Employee {
    private String name;
    private String id;
    private double salary;
    public Employee(String name,String id,double salary)
    {
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    public void display()
    {
        System.out.println("Name:"+name);
        System.out.println("id"+id);
        System.out.println("Salary:"+salary);
    }
}
class Manager extends Employee
{
    private int teamSize;
    public Manager(String name,String id,double salary,int teamSize)
    {
        super(name,id,salary);
        this.teamSize=teamSize;
    }
    public void setTeamSize(int n)
    {
        this.teamSize=n;
    }
    public void getTeamSize()
    {
        System.out.println("Team size:"+teamSize);
    }
}
class Developer extends Employee{
    private String programmingLanguage;
    public Developer(String name,String id,double salary,String programmingLanguage)
    {
        super(name,id,salary);
        this.programmingLanguage=programmingLanguage;
    }
    public void setPL(String str)
    {
        this.programmingLanguage=str;
    }
    public void getPL()
    {
        System.out.println("Programming language known:"+programmingLanguage);
    }
}
class Intern extends Employee{
    private String skills;
    public Intern(String name,String id,double salary,String skills)
    {
        super(name,id,salary);
        this.skills=skills;
    }
    public void setIntern(String s2)
    {
        this.skills=s2;
    }
   public void getIntern()
   {
       System.out.println("Skills:"+skills);
   }
}
class Main
{
    public static void main(String[] args)
    {
        Manager m=new Manager("arnav","ra123",75000,5);
        m.display();
        m.getTeamSize();
        Developer d = new Developer("Riya", "DE456", 60000, "Java");
        d.display();
        d.getPL();
        Intern i = new Intern("Kunal", "IN789", 20000, "Communication, Java Basics");
        i.display();
        i.getIntern();
    }
}
