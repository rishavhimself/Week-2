package HybridInheritance.VehicleManagementSystem;

// Define the subclass
class ElectricVehicle extends VehicleType {
    private double range;

    // Constructor
    ElectricVehicle(String model, double maxSpeed, double range){
        super(model, maxSpeed);
        this.range=range;
    }

    // Implementation of charge
    protected void charge(){
        System.out.println("Vehicle Fully Charged");
        System.out.println("Total Range : "+ range);
    }

    // Implementation of displayDetails
    protected void displayDetails(){
        super.displayDetails();
        System.out.println("Range : "+range+" Km");
    }
}
