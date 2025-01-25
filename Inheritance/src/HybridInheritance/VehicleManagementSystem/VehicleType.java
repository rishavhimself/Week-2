package HybridInheritance.VehicleManagementSystem;

// Define the superclass
class VehicleType{
    protected String model;
    protected double maxSpeed;

    // Constructor
    VehicleType(String model, double maxSpeed){
        this.model=model;
        this.maxSpeed=maxSpeed;
    }

    // Implementation of displayDetails
    protected void displayDetails(){
        System.out.println("\nModel Name : "+model);
        System.out.println("Top Speed : "+maxSpeed);
    }
}