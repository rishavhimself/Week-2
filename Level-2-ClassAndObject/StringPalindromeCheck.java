// Import Scanner class from util package for user input
import java.util.Scanner;
// Create PalindromeChecker Class to check String Palindrome
class PalindromeChecker{
	boolean flag = true;
	String string ;

	PalindromeChecker(String string){
		this.string=string;
	}
	
	
	void checkPalindrome(){
		int start=0,end=string.length()-1;
		while(start<=end){
			if(string.charAt(start)!=string.charAt(end)){
				flag=false;
				break;
			}
			
			start++;end--;
		}
	}
	
	void displayResult(){
		if(flag)System.out.println("The Given String is Palindrome");
		else System.out.println("The Given String is not Palindrome");
	}


}


public class StringPalindromeCheck {
	
	public static void main(String args[]){
		
		 // Create a Scanner object for taking input
		Scanner scanner =new Scanner(System.in);
		
		// Ask the user to enter the string
		System.out.println("Enter a String");
		String string = scanner.nextLine();
		string=string.toLowerCase();
		
		//Creating the object
		PalindromeChecker check = new PalindromeChecker(string);
		
		//Method calling
		check.checkPalindrome();
		check.displayResult();
 
		// Close the scanner
		scanner.close();
	}
}