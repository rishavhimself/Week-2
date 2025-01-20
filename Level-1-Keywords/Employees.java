
// Import Scanner class from util package for user input
import java.util.Scanner;
// Create Employee Class

	
 class Employee{
    static String companyName="ABC pvt.ltd";
	static int totalNumber=0;
    String name;
	final String id;
	Long salary;
    String designation;
	
	Employee(String name, String id,String designation, Long salary){
		this.name=name;
		this.id=id;
        this.designation=designation;
		this.salary=salary;
        totalNumber++;
	}
	
    static void dispalyTotalEmployees(){
        System.out.println("Total number of employees is : "+totalNumber);
    }

	void displayDetails(){
		System.out.println("Name : "+name);
		System.out.println("Id : "+id);
        System.err.println("Designation of the employee : "+designation);
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
			
            // Ask the user to enter the id
			System.out.println("Enter the designation");
			String designation=scanner.nextLine();

			// Ask the user to enter the salary
			System.out.println("Enter the Salary");
			Long salary=scanner.nextLong();
			
			//Creating the object
			Employee employee = new Employee(name,id,designation,salary);
			

            if(employee instanceof Employee){
            System.out.println("The given object is an instance of Employee Class ");
            //Method calling
			employee.displayDetails();
            Employee.dispalyTotalEmployees();
            }
			
		
			// Close the scanner
			scanner.close();
		}
	}
	