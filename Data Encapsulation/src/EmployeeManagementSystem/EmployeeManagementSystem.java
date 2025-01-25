package EmployeeManagementSystem;

// Main class
public class EmployeeManagementSystem {
    public static void main(String[] args){

        // Create instances
        Employee employeeOne = new FullTimeEmployee("Rishav","0111AS2",90);
        Employee employeeTwo = new PartTimeEmployee("Raxx","0111AS4",40);

        // Function Call
        employeeOne.displayDetails();
        employeeTwo.displayDetails();
        employeeOne.calculateSalary();
        employeeTwo.calculateSalary();
        employeeOne.assignDepartment("Cloud");
        employeeTwo.assignDepartment("AI");
        employeeOne.displayDetails();
        employeeOne.getDepartmentDetails();
        employeeTwo.displayDetails();
        employeeTwo.getDepartmentDetails();



    }
}
