package EmployeeManagementSystem;

// Define the superclass
public abstract class Employee implements Department{
    public String name,employeeId;
    public double baseSalary;

    // Constructor
    public Employee(String name,String employeeId){
        this.name=name;
        this.employeeId=employeeId;
    }

    // Abstract method
    public abstract void calculateSalary();

    // Implementation of displayDetails method
    public void displayDetails(){
        System.out.println("\nName of the Employee : "+ name);
        System.out.println(" Employee Id : "+ employeeId);
        System.out.println(" Employee Salary : "+ baseSalary);

    }

}