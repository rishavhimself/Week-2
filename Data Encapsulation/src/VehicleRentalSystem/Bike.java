package VehicleRentalSystem;
// Define the subclass
public class Bike extends Vehicle implements Insurable{

    // Constructor
    Bike(String vehicleNumber,String type, double rentalRate){
        super(vehicleNumber,type,rentalRate);
    }

    // Implementation of overridden Methods
    @Override
    public void calculateRentalCost() {
        System.out.println("Total Rental Cost : "+getRentalRate()*days);
    }

    @Override
    public void calculateInsurance() {
        insurance =(getRentalRate()*days)/5;
    }

    @Override
    public void getInsuranceDetails() {
        System.out.println("Total Insurance Cost : "+insurance);
    }
}
