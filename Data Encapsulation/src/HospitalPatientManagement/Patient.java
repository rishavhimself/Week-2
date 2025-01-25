package HospitalPatientManagement;

import java.util.ArrayList;

// Define the superclass
public abstract class Patient implements MedicalRecord {

    private String patientId, name;
    private  int age;
    private ArrayList<String>records=new ArrayList<>();

    // Constructor
    Patient(String name,String patientId, int age){
        setName(name);
        setPatientId(patientId);
        setAge(age);
    }

    //Getter and Setter Methods
    public String getName() {
        return name;
    }

    public String getPatientId() {
        return patientId;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Implementation of overridden Methods
    @Override
    public void addRecord(String record) {
        records.add(record);
    }

    @Override
    public void viewRecords() {
        for(String record : records){
            System.out.print(record+", ");
        }
    }

    // Abstract method
    public abstract void calculateBill();

    // Implementation of getPatientDetails
    public void getPatientDetails(){
        System.out.println("\nPatient Name : "+name);
        System.out.println("Patient ID : "+patientId);
        System.out.println("Patient Age: "+age);
    }
}
