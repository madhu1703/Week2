import java.lang.*;
import java.util.*;
class Device {
    private double deviceID;
    private String status;
    public Device(double deviceID,String status)
    {
        this.deviceID=deviceID;
        this.status=status;
    }
    public void displayStatus()
    {
        System.out.println("The device ID is "+deviceID);
        System.out.println("The device status is "+status);
    }
}
class Thermostat extends Device{
    private int temperatureSetting;
    public Thermostat(double deviceID,String status,int temperatureSetting) {
        super(deviceID, status);
        this.temperatureSetting = temperatureSetting;
    }
        @Override
        public void displayStatus() {
            super.displayStatus();
            System.out.println("The temperature in celcius is "+temperatureSetting);
        }
    }

class Expression
{
    public static void main(String[] args)
    {
        Thermostat t=new Thermostat(92384,"Available",33);
        t.displayStatus();
    }
}
