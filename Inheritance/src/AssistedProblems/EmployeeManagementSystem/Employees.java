package AssistedProblems.EmployeeManagementSystem;

// Main class
public class Employees {
    public static void main(String[] args) {
        // Create instances
        Manager manager = new Manager("Ram","0111AS1",11234,15);
        Developer developer = new Developer("Mukesh", "0111AS2", 10000, "Java");
        Intern intern = new Intern("Rishav", "0111AS3", 9000, "Data");

        // Function Call
        manager.displayDetails();
        developer.displayDetails();
        intern.displayDetails();

    }
}