import java.lang.*;
import java.util.*;
interface Worker {
    void performDuties();
}
class Person {
    protected String name;
    protected int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}
class Chef extends Person implements Worker {
    private String specialty;

    public Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    @Override
    public void performDuties() {
        super.displayInfo();
        System.out.println("Role: Chef");
        System.out.println("Specialty: " + specialty);
        System.out.println("Duties: Prepares meals, manages kitchen, and ensures food quality.");
    }
}
class Waiter extends Person implements Worker {
    private String shift;

    public Waiter(String name, int id, String shift) {
        super(name, id);
        this.shift = shift;
    }

    @Override
    public void performDuties() {
        super.displayInfo();
        System.out.println("Role: Waiter");
        System.out.println("Shift: " + shift);
        System.out.println("Duties: Takes orders, serves food, and assists customers.");
    }
}
public class RestaurantSystem {
    public static void main(String[] args) {
        System.out.println("=== Chef ===");
        Chef chef = new Chef("Gordon Ramsay", 101, "Italian Cuisine");
        chef.performDuties();

        System.out.println("\n=== Waiter ===");
        Waiter waiter = new Waiter("John", 202, "Evening");
        waiter.performDuties();
    }
}

