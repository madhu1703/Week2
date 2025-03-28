import java.lang.*;
import java.util.*;
interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}
abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }
    public String getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }
    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public void setRatePerKm(double ratePerKm) {
        this.ratePerKm = ratePerKm;
    }
    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver: " + driverName);
        System.out.println("Rate per KM: ₹" + ratePerKm);
    }
    public abstract double calculateFare(double distance);
}
class Car extends Vehicle implements GPS {
    private String location;

    public Car(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    @Override
    public String getCurrentLocation() {
        return location;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.location = newLocation;
    }
}
class Bike extends Vehicle implements GPS {
    private String location;

    public Bike(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    @Override
    public String getCurrentLocation() {
        return location;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.location = newLocation;
    }
}
class Auto extends Vehicle implements GPS {
    private String location;

    public Auto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        double fare = distance * getRatePerKm();
        return fare < 30 ? 30 : fare;
    }

    @Override
    public String getCurrentLocation() {
        return location;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.location = newLocation;
    }
}
class RideHailingApp {
    public static void calculateRideFare(Vehicle vehicle, double distance) {
        vehicle.getVehicleDetails();
        double fare = vehicle.calculateFare(distance);
        System.out.println("Distance: " + distance + " km");
        System.out.println("Fare: ₹" + fare);
        System.out.println("--------------------------------");
    }

    public static void main(String[] args) {
        Vehicle v1 = new Car("CAR101", "Ravi Kumar", 15);
        Vehicle v2 = new Bike("BIK202", "Anjali Mehta", 7);
        Vehicle v3 = new Auto("AUT303", "Suresh", 10);
        ((GPS) v1).updateLocation("Central Mall");
        ((GPS) v2).updateLocation("Park Street");
        ((GPS) v3).updateLocation("Bus Stand");
        System.out.println("Ride Fare Summary:\n");
        Vehicle[] rides = {v1, v2, v3};
        double[] distances = {10, 5, 2};

        for (int i = 0; i < rides.length; i++) {
            calculateRideFare(rides[i], distances[i]);
        }
    }
}
