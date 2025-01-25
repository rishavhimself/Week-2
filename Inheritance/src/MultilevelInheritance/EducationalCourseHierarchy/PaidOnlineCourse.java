package MultilevelInheritance.EducationalCourseHierarchy;

// Define the subclass
class PaidOnlineCourse extends OnlineCourse{
    protected double fee ,discount;

    // Constructor
    PaidOnlineCourse(String courseName, String courseId, int duration, String platform,
                     String isRecorded, double fee, double discount){

        super(courseName, courseId, duration, platform, isRecorded);
        this.fee=fee;
        this.discount=discount;
    }

    // Implementation of displayDetails
    protected void diplayDetails(){
        super.diplayDetails();
        System.out.println("Cost of the course : "+fee);
        System.out.println("Discount : "+discount);
    }
}
