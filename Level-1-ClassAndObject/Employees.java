// Import Scanner class from util package for user input
import java.util.Scanner;
// Create Employee Class

	
 class Employee{
	String name;
	String id;
	Long salary;
	
	Employee(String name, String id, Long salary){
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	
	void displayDetails(){
		System.out.println("Name : "+name);
		System.out.println("Id : "+id);
		System.out.println("Salary :" +salary);
	}
}
public class Employees{
		public static void main(String args[]){
			
			// Create a Scanner object for taking input
			Scanner scanner = new Scanner(System.in);
			
			// Ask the user to enter the name
			System.out.println("Enter the Name");
			String name= scanner.nextLine();
			
			// Ask the user to enter the id
			System.out.println("Enter the Id");
			String id=scanner.nextLine();
			
			// Ask the user to enter the salary
			System.out.println("Enter the Salary");
			Long salary=scanner.nextLong();
			
			//Creating the object
			Employee1 employee = new Employee1(name,id,salary);
			
			//Method calling
			employee.displayDetails();
		
			// Close the scanner
			scanner.close();
		}
	}
	