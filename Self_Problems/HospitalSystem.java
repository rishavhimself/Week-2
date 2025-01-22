
import java.util.ArrayList;

// Class to represent a Patient
class Patient {
    private String name;
    private ArrayList<Doctor> doctors; // Association with Doctor

    public Patient(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    // Add a doctor to the patient's list of consulting doctors
    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
            doctor.addPatient(this); // Ensure bidirectional association
        }
    }

    // View the doctors the patient is consulting
    public void viewDoctors() {
        System.out.println(name + " is consulting the following doctors:");
        for (Doctor doctor : doctors) {
            System.out.println("- Dr. " + doctor.getName());
        }
    }
}

// Class to represent a Doctor
class Doctor {
    private String name;
    private String id;
    private ArrayList<Patient> patients; // Association with Patient

    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    // Add a patient to the doctor's list of patients
    public void addPatient(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
            patient.addDoctor(this); // Ensure bidirectional association
        }
    }

    // Perform a consultation with a patient
    public void consult(Patient patient) {
        if (patients.contains(patient)) {
            System.out.println("Dr. " + name + " is consulting " + patient.getName() + ".");
        } else {
            System.out.println("Dr. " + name + " is not assigned to " + patient.getName() + ".");
        }
    }

    // View the patients the doctor is consulting
    public void viewPatients() {
        System.out.println("Dr. " + name + " is consulting the following patients:");
        for (Patient patient : patients) {
            System.out.println("- " + patient.getName());
        }
    }
}

// Class to represent a Hospital
class Hospital {
    private String name;
    private ArrayList<Doctor> doctors;
    private ArrayList<Patient> patients;

    public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    // Add a doctor to the hospital
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    // Add a patient to the hospital
    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    // Display all doctors in the hospital
    public void displayDoctors() {
        System.out.println("Doctors at " + name + ":");
        for (Doctor doctor : doctors) {
            System.out.println("- Dr. " + doctor.getName());
        }
    }

    // Display all patients in the hospital
    public void displayPatients() {
        System.out.println("Patients at " + name + ":");
        for (Patient patient : patients) {
            System.out.println("- " + patient.getName());
        }
    }
}

// Main class to demonstrate the model
public class HospitalSystem {
    public static void main(String[] args) {
        // Create a hospital
        Hospital hospital = new Hospital("City Hospital");

        // Create doctors
        Doctor doctor1 = new Doctor("Smith");
        Doctor doctor2 = new Doctor("Johnson");

        // Create patients
        Patient patient1 = new Patient("Alice");
        Patient patient2 = new Patient("Bob");

        // Add doctors and patients to the hospital
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);

        // Establish doctor-patient consultations
        doctor1.addPatient(patient1);
        doctor1.addPatient(patient2);
        doctor2.addPatient(patient1);

        // Display hospital details
        hospital.displayDoctors();
        hospital.displayPatients();

        // Doctors view their patients
        doctor1.viewPatients();
        doctor2.viewPatients();

        // Patients view their doctors
        patient1.viewDoctors();
        patient2.viewDoctors();

        // Perform consultations
        doctor1.consult(patient1);
        doctor2.consult(patient2); // This consultation doesn't exist
    }
}
