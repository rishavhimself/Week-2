package HybridInheritance.VehicleManagementSystem;

// Main class
public class VehicleTypes{
    public static void main(String[] args) {

        // Create instances
        PetrolVehicle newPetrolVehicle = new PetrolVehicle("Safari", 282.11, 17);
        ElectricVehicle newWElectricVehicle = new ElectricVehicle("Nexon.Ev", 270.39, 500);

        // Function Call
        newPetrolVehicle.displayDetails();
        newPetrolVehicle.refuel();

        newWElectricVehicle.displayDetails();
        newWElectricVehicle.charge();
    }
}