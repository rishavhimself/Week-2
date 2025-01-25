package VehicleRentalSystem;

// Define the subclass
public class Truck extends Vehicle implements Insurable{

    // Constructor
    Truck(String vehicleNumber,String type, double rentalRate){
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
