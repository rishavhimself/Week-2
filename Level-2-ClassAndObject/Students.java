// Import Scanner class from util package for user input
import java.util.Scanner;
// Create Student Class
class Student{
	String name;
	String rollNumber;
	double marks[]=new double[3];
	String grades;
	
	
	Student(String name, String rollNumber, double []marks){
		this.name= name;
		this.rollNumber= rollNumber;
		this.marks=marks;
	}
	
	void displayDetails(){
		System.out.println("Name of the student : "+name);
		System.out.println("Roll number : "+rollNumber);
		System.out.println("Grades : " +grades);
	}
	
	void calculateGarde(double []marks){
		double totalMarks=marks[0]+marks[2]+marks[1];
		double averageMarks=totalMarks/3;
		if (averageMarks >= 80) {
            grades = "A";
        }
		else if (averageMarks >= 70) {
            grades = "B";
        }
		else if (averageMarks >= 60) {
            grades = "c";
        } 
		else if (averageMarks >= 50) {
            grades = "D";
        }
		else if (averageMarks >= 40) {
			grades = "E";
        }
		else {
            grades = "R";
        }
	}
	
}
public class Students{
		public static void main(String args[]){
			
			// Create a Scanner object for taking input
			Scanner scanner = new Scanner(System.in);
			
			// Ask the user to enter the student name
			System.out.println("Enter the Student name");
			String name= scanner.nextLine();

			// Ask the user to enter the roll number
			System.out.println("Enter the Student roll number");
			String rollNumber=scanner.nextLine();
			
			double [] marks=new double[3];
			
			// Ask the user to enter the marks
			System.out.println("Enter the Marks");
			for(int i=0;i<marks.length;i++)marks[i]=scanner.nextDouble();
	
			//Creating the object
			Student student = new Student(name,rollNumber,marks);
			
			//Method calling
			student.calculateGarde(marks);
			student.displayDetails();
		
			// Close the scanner
			scanner.close;
		}
	}
	