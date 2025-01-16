// Import Scanner class from util package for user input
import java.util.Scanner;
// Create Book Class
 class Book{
	String title;
	String author;
	double price;
	
	Book(String title, String author, double price){
		this.title=title;
		this.author=author;
		this.price=price;
	}
	
	void displayDetails(){
		System.out.println("Title : "+title);
		System.out.println("Author : "+author);
		System.out.println("Price (INR) : " +price);
	}
}
public class Books{
		public static void main(String args[]){
			
			// Create a Scanner object for taking input
			Scanner scanner = new Scanner(System.in);
			
			// Ask the user to enter the title of the book
			System.out.println("Enter the title of the book");
			String title= scanner.nextLine();
			
			// Ask the user to enter the name of the author
			System.out.println("Enter the name of the author");
			String author=scanner.nextLine();
			
			// Ask the user to enter the price
			System.out.println("Enter the price of the book");
			double price=scanner.nextDouble();
			
			//Creating the object
			Book book = new Book(title,author,price);
			
			//Method calling
			book.displayDetails();
		
			// Close the scanner
			scanner.close();
		}
	}
	