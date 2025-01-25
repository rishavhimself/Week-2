package AssistedProblems.EmployeeManagementSystem;

// Define the subclass
class Developer extends Employee{

    String programmingLanguage;

    // Constructor
    Developer(String name, String id, double salary, String programmingLanguage){
        super(name,id,salary);
        this.programmingLanguage=programmingLanguage;
    }

    // Implementation of displayDetails
    protected void displayDetails(){
        System.out.println("\n Developer \n");
        super.displayDetails();
        System.out.println("Works on : "+programmingLanguage+" Language");
    }
}
