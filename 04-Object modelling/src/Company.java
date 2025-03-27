import java.lang.*;
import java.util.*;
class Employee {
    private String empName;
    private int empId;

    public Employee(String empName, int empId) {
        this.empName = empName;
        this.empId = empId;
    }

    public void display() {
        System.out.println("    Employee ID: " + empId + ", Name: " + empName);
    }
}
class Department {
    private String deptName;
    private Employee[] employees;
    private int empCount;

    public Department(String deptName) {
        this.deptName = deptName;
        this.employees = new Employee[10];
        this.empCount = 0;
    }

    public String getDeptName() {
        return deptName;
    }

    public void addEmployee(String name, int id) {
        if (empCount < employees.length) {
            employees[empCount++] = new Employee(name, id);
        } else {
            System.out.println("  Cannot add more employees to " + deptName);
        }
    }

    public void displayEmployees() {
        System.out.println("  Department: " + deptName);
        for (int i = 0; i < empCount; i++) {
            employees[i].display();
        }
    }
}
class Company {
    private String companyName;
    private Department[] departments;
    private int deptCount;

    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new Department[5];
        this.deptCount = 0;
    }

    public void addDepartment(String deptName) {
        if (deptCount < departments.length) {
            departments[deptCount++] = new Department(deptName);
        } else {
            System.out.println("Cannot add more departments to " + companyName);
        }
    }

    public Department getDepartment(String deptName) {
        for (int i = 0; i < deptCount; i++) {
            if (departments[i].getDeptName().equals(deptName)) {
                return departments[i];
            }
        }
        return null;
    }

    public void displayCompanyStructure() {
        System.out.println("Company: " + companyName);
        for (int i = 0; i < deptCount; i++) {
            departments[i].displayEmployees();
        }
    }

    public void deleteCompany() {
        System.out.println("Deleting company: " + companyName);
        for (int i = 0; i < deptCount; i++) {
            departments[i] = null;
        }
        departments = null;
    }
}
class Main {
    public static void main(String[] args) {
        Company myCompany = new Company("TechNova");

        myCompany.addDepartment("Engineering");
        myCompany.addDepartment("HR");

        Department eng = myCompany.getDepartment("Engineering");
        Department hr = myCompany.getDepartment("HR");

        if (eng != null) {
            eng.addEmployee("Alice", 101);
            eng.addEmployee("Bob", 102);
        }

        if (hr != null) {
            hr.addEmployee("Carol", 201);
        }

        myCompany.displayCompanyStructure();
        myCompany.deleteCompany();

        System.out.println("Trying to display company after deletion:");
        myCompany.displayCompanyStructure();
    }
}

