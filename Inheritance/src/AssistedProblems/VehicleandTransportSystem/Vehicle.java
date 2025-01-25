package AssistedProblems.VehicleandTransportSystem;

// Define the superclass
class Vehicle{
    protected String vehicleType;
    protected double maxSpeed;
    protected String fuelType;
    protected int seatCapacity;

    // Constructor
    Vehicle(String vehicleType,double maxSpeed, String fuelType){
        this.vehicleType=vehicleType;
        this.maxSpeed=maxSpeed;
        this.fuelType=fuelType;
    }

    // Implementation of displayInfo
    protected void displayInfo(){
        System.out.println("Top Speed : "+maxSpeed);
        System.out.println("Fuel required : "+fuelType);
    }

}
