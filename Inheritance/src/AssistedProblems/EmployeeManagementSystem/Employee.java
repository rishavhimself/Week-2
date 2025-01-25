package AssistedProblems.EmployeeManagementSystem;

// Define the superclass
class Employee{
    protected String name, id;
    protected double salary;

    // Constructor
    Employee(String name, String id, double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }

    // Implementation of displayDetails
    protected void displayDetails(){
        System.out.println("Name of the Employee : "+name);
        System.out.println(" id : "+id);
        System.out.println("Salary : "+salary);
    }

}