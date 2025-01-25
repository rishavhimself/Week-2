package Ride_HailingApplication;

// Define the subclass
public class Auto extends Vehicle{

    private String location;
    private double baseFare=300;

    // Constructor
    Auto(String driverName, String vehicleId, double ratePerKm) {
        super(driverName, vehicleId, ratePerKm);
    }

    // Implementation of overridden Methods
    @Override
    public void calculateFare(double distance) {
        System.out.println("Total Fare :"+(baseFare+distance*getRatePerKm()));
    }

    @Override
    public void getCurrentLocation() {
        System.out.println("Current Location :"+location);
    }

    @Override
    public void updateLocation(String location) {
        this.location=location;
    }
}
