import java.lang.*;
import java.util.*;
class Patient {
    private String patientName;
    private Doctor[] doctors;
    private int doctorCount;

    public Patient(String PatientName) {
        this.patientName = patientName;
        this.doctors = new Doctor[10];
        doctorCount = 0;
    }

    public String getPatientName() {
        return patientName;
    }

    public void consultDoctor(Doctor doctor) {
        if (doctorCount < doctors.length) {
            doctors[doctorCount++] = doctor;
            doctor.consult(this);
        } else {
            System.out.println(patientName + " cannot consult more doctors.");
        }
        public void viewDoctors() {
            System.out.println(patientName + " has consulted:");
            for (int i = 0; i < doctorCount; i++) {
                System.out.println("  - Dr. " + doctors[i].getPatientName());
            }
        }
    }
}
    class Doctor {
        private String name;
        private Patient[] patients;
        private int patientCount;

        public Doctor(String name) {
            this.name = name;
            this.patients = new Patient[10]; // max 10 patients
            this.patientCount = 0;
        }

        public String getName() {
            return name;
        }

        public void consult(Patient patient) {
            if (patientCount < patients.length) {
                patients[patientCount++] = patient;
                System.out.println("Dr. " + name + " consulted " + patient.getName());
            } else {
                System.out.println("Dr. " + name + " cannot take more patients.");
            }
        }

        class Doctor {
            private String doctorName;
            private Patient[] patients;
            private int patientCount;

            public Doctor(String name) {
                this.doctorName = doctorName;
                this.patients = new Patient[10]; // max 10 patients
                this.patientCount = 0;
            }

            public String getDoctorName() {
                return doctorName;
            }

            public void consult(Patient patient) {
                if (patientCount < patients.length) {
                    patients[patientCount++] = patient;
                    System.out.println("Dr. " + doctorName + " consulted " + patient.getName());
                } else {
                    System.out.println("Dr. " + doctorName + " cannot take more patients.");
                }
            }

            public void viewPatients() {
                System.out.println("Dr. " + doctorName + " has consulted:");
                for (int i = 0; i < patientCount; i++) {
                    System.out.println("  - " + patients[i].getName());
                }
            }
        }

        class Hospital {
            private String hospitalName;

            public Hospital(String hospitalName) {
                this.hospitalName = hospitalName;
            }

            public String getHospitalName() {
                return hospitalName;
            }
        }
    }
        class Main
        {
            public static void main(String[] args) {
                Hospital hospital = new Hospital("City Care Hospital");

                Doctor doc1 = new Doctor("Sharma");
                Doctor doc2 = new Doctor("Kumar");

                Patient p1 = new Patient("Arjun");
                Patient p2 = new Patient("Sita");

                p1.consultDoctor(doc1);
                p1.consultDoctor(doc2);
                p2.consultDoctor(doc1);

                System.out.println();
                p1.viewDoctors();
                p2.viewDoctors();
                System.out.println();
                doc1.viewPatients();
                doc2.viewPatients();
            }
        }
