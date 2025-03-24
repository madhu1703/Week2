import java.lang.*;
import java.util.*;
class student {
    private String name;
    private String rollNumber;
    private float marks;
    public student(String name,String rollNumber,float marks)
    {
        this.name=name;
        this.rollNumber=rollNumber;
        this.marks=marks;
    }
    public String grades()
    {
        if(marks>90)
        {
            return "A";
        }
        else if(marks>80&&marks<=90)
        {
            return "B";
        }
        else if(marks>70&&marks<=80)
        {
            return "c";
        }
        else if(marks>60&&marks<=70)
        {
            return "D";
        }
        else return "F";
    }
    public void display()
    {
        System.out.println("Studets report");
        System.out.println("Student name:"+ name);
        System.out.println("Student Roll number:"+ rollNumber);
        System.out.println("Student marks:"+ marks);
        System.out.println("Student grade:"+ grades());
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the student's name ");
        String name=sc.nextLine();
        System.out.println("Enter the student's roll number");
        String rno=sc.nextLine();
        System.out.println("Enter the student's marks");
        float marks=sc.nextFloat();
        student s=new student(name,rno,marks);
        s.display();
    }
}
