package HierarchicalInheritance.SchoolSystemwithDifferentRoles;

// Define the subclass
class Teacher extends People{
    private String subject;

    // Constructor
    Teacher(String name , int age, String subject){
        super(name, age);
        this.subject=subject;
    }

    // Implementation of displayRole
    public void displayRole() {
        System.out.println("\nTeacher");
        super.displayDetails();;
        System.out.println("Subject : "+subject);
    }
}