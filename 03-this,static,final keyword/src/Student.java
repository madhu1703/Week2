import java.lang.*;
import java.util.*;
class Student {
    static String universityName;
    private String name;
    private final String rollNumber;
    private String grade;
    private static int totalStudents=0;
    public Student(String universityName,String name,String rollNumber,String grade)
    {
        this.universityName=universityName;
        this.name=name;
        this.rollNumber=rollNumber;
        this.grade=grade;
    }
    static int dislayTotalStudents(int n)
    {
        totalStudents+=n;
        return totalStudents;
    }
    public void display()
    {
        System.out.println("University name:"+universityName);
        System.out.println("Student's name:"+name);
        System.out.println("Roll number:"+rollNumber);
        System.out.println("grade:"+grade);
        System.out.println("Total students:"+ dislayTotalStudents(5));
    }
    public static void main(String[] args)
    {
        Student s=new Student("SRM","xxx","12345","10th");
        s.display();
        if(s instanceof Student)
        {
            System.out.println("It is instance");
        }
        else System.out.println("It is not an instance");
    }

}
