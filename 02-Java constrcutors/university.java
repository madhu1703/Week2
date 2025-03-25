import java.lang.*;
import java.util.*;
class student {
   public String rollNumber;
   protected String name;
   private double CGPA;


   public student(String rollNumber, String name, double CGPA) {
       this.rollNumber = rollNumber;
       this.name = name;
       this.CGPA = CGPA;
   }


   public double getCGPA() {
       return CGPA;
   }


   public void setCGPA(double CGPA) {
       if (CGPA >= 0.0 && CGPA <= 10.0) {
           this.CGPA = CGPA;
       } else {
           System.out.println("Invalid CGPA. Please enter a value between 0.0 and 10.0.");
       }
   }


   public void displayDetails() {
       System.out.println("Roll Number: " + rollNumber);
       System.out.println("Name: " + name);
       System.out.println("CGPA: " + CGPA);
   }
}
class PostgraduateStudent extends student {
   private String specialization;
   public PostgraduateStudent(String rollNumber,String name, double CGPA, String specialization)
   {
super(rollNumber,name,CGPA);
this.specialization=specialization;
   }
   public void displayPGDetails() {
       System.out.println("Postgraduate Student Details:");
       System.out.println("Roll Number: " + rollNumber);
       System.out.println("Name: " + name);
       System.out.println("Specialization: " + specialization);
       System.out.println("CGPA: " + getCGPA());
   }
}
public class university
{
   public static void main(String[] args)
   {
       student s=new student("100","a",5.5);
       s.displayDetails();
       PostgraduateStudent pg=new PostgraduateStudent("100","me",9,"CS");
       pg.displayPGDetails();
   }
}
