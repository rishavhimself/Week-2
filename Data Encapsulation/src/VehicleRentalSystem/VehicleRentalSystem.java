package VehicleRentalSystem;
//Main class
public class VehicleRentalSystem {
    public static void main(String[] args){

        // Create instances
        Vehicle newCar = new Car("MP04ZN1234","CAR",500);
        Vehicle newTruck = new Truck("MP04ZN1010","TRUCK",4000);
        Vehicle newBike = new Bike("MP04ZN1671","BIKE",250);

        // Function Call
        newCar.displayDetails();
        newCar.calculateRentalCost();
        newCar.calculateInsurance();
        newCar.getInsuranceDetails();
        newBike.displayDetails();
        newBike.calculateInsurance();
        newBike.getInsuranceDetails();
        newTruck.displayDetails();
        newTruck.calculateInsurance();
        newTruck.getInsuranceDetails();
    }
}
