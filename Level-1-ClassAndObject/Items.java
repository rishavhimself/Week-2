// Import Scanner class from util package for user input
import java.util.Scanner;
// Create Item Class
class Item{
	String itemName;
	String itemId;
	double price;
	
	Item (String itemName, String itemId, double price){
		this.itemName=itemName;
		this.itemId=itemId;
		this.price=price;
	}
	
	void displayDetails(){
		System.out.println("Item Name : "+itemName);
		System.out.println("Item Id : "+itemId);
		System.out.println("Price :" +price);
	}
	
	void totalCost(int quantity){
		System.out.println("The total price is: "+price*quantity);
	}
}
public class Items{
		public static void main(String args[]){
			
			// Create a Scanner object for taking input
			Scanner scanner = new Scanner(System.in);
			
			// Ask the user to enter the item name
			System.out.println("Enter the Item name");
			String itemName= scanner.nextLine();
			
			// Ask the user to enter the id
			System.out.println("Enter the Item id");
			String itemId=scanner.nextLine();
			
			// Ask the user to enter the price
			System.out.println("Enter the Price");
			double price=scanner.nextDouble();
			
			// Ask the user to enter the quantity
			System.out.println("Enter Quantity");
			int quantity=scanner.nextInt();
			
			//Creating the object
			Item item = new Item(itemName,itemId,price);
			
			//Method calling
			item.displayDetails();
			item.totalCost(quantity);
		
			// Close the scanner
			scanner.close();
		}
	}
	