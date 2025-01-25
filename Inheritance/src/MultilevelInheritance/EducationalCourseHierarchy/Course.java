package MultilevelInheritance.EducationalCourseHierarchy;

// Define the superclass
class Course{
    protected String courseName;
    protected String courseId;
    protected int duration;

    // Constructor
    Course(String courseName, String courseId, int duration){
        this.courseName=courseName;
        this.courseId=courseId;
        this.duration=duration;
    }

    // Implementation of displayDetails
    protected void diplayDetails(){
        System.out.println("\nCourse Name : "+courseName);
        System.out.println("Course ID : "+courseId);
        System.out.println("Course Duration : "+duration+" Months");
    }

}