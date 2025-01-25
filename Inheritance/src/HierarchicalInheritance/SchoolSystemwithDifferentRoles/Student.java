package HierarchicalInheritance.SchoolSystemwithDifferentRoles;

// Define the subclass
class Student extends People{
    private char grade;

    // Constructor
    Student(String name , int age, char grade){
        super(name, age);
        this.grade=grade;
    }

    // Implementation of displayRole
    public void displayRole() {
        System.out.println("\nStudent");
        super.displayDetails();
    }
}