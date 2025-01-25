package HierarchicalInheritance.SchoolSystemwithDifferentRoles;

// Main class
public class Persons {
    public static void main(String[] args) {

        // Create instances
        Student newStudent = new Student("Rishav", 21, 'A');
        Teacher newTeacher = new Teacher("Shubhanshi", 32, "JAVA");
        Staff newStaff = new Staff("Arpita", 28, "CSE");

        // Function Call
        newStudent.displayRole();
        newTeacher.displayRole();
        newStaff.displayRole();
    }
}
