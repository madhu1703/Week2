import java.lang.*;
import java.util.*;
public class Employee {
    static String companyName;
    private String name;
    private final String id;
    private String designation;
    private static int totalEmployees = 0;

    public Employee(String companyName, String name, String id, String designation) {
        Employee.companyName = companyName;
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }
    static int displayTotalEmployees(int n) {
        totalEmployees += n;
        return totalEmployees;
    }
    public void display() {
        System.out.println("Company's name: " + companyName);
        System.out.println("Employee's name: " + name);
        System.out.println("The designation is " + designation);
        System.out.println("Total employees are " + totalEmployees);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the details:");
        Employee e = new Employee("a-z", "Dhoni", "101", "HR");
        displayTotalEmployees(5);
        e.display();
    }
}
