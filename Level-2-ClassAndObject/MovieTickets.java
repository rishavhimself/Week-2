// Import Scanner class from util package for user input
import java.util.Scanner;
// Create MovieTicket Class
class MovieTicket{
	String movieName;
	String seatNumber;
	double price;
	
	MovieTicket(String movieName, String seatNumber, double price){
		this.movieName= movieName;
		this.seatNumber= seatNumber;
		this.price=price;
	}
	
	void displayTicketDetails(){
		System.out.println("Movie name : "+movieName);
		System.out.println("Seat number : "+seatNumber);
		System.out.println("Price :" +price);
	}
	
	void bookTicket(int quantity){
		price*=quantity;
		System.out.println("Total cost is : "+price);
	}
	
}
public class MovieTickets{
		public static void main(String args[]){
			
			// Create a Scanner object for taking input
			Scanner scanner = new Scanner(System.in);
			
			// Ask the user to enter the movie name
			System.out.println("Enter the name of the movie");
			String movieName= scanner.nextLine();
			
			// Ask the user to enter the seat number
			System.out.println("Enter the seat number");
			String seatNumber=scanner.nextLine();
			
			// Ask the user to enter the price
			System.out.println("Enter the Price");
			double price=scanner.nextDouble();
			
			//Creating the object
			MovieTicket ticket = new MovieTicket(movieName,seatNumber,price);
			
			//Method calling
			ticket.displayTicketDetails();
			System.out.println("Enter Quantity ")
			int quantity=scanner.nextInt();
			ticket.bookTicket(quantity);
		
			// Close the scanner
			scanner.close();
		}
	}
	