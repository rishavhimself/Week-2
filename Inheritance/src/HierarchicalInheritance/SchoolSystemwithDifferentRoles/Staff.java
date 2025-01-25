package HierarchicalInheritance.SchoolSystemwithDifferentRoles;

// Define the subclass
class Staff extends People{
    private String department;

    // Constructor
    Staff(String name , int age, String department){
        super(name, age);
        this.department=department;
    }

    // Implementation of displayRole
    public void displayRole() {
        System.out.println("\nStaff");
        super.displayDetails();
        System.out.println("Works in "+department+" Department");
    }
}