import java.lang.*;
import java.util.*;
interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}
abstract class Patient {
    private String patientId;
    private String name;
    private int age;
    private String diagnosis;

    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }
    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
    public String getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public abstract double calculateBill();
}
class InPatient extends Patient implements MedicalRecord {
    private int numberOfDays;
    private double roomChargePerDay;
    private List<String> records = new ArrayList<>();

    public InPatient(String patientId, String name, int age, int numberOfDays, double roomChargePerDay) {
        super(patientId, name, age);
        this.numberOfDays = numberOfDays;
        this.roomChargePerDay = roomChargePerDay;
    }

    @Override
    public double calculateBill() {
        return numberOfDays * roomChargePerDay + 500;
    }

    @Override
    public void addRecord(String record) {
        records.add(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records:");
        for (String r : records) {
            System.out.println("- " + r);
        }
    }
}
class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private List<String> records = new ArrayList<>();

    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String record) {
        records.add(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records:");
        for (String r : records) {
            System.out.println("- " + r);
        }
    }
}
public class HospitalPatientSystem {
    public static void printBillingDetails(Patient patient) {
        patient.getPatientDetails();
        System.out.println("Diagnosis: " + patient.getDiagnosis());
        System.out.println("Total Bill: ₹" + patient.calculateBill());

        if (patient instanceof MedicalRecord) {
            ((MedicalRecord) patient).viewRecords();
        }
    }

    public static void main(String[] args) {
        Patient p1 = new InPatient("P001", "Rohit", 35, 3, 1200);
        Patient p2 = new OutPatient("P002", "Sneha", 27, 400);
        Patient p3 = new InPatient("P103", "Karan Patel", 60, 7, 1800);
        Patient p4 = new OutPatient("P104", "Meera Das", 24, 500);
        p1.setDiagnosis("Typhoid");
        p2.setDiagnosis("Migraine");
        p3.setDiagnosis("Fractured Leg");
        p4.setDiagnosis("Skin Allergy");

        ((MedicalRecord) p1).addRecord("Admitted on April 9");
        ((MedicalRecord) p1).addRecord("IV antibiotics given");

        ((MedicalRecord) p2).addRecord("Consulted Dr. Mehta");
        ((MedicalRecord) p2).addRecord("Prescribed painkillers");
        ((MedicalRecord) p3).addRecord("Surgery performed on April 2");
        ((MedicalRecord) p3).addRecord("Physical therapy initiated");

        ((MedicalRecord) p4).addRecord("Dermatology consultation");
        ((MedicalRecord) p4).addRecord("Follow-up scheduled in 2 weeks");


        Patient[] patients = {p1, p2};

        System.out.println("Hospital Billing Summary:\n");
        for (Patient patient : patients) {
            printBillingDetails(patient);
        }
    }
}


