package HospitalPatientManagement;

//Main class
public class HospitalPatientManagement {
    public static void main(String[] args) {

        // Create instances
        Patient newInPatient = new InPatient("Rishav","RI2100",22);
        Patient newOutPatient = new OutPatient("Raxx","RA2111",22);

        // Function Call
        newInPatient.addRecord("Blood Test");
        newInPatient.addRecord("MRI");
        newInPatient.addRecord("CT Scan");
        newInPatient.viewRecords();
        newInPatient.getPatientDetails();
        newInPatient.calculateBill();
        newOutPatient.addRecord("Blood Test");
        newOutPatient.addRecord("MRI");
        newOutPatient.addRecord("CT Scan");
        newOutPatient.getPatientDetails();
        newOutPatient.calculateBill();
        newOutPatient.viewRecords();
    }
}
