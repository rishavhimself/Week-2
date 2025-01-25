package VehicleRentalSystem;

// Define the superclass
public abstract class Vehicle implements Insurable{
    private String  vehicleNumber, type;
    private double rentalRate;
    public int days=10;
    public double insurance;

    // Constructor
    Vehicle(String vehicleNumber,String type, double rentalRate){
       setVehicleNumber(vehicleNumber);
        setType(type);
        setRentalRate(rentalRate);
    }

    //Getter and Setter Methods
    public String getVehicleNumber(){
        return vehicleNumber;
    }

    public String getType(){
        return type;
    }

    public double getRentalRate(){
        return rentalRate;
    }

    public void setVehicleNumber(String vehicleNumber){
        this.vehicleNumber=vehicleNumber;
    }

    public void setType(String type){
        this.type=type;
    }

    public void setRentalRate(double rentalRate){
        this.rentalRate=rentalRate;
    }

    // Abstract method
    public abstract void calculateRentalCost();

    // Implementation of displayDetails method
    protected void displayDetails(){
        System.out.println("\nVehicle Type : "+type);
        System.out.println("Vehicle Number : "+vehicleNumber);
        System.out.println("Vehicle Rental Cost for 10 Days : "+rentalRate);
    }
}
