class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    // Constructor to initialize employee details
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Setter for salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeID); // Accessing public member
        System.out.println("Department: " + department); // Accessing protected member
        System.out.println("Salary: " + getSalary()); // Accessing private member through getter
    }
}

// Subclass to demonstrate access to public and protected members
class Manager extends Employee {

    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    

    
}


public class EmployeeRecords {
    public static void main(String[] args) {
        Manager manager = new Manager(2001, "IT", 80000.00);
        manager.displayDetails();
    }
}
