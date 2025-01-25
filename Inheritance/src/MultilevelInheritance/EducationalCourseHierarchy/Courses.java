package MultilevelInheritance.EducationalCourseHierarchy;

// Main class
public class Courses {
    public static void main(String[] args) {
        // Create instances
        Course newCourse = new Course("Java Intro", "JA101", 3);
        OnlineCourse newOnlineCourse = new OnlineCourse("Java", "JA101", 3, "YOUTUBE", "Recorded");
        PaidOnlineCourse newPaidOnlineCourse = new PaidOnlineCourse("Java Intro", "JA101", 3,
                "YOUTUBE", "Recorded", 1000, 1000);

        // Function Call
        newCourse.diplayDetails();
        newOnlineCourse.diplayDetails();
        newPaidOnlineCourse.diplayDetails();
    }
}