package HospitalPatientManagement;

// Define the subclass
public class InPatient extends  Patient{

    // Constructor
    InPatient(String name, String patientId, int age) {
        super(name, patientId, age);
    }

    // Implementation of overridden Methods
    @Override
    public void calculateBill() {
        System.out.println("RS 15000");
    }

}
