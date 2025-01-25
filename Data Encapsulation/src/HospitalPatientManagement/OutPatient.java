package HospitalPatientManagement;

// Define the subclass
public class OutPatient extends Patient{

    // Constructor
    OutPatient(String name, String patientId, int age) {
        super(name, patientId, age);
    }

    // Implementation of overridden Methods
    @Override
    public void calculateBill() {
        System.out.println("RS 20000");
    }

}
