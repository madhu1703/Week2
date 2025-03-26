import java.lang.*;
import java.util.*;
public class Vehicle {
    static double registrationFee;
    private String ownerName;
    private String vehicleType;
    private final String registrationNumber;
    public Vehicle(String ownerName,String vehicleType,String registrationNumber)
    {
        this.ownerName=ownerName;
        this.vehicleType=vehicleType;
        this.registrationNumber=registrationNumber;
    }
    public static double updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        return registrationFee;
    }
    public void display()
    {
        System.out.println("The owner name is "+ownerName);
        System.out.println("The vehicle type is "+vehicleType);
        System.out.println("Registration number:"+registrationNumber);
        System.out.println("Registration fee:"+updateRegistrationFee(2500));
    }
    public static void main(String[] args)
    {
        Vehicle v=new Vehicle("arr","Car","TN01AA0101");
        v.display();
        if(v instanceof Vehicle)
        {
            System.out.println("It is an instance");
        }
        else System.out.println("It is not an instance");
    }
}
