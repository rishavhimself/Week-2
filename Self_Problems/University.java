import java.util.ArrayList;

// Class to represent a Course
class Course {
    private String courseName; // Name of the course
    private String courseCode; // Unique code for the course
    private Professor professor; // Aggregation: A professor is associated with the course
    private ArrayList<Student> students; // Association: List of students enrolled in the course

    // Constructor to initialize a course with its name and code
    public Course(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.students = new ArrayList<>(); // Initialize the list of students
    }

    // Method to assign a professor to the course
    public void assignProfessor(Professor professor) {
        this.professor = professor;
        System.out.println("Professor " + professor.getName() + " assigned to course " + courseName);
    }

    // Method to enroll a student in the course
    public void enrollStudent(Student student) {
        students.add(student);
        System.out.println("Student " + student.getName() + " enrolled in course " + courseName);
    }

    // Method to display details about the course
    public void displayCourseDetails() {
        System.out.println("Course: " + courseName + " (" + courseCode + ")");
        if (professor != null) {
            System.out.println("Taught by: " + professor.getName());
        } else {
            System.out.println("No professor assigned yet.");
        }
        System.out.println("Enrolled students:");
        for (Student student : students) {
            System.out.println("- " + student.getName());
        }
    }
}

// Class to represent a Professor
class Professor {
    private String name; // Name of the professor

    // Constructor to initialize the professor's name
    public Professor(String name) {
        this.name = name;
    }

    // Getter for the professor's name
    public String getName() {
        return name;
    }
}

// Class to represent a Student
class Student {
    private String name; // Name of the student

    // Constructor to initialize the student's name
    public Student(String name) {
        this.name = name;
    }

    // Getter for the student's name
    public String getName() {
        return name;
    }
}

// Main class to demonstrate the University System
public class University {
    public static void main(String[] args) {
        // Create professors
        Professor profSmith = new Professor("Dr. Smith");
        Professor profJohnson = new Professor("Dr. Johnson");

        // Create students
        Student alice = new Student("Alice");
        Student bob = new Student("Bob");
        Student charlie = new Student("Charlie");

        // Create courses
        Course math101 = new Course("Mathematics 101", "MATH101");
        Course cs101 = new Course("Computer Science 101", "CS101");

        // Assign professors to courses
        math101.assignProfessor(profSmith);
        cs101.assignProfessor(profJohnson);

        // Enroll students in courses
        math101.enrollStudent(alice);
        math101.enrollStudent(bob);
        cs101.enrollStudent(charlie);

        // Display course details
        math101.displayCourseDetails();
        System.out.println();
        cs101.displayCourseDetails();
    }
}
