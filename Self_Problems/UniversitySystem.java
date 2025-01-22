import java.util.ArrayList;

// Class to represent a Faculty member
class Faculty {
    private String name;
    private String id;
    private String designation;

    public Faculty(String name, String id, String designation) {
        this.name = name;
        this.id=id;
        this.designation=designation;
    }

    public String getName() {
        return name;
    }

    public void displayInfo() {
        System.out.println("Faculty: " + name);
    }
}

// Class to represent a Department
class Department {
    private String name;
    private String id;

    public Department(String name, String id) {
        this.name = name;
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public void displayInfo() {
        System.out.println("Department: " + name);
    }
}

// Class to represent a University
class University {
    private String name;
    private ArrayList<Department> departments; // Composition relationship
    private ArrayList<Faculty> faculties; // Aggregation relationship

    // Create departments
    Department department1 = new Department("Computer Science","D1");
    Department department2 = new Department("Mechanical Engineering","D2");

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }

    // Add a department to the university
    public void addDepartment(Department department) {
        departments.add(department);
    }

    // Add a faculty member to the university
    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    // Display all departments
    public void displayDepartments() {
        System.out.println("Departments in " + name + ":");
        for (Department department : departments) {
            System.out.println("- " + department.getName());
        }
    }

    // Display all faculty members
    public void displayFaculties() {
        System.out.println("Faculties in " + name + ":");
        for (Faculty faculty : faculties) {
            System.out.println("- " + faculty.getName());
        }
    }

    // Simulate deleting the university (and all its departments)
    public void deleteUniversity() {
        System.out.println(name + " is being deleted. All departments will be deleted as well.");
        departments.clear(); // Departments are deleted as part of the university
    }
}

// Main class to demonstrate the model
public class UniversitySystem{
    public static void main(String[] args) {
        // Create a university
        University university = new University("Tech University");

        // Create faculty members
        Faculty faculty1 = new Faculty("Dr. Alice","0123A","HOD");
        Faculty faculty2 = new Faculty("Dr. Bob","01124","TG");

        // Add departments to the university
        university.addDepartment(university.department1);
        university.addDepartment(university.department2);

        // Add faculty members to the university
        university.addFaculty(faculty1);
        university.addFaculty(faculty2);

        // Display departments and faculty members
        university.displayDepartments();
        university.displayFaculties();

        // Simulate deleting the university
        university.deleteUniversity();

        // Attempt to display departments after university deletion
        university.displayDepartments();

        // Faculty members still exist independently
        faculty1.displayInfo();
        faculty2.displayInfo();
    }
}
