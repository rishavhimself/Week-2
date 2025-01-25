package Ride_HailingApplication;

// Define the GPS interface
public interface GPS {

    // Abstract methods
    public void getCurrentLocation();
    public  void updateLocation(String location);

}
