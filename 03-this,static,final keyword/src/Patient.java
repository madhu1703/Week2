import java.lang.*;
import java.util.*;
class Patient {
    static String hospitalName;
    private String name;
    private int age;
    private String ailment;
    private final int patientID;
    private static int totalPatients=0;
    public Patient(String hospitalName,String name,int patientID,int age,String ailment)
    {
        this.hospitalName=hospitalName;
        this.name=name;
        this.patientID=patientID;
        this.age=age;
        this.ailment=ailment;
    }
    static int setTotalPatients(int n)
    {
        totalPatients+=n;
        return totalPatients;
    }
    static  int getTotalPatients()
    {
        return totalPatients;
    }
    public void display()
    {
        System.out.println("Hospital name:"+hospitalName);
        System.out.println("Patient's name"+name);
        System.out.println("Patient's ID"+patientID);
        System.out.println("Patient's age"+age);
        System.out.println("Ailment:"+ailment);
        System.out.println("Total patients:"+getTotalPatients());
    }
    public static void main(String[] args)
    {
        Patient p=new Patient("ABC","XXX",001,55,"Fever");
        setTotalPatients(10);
        p.display();
        if(p instanceof Patient)
        {
            System.out.println("It is an instance");
        }
        else System.out.println("It is not an instance");
    }
}
