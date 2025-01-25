package AssistedProblems.EmployeeManagementSystem;

// Define the subclass
class Intern extends Employee{
    String department;

    // Constructor
    Intern(String name, String id, double salary , String department){
        super(name, id, salary);
        this.department=department;
    }

    // Implementation of displayDetails
    protected void displayDetails(){
        System.out.println("\n Intern \n");
        super.displayDetails();
        System.out.println("Intern at : "+department+" Department");
    }
}
