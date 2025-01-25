package SingleInheritance.SmartHomeDevices;

// Define the subclass
 public class Thermostat extends Device{
    protected double temperatureSetting;

    // Constructor
    Thermostat(String deviceId, String status,double temperatureSetting){
        super(deviceId,status);
        this.temperatureSetting=temperatureSetting;
    }

    // Implementation of displayDetails
    protected void diplayDetails(){
        System.out.println("Device Type : Thermostat");
        super.diplayDetails();
        System.out.println("Device Temperature : "+temperatureSetting);

    }
}