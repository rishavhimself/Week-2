package AssistedProblems.VehicleandTransportSystem;
import java.util.ArrayList;
// Main class
public class Vehicles {
    public static void main(String[] args) {

        // Create instances
        Car car = new Car("Car",280, "Hybrid Petrol");
        Truck truck = new Truck("Truck",120, "Diesel");
        Motorcycle motorcycle = new Motorcycle("Motorcycle",309, "High Octane Petrol");

        //Implementing Arraylist
        ArrayList<Vehicle> vehicles=new ArrayList<>();

        //Adding Objects to the list
        vehicles.add(car);
        vehicles.add(truck);
        vehicles.add(motorcycle);

        for(Vehicle vehicle: vehicles){
            vehicle.displayInfo(); // Function Call
        }

    }

}