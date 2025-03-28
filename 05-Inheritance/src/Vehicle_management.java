import java.lang.*;
import java.util.*;
interface refuelable{
    void refuel();
}
class Vehicle {
    protected String model;
    protected int maxSpeed;

    public Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public void displayInfo() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}
class ElectricVehicle extends Vehicle {
    private int batteryCapacity;

    public ElectricVehicle(String model, int maxSpeed, int batteryCapacity) {
        super(model, maxSpeed);
        this.batteryCapacity = batteryCapacity;
    }

    public void charge() {
        super.displayInfo();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}
class PetrolVehicle extends Vehicle implements refuelable
{
    private int fuelCapacity;

    public PetrolVehicle(String model, int maxSpeed, int fuelCapacity) {
        super(model, maxSpeed);
        this.fuelCapacity = fuelCapacity;
    }

    @Override
    public void refuel() {
        super.displayInfo();
        System.out.println("Fuel Capacity: " + fuelCapacity + " liters");
    }
}
public class VehicleSystem {
    public static void main(String[] args) {
        System.out.println(" Electric Vehicle ");
        ElectricVehicle ev = new ElectricVehicle("Tesla Model 3", 225, 75);
        ev.charge();

        System.out.println("\n Petrol Vehicle ");
        PetrolVehicle pv = new PetrolVehicle("Honda Civic", 200, 40);
        pv.refuel();
    }
}

