package MultilevelInheritance.EducationalCourseHierarchy;

// Define the subclass
class OnlineCourse extends Course{
    protected String platform ,isRecorded;

    // Constructor
    OnlineCourse(String courseName, String courseId, int duration, String platform, String isRecorded){
        super(courseName, courseId, duration);
        this.platform=platform;
        this.isRecorded=isRecorded;
    }

    // Implementation of displayDetails
    protected void diplayDetails(){
        super.diplayDetails();
        System.out.println("Available at : "+ platform);
        System.out.println("Format : "+ isRecorded);
    }
}