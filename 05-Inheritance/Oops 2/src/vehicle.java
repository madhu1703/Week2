import java.lang.*;
import java.util.*;
class vehicle {
    private String ownerName;
    private String vehicleType;
    private static double registrationFee;
    public vehicle(String ownerName,String vehicleType,double registrationFee)
    {
        this.ownerName=ownerName;
        this.vehicleType=vehicleType;
        vehicle.registrationFee=registrationFee;
    }
    public void displayVehicleDetails()
    {
        System.out.println("Owner name:"+ ownerName);
        System.out.println("Vehicle type:"+ vehicleType);
        System.out.println("Registration fees"+ registrationFee);
    }
    public static void updateRegistrationFee(double newRegistrationFee)
    {
        registrationFee=newRegistrationFee;
    }
    public static void main(String[] args)
    {
        vehicle v=new vehicle("a","bike",2500);
        v.displayVehicleDetails();
        System.out.println("Details after updating");
        vehicle.updateRegistrationFee(3000);
        v.displayVehicleDetails();
    }
}
