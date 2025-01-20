// Import Scanner class from util package for user input
import java.util.Scanner;
// Create CartItem Class
class Product{
	static double discount=12.5;
	String productName;
	final String productId;
	int quantity;
	double price;
	int totalCost=0;
	
	Product(String productName,String productId,int quantity, double price){
		this.productName=productName;
		this.productId=productId;
		this.quantity=quantity;
		this.price=price;
	}
	void addToCart(){
		
		// Import Scanner class from util package for user input
		Scanner scanner = new Scanner(System.in);
		System.out.println();
			
		// Ask the user to enter the name
		System.out.println("Enter the name of the item for adding to cart");
		String productName=scanner.nextLine();

		// Ask the user to enter the quantity
		System.out.println("Enter the quantity");
		int quantity=scanner.nextInt();
		
		// Ask the user to enter the price
		System.out.println("Enter the Price");
		double price=scanner.nextDouble();
		totalCost+=price*quantity;

		scanner.close();

	}


	void removeFromCart(){
		
		// Create a Scanner object for taking input
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		
		// Ask the user to enter the name
		System.out.println("Enter the name of the item for removal from cart");
		String productName= scanner.nextLine();
			
		// Ask the user to enter the quantity
		System.out.println("Enter the quantity");
		int quantity=scanner.nextInt();
			
		// Ask the user to enter the price
		System.out.println("Enter the Price");
		double price=scanner.nextDouble();
		totalCost-=price*quantity;

		scanner.close();

	}
	
	void totalCost(){
		totalCost+=price*quantity;
		System.out.println("The total price is: "+totalCost);
	}

	void toDisplayInfo(){
    	System.out.println("Name of the Product :"+productName);
		System.out.println("Product ID : "+productId);
		System.out.println("Total Cost :"+((price*(100-discount)/100)*quantity));
    }


	static void updateDiscount(double newDiscount){
	    discount=newDiscount;
	}


}
public class Products{
		public static void main(String args[]){
			// Create a Scanner object for taking input
			Scanner scanner = new Scanner(System.in);
			
			// Ask the user to enter the name of the item
			System.out.println("Enter the Item name");
			String itemName= scanner.nextLine();
			
			// Ask the user to enter the product id
			System.out.println("Enter the Item id");
			String itemId= scanner.nextLine();

			// Ask the user to enter the quantity
			System.out.println("Enter the quantity");
			int quantity=scanner.nextInt();
			
			// Ask the user to enter the price
			System.out.println("Enter the Price");
			double price=scanner.nextDouble();
			
			// Creating object of CartItem class
			Product product = new Product(itemName,itemId,quantity,price);
			
			if(product instanceof Product){
				int input=0;
				System.out.println("The given object is an instance of Product Class ");
				// Display
				System.out.println("Enter 1 to add item");
				System.out.println("Enter 2 to remove item");
				System.out.println("Enter 3 to complete");
				input=scanner.nextInt();
				//Method calling
				if(input==1)product.addToCart();
				else if(input==2)product.removeFromCart();
				else if(input==3)product.totalCost();
	            product.toDisplayInfo();
	            Product.updateDiscount(33.33);
	            System.out.println("\nAfter updating discount\n");
				product.toDisplayInfo();
			}
		
			// Close the scanner
			scanner.close();
		}
	}
	