package Ride_HailingApplication;

// Define the superclass
public abstract class Vehicle implements  GPS{
    private String vehicleId, driverName;
    private double ratePerKm;

    // Constructor
    Vehicle(String driverName,String vehicleId,double ratePerKm){
        setDriverName(driverName);
        setVehicleId(vehicleId);
        setRatePerKm(ratePerKm);
    }

    //Getter and Setter Methods
    public String getDriverName() {
        return driverName;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public void setRatePerKm(double ratePerKm) {
        this.ratePerKm = ratePerKm;
    }

    // Abstract method
    public abstract void calculateFare(double distance);

    // Implementation of getVehicleDetails method
    public void getVehicleDetails(){
        System.out.println("\nDriver Name : "+driverName);
        System.out.println("Vehicle ID : "+vehicleId);
        System.out.println("Rate per KM : "+ratePerKm);
    }
}
