package EmployeeManagementSystem;

// Define the subclass
public class FullTimeEmployee extends Employee implements Department{

    private double workingHours;
    private String department;

    // Constructor
    FullTimeEmployee(String name, String employeeId,double workingHours  ){
        super(name,employeeId);
        setWorkingHours(workingHours);
    }

    // Implementation of overridden Methods
    @Override
    public void assignDepartment(String department) {
        this.department=department;
    }

    @Override
    public void getDepartmentDetails() {
        System.out.println("Works in :"+department+" Department");
    }

    @Override
    public void calculateSalary() {
        double fixedSalary = 100000;
        baseSalary = workingHours*30+ fixedSalary;
    }
     public double getWorkingHours(){
        return workingHours;
     }

     // Setter
     public void setWorkingHours(double workingHours){
        this.workingHours=workingHours;
     }

}