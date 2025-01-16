// Import Scanner class from util package for user input
import java.util.Scanner;
// Create MobilePhone Class
class MobilePhone{
	String brand;
	String model;
	double price;
	
	MobilePhone(String brand, String model, double price){
		this.brand= brand;
		this.model= model;
		this.price=price;
	}
	
	void displayDetails(){
		System.out.println("Mobile Phone Brand : "+brand);
		System.out.println("Mobile Phone Model : "+model);
		System.out.println("Price :" +price);
	}
	
}
public class MobilePhones{
		public static void main(String args[]){
			
			// Create a Scanner object for taking input
			Scanner scanner = new Scanner(System.in);
			
			// Ask the user to enter the brand name
			System.out.println("Enter the Mobile brand name");
			String brand= scanner.nextLine();
			
			// Ask the user to enter the model
			System.out.println("Enter the Mobile model");
			String model=scanner.nextLine();
			
			// Ask the user to enter the price
			System.out.println("Enter the Price");
			double price=scanner.nextDouble();
	
			//Creating the object
			MobilePhone mobilePhone = new MobilePhone(brand,model,price);
			
			//Method calling
			mobilePhone.displayDetails();
		
			// Close the scanner
			scanner.close();
		}
	}
	