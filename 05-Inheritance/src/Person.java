import java.lang.*;
import java.util.*;
class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void displayRole() {
        super.displayDetails();
        System.out.println("Role: Teacher");
        System.out.println("Subject: " + subject);
    }
}
class Student extends Person {
    private String grade;

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    public void displayRole() {
        super.displayDetails();
        System.out.println("Role: Student");
        System.out.println("Grade: " + grade);
    }
}
class Staff extends Person {
    private String department;

    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    public void displayRole() {
        super.displayDetails();
        System.out.println("Role: Staff");
        System.out.println("Department: " + department);
    }
}
public class SchoolSystem {
    public static void main(String[] args) {
        System.out.println("Teacher");
        Teacher teacher = new Teacher("Mr. Ravi", 40, "Mathematics");
        teacher.displayRole();

        System.out.println("\n Student ");
        Student student = new Student("Anjali", 16, "10th Grade");
        student.displayRole();

        System.out.println("\n Staff ");
        Staff staff = new Staff("Mrs. Latha", 35, "Administration");
        staff.displayRole();
    }
}
