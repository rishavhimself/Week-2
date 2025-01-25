package AssistedProblems.VehicleandTransportSystem;

// Define the subclass
class Car extends Vehicle{

    // Constructor
    Car(String vehicleType, double maxSpeed, String fuelType){
        super(vehicleType,maxSpeed, fuelType);
        seatCapacity=6;
    }

    // Implementation of displayInfo
    protected void displayInfo(){
        System.out.println("\nVehicle type : "+vehicleType+"\n");
        super.displayInfo();
        System.out.println("Capacity of seats : "+seatCapacity);
    }
}
