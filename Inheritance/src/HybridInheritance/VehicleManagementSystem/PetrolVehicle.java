package HybridInheritance.VehicleManagementSystem;

// Define the subclass
class PetrolVehicle extends VehicleType implements Refuelable{

    private double mileage;

    //implement refuel function
    public void refuel(){
        System.out.println("Tank Full");
    }

    // Constructor
    PetrolVehicle(String model, double maxSpeed,double mileage){
        super(model, maxSpeed);
        this.mileage=mileage;
    }

    // Implementation of displayDetails
    protected void displayDetails(){
        super.displayDetails();
        System.out.println("Mileage : "+mileage+" KMPL");
    }
}