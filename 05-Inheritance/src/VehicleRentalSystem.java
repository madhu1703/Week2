import java.lang.*;
import java.util.*;
interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}
abstract class Vehicle implements Insurable {
    private String vehicleNumber;
    private String type;
    private double rentalRate;
    private String insurancePolicyNumber;

    public Vehicle(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
        this.insurancePolicyNumber = insurancePolicyNumber;
    }
    public String getVehicleNumber() { return vehicleNumber; }
    public String getType() { return type; }
    public double getRentalRate() { return rentalRate; }
    protected String getPolicyNumberMasked() {
        return "****" + insurancePolicyNumber.substring(insurancePolicyNumber.length() - 4);
    }
    public void displayDetails(int days) {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Type: " + type);
        System.out.println("Rental Rate: " + rentalRate);
        System.out.println("Rental Cost for " + days + " days: " + calculateRentalCost(days));
        System.out.println(getInsuranceDetails());
        System.out.println("--------------------------");
    }
    public abstract double calculateRentalCost(int days);
}
class Car extends Vehicle {
    public Car(String vehicleNumber, double rentalRate, String policy) {
        super(vehicleNumber, "Car", rentalRate, policy);
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days + 200;
    }

    public double calculateInsurance() {
        return 0.05 * getRentalRate();
    }

    public String getInsuranceDetails() {
        return "Insurance Cost: " + calculateInsurance() + ", Policy: " + getPolicyNumberMasked();
    }
}
class Bike extends Vehicle {
    public Bike(String vehicleNumber, double rentalRate, String policy) {
        super(vehicleNumber, "Bike", rentalRate, policy);
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    public double calculateInsurance() {
        return 0.02 * getRentalRate();
    }

    public String getInsuranceDetails() {
        return "Insurance Cost: " + calculateInsurance() + ", Policy: " + getPolicyNumberMasked();
    }
}
class Truck extends Vehicle {
    public Truck(String vehicleNumber, double rentalRate, String policy) {
        super(vehicleNumber, "Truck", rentalRate, policy);
    }

    public double calculateRentalCost(int days) {
        return (getRentalRate() * days) + 500;
    }

    public double calculateInsurance() {
        return 0.08 * getRentalRate();
    }

    public String getInsuranceDetails() {
        return "Insurance Cost: " + calculateInsurance() + ", Policy: " + getPolicyNumberMasked();
    }
}
public class VehicleRentalSystem {
    public static void main(String[] args) {
        Vehicle v1 = new Car("KA01AB1234", 1000.0, "CAR123456789");
        Vehicle v2 = new Bike("KA02CD5678", 300.0, "BIKE987654321");
        Vehicle v3 = new Truck("KA03EF9012", 2500.0, "TRUCK543210987");

        Vehicle[] vehicles = {v1, v2, v3};
        int rentalDays = 3;

        System.out.println("Vehicle Rental Summary:");
        for (Vehicle v : vehicles) {
            v.displayDetails(rentalDays);
        }
    }
}

