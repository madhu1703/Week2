import java.lang.*;
import java.util.*;
class Vehicle {
    protected int maxSpeed;
    protected String fuelType;

    public Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    public void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Fuel Type: " + fuelType);
    }
}

class Car extends Vehicle {
    private int seatCapacity;

    public Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Car Info:");
        super.displayInfo();
        System.out.println("Seat Capacity: " + seatCapacity);
        System.out.println();
    }
}

class Truck extends Vehicle {
    private double loadCapacity;

    public Truck(int maxSpeed, String fuelType, double loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Truck Info:");
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
        System.out.println();
    }
}

class Motorcycle extends Vehicle {
    private boolean hasCarrier;

    public Motorcycle(int maxSpeed, String fuelType, boolean hasCarrier) {
        super(maxSpeed, fuelType);
        this.hasCarrier = hasCarrier;
    }

    @Override
    public void displayInfo() {
        System.out.println("Motorcycle Info:");
        super.displayInfo();
        System.out.println("Has Carrier: " + (hasCarrier ? "Yes" : "No"));
        System.out.println();
    }
}

public class Expression {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new Car(180, "Petrol", 5);
        vehicles[1] = new Truck(120, "Diesel", 15.5);
        vehicles[2] = new Motorcycle(150, "Petrol", true);

        for (Vehicle v : vehicles) {
            v.displayInfo();
        }
    }
}

