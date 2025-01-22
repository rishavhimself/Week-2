
import java.util.ArrayList;

// Class to represent a Student
class Student {
    private String name;
    private String rollNumber;
    private int age;
    private ArrayList<Course> courses;

    public Student(String name, String rollNumber, int age) {
        this.name = name;
        this.rollNumber=rollNumber;
        this.age=age;
        this.courses=new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    // Enroll in a course
    public void enrollInCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.addStudent(this);
        }
    }

    // View courses the student is enrolled in
    public void viewCourses() {
        System.out.println(name + " is enrolled in:");
        for (Course course : courses) {
            System.out.println("- " + course.getName());
        }
    }
}

// Class to represent a Course
class Course {
    private String name;
    private String id;
    private ArrayList<Student> students;

    public Course(String name, String id) {
        this.name = name;
        this.id=id; 
        this.students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    // Add a student to the course
    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    // View students enrolled in the course
    public void viewStudents() {
        System.out.println("Students enrolled in " + name + ":");
        for (Student student : students) {
            System.out.println("- " + student.getName());
        }
    }
}


public class School{
    public static void main(String[] args) {

        // Create students
        Student student1 = new Student("Alice","0111AS211",20);
        Student student2 = new Student("Bob","0111AS212",21);

        // Create courses
        Course course1 = new Course("Mathematics","M1");
        Course course2 = new Course("Physics","P1");

        // Enroll students in courses
        student1.enrollInCourse(course1);
        student1.enrollInCourse(course2);
        student2.enrollInCourse(course1);

        // Display students in the school
        //school.displayStudents();

        // Students view their courses
        student1.viewCourses();
        student2.viewCourses();

        // Courses view their enrolled students
        course1.viewStudents();
        course2.viewStudents();
    }
}
