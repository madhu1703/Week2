import java.lang.*;
import java.util.*;
interface Department {
    void assignDepartment(String deptName);
    String getDepartmentDetails();
}
abstract class Employee implements Department {
    private int employeeId;
    private String name;
    private double baseSalary;
    private String department;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }
    public int getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public double getBaseSalary() { return baseSalary; }

    public void setEmployeeId(int employeeId) { this.employeeId = employeeId; }
    public void setName(String name) { this.name = name; }
    public void setBaseSalary(double baseSalary) { this.baseSalary = baseSalary; }

    public void displayDetails() {
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Department: " + getDepartmentDetails());
        System.out.println("Total Salary: " + calculateSalary());
        System.out.println("-----------------------");
    }
    public void assignDepartment(String deptName) {
        this.department = deptName;
    }

    public String getDepartmentDetails() {
        return department;
    }
    public abstract double calculateSalary();
}
class FullTimeEmployee extends Employee {
    private double bonus;

    public FullTimeEmployee(int id, String name, double baseSalary, double bonus) {
        super(id, name, baseSalary);
        this.bonus = bonus;
    }

    public double calculateSalary() {
        return getBaseSalary() + bonus;
    }
}
class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int id, String name, double baseSalary, int hoursWorked, double hourlyRate) {
        super(id, name, baseSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public double calculateSalary() {
        return getBaseSalary() + (hoursWorked * hourlyRate);
    }
}
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee emp1 = new FullTimeEmployee(101, "Alice", 50000, 10000);
        emp1.assignDepartment("HR");

        Employee emp2 = new PartTimeEmployee(102, "Bob", 20000, 40, 300);
        emp2.assignDepartment("Support");

        Employee emp3 = new FullTimeEmployee(103, "Charlie", 60000, 15000);
        emp3.assignDepartment("Development");

        Employee[] employees = { emp1, emp2, emp3 };

        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}

