package Ride_HailingApplication;

//Main class
public class Ride_HailingApplication {
    public static void main(String[] args) {

        // Create instances
        Vehicle newBike = new Bike("Rishav","BI101",10);
        Vehicle newCar = new Car("Raxx","CA101",25.5);
        Vehicle newAuto = new Auto("Xyz","AU101",20);

        // Function Call
        newBike.getVehicleDetails();
        newBike.calculateFare(12);
        newBike.updateLocation("Bhopal");
        newBike.getCurrentLocation();

        newCar.getVehicleDetails();
        newCar.calculateFare(40);
        newCar.updateLocation("Indore");
        newCar.getCurrentLocation();

        newAuto.getVehicleDetails();
        newAuto.calculateFare(70);
        newAuto.updateLocation("Nagpur");
        newAuto.getCurrentLocation();
    }
}
