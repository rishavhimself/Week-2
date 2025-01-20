// Create class Vehicle
class Vehicle {
    private String ownerName;
    private String vehicleType;
    private final String registrationNumber ;
    private static double registrationFee = 100.00;

    // Constructor 
    public Vehicle(String ownerName,String registrationNumber ,String vehicleType) {
        this.ownerName = ownerName;
        this.registrationNumber=registrationNumber;
        this.vehicleType = vehicleType;
    }

    // Method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Registration Number: "+registrationNumber);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
        System.out.println();
    }

    // Method to update the registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    
}


public class Vehicles {
    // Main method
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Alice","MP04XXZZZZ", "Car");
        Vehicle vehicle2 = new Vehicle("Bob","MP04YYXXXX", "Motorcycle");

        if(vehicle1 instanceof Vehicle){
            System.out.println("The given object is an instance of Vehicle Class ");
            vehicle1.displayVehicleDetails();
            vehicle2.displayVehicleDetails();

            Vehicle.updateRegistrationFee(120.00);

            System.out.println("Details after updating the registration fee\n");

            vehicle1.displayVehicleDetails();
            vehicle2.displayVehicleDetails();
        }
        
    }
}
