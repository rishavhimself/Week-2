package SingleInheritance.SmartHomeDevices;

// Main class
public class Devices {
    public static void main(String args[]){
        // Create instance
        Thermostat newThermostat = new Thermostat("THEM001","Active",121.3);

        // Function Call
        newThermostat.diplayDetails();
    }
}
