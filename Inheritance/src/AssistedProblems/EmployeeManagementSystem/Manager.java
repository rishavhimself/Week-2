package AssistedProblems.EmployeeManagementSystem;

// Define the subclass
class Manager extends Employee{
    int teamSize;

    // Constructor
    Manager(String name, String id, double salary, int teamSize){
        super(name,id,salary);
        this.teamSize=teamSize;
    }

    // Implementation of displayDetails
    protected void displayDetails(){
        System.out.println("\n Manager \n");
        super.displayDetails();
        System.out.println("Size of the team : "+teamSize);
    }
}
