package SingleInheritance.SmartHomeDevices;

// Define the superclass
class Device{
    protected String deviceId, status;

    // Constructor
    Device(String deviceId, String status){
        this.deviceId=deviceId;
        this.status=status;
    }

    // Implementation of displayDetails
    protected void diplayDetails(){
        System.out.println("Device ID : "+deviceId);
        System.out.println("Device Status : "+status);
    }

}