// Create Patient class
class Patient {
    private static String hospitalName ="XYZ Hospital";
    private static int totalPatients=0;
    private String name;
    private final String patientId;
    private int age;
    private String ailment;

    //Constructor
    Patient(String name, String patientId, int age ,String ailment){
        this.name=name;
        this.patientId=patientId;
        this.age=age;
        this.ailment=ailment;
        totalPatients++;
    }

    //Method to display details
    public void displayDetails(){
        System.out.println("Name of the hospital : "+hospitalName);
        System.out.println("Name os the patient : "+name);
        System.out.println("Age : "+age);
        System.out.println("Ailment : "+ailment);
    }

    //Method to display total count of patients
    public static void getTotalPatients(){
        System.out.println("Total number of patient are : "+totalPatients);
    }

}


public class Hospitals {
    //Main Method
    public static void main(String[] args) {
        Patient patient = new Patient("Rishav", "12345678", 23, "Diet");
        if(patient instanceof Patient){
            System.out.println("Given object is a instance of Hospital Class ");
            patient.displayDetails();
            Patient.getTotalPatients();
        }
    }
}