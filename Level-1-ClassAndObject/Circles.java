// Import Scanner class from util package for user input
import java.util.Scanner;
// Create Circle Class
	class Circle{
		double radius;
	
		Circle(double radius){
			this.radius=radius;
			}
	
		void area(){
			double area=Math.PI*radius*radius;
			System.out.println("The area of the Circle is : "+area);
		}
		void circumference(){
			double circumference=2*Math.PI*radius;
			System.out.println("The circumference of the Circle is :"+circumference);
		}
	}
	public class Circles{
		public static void main(String args[]){
			
			// Create a Scanner object for taking input
			Scanner scanner = new Scanner(System.in);
			
			// Ask the user to enter the radius
			System.out.println("Enter the radius of the circle");
			double radius=scanner.nextDouble();
			
			//Creating the object
			Circle circle = new Circle(radius);
			
			//Method calling
			circle.circumference();
			circle.area();
		
			// Close the scanner
			scanner.close();
		}
}
	