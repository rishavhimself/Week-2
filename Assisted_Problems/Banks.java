// Import Scanner class and arraylist from util package for user input and data storage
import java.util.ArrayList;
import java.util.Scanner;
// Create BankAccount Class 
class Bank{
    static String bankName="ABC Bank";
	static String bankAddress="XYZ";
	static int totalNumber=0;
	
	private ArrayList<String> accounts = new ArrayList<>();
	
	void openAccount(String newAccount){
		accounts.add(newAccount);
		totalNumber++;
		System.out.println("\nAccount Opened Successfully");
	}

    static void getTotalAccount(){
          System.out.println("Total number of accounts are : "+totalNumber);
        }
	
    void displayDetails(){
		System.out.println("\nName of the Bank : "+ bankName);
		System.out.println("Total number of accounts : "+totalNumber);
	}
    
	
}

class Customer{
	String accountHolder;
	final String accountNumber;
	Long balance;
	
	public Customer(String accountHolder, String accountNumber, Long balance){
		this.accountHolder= accountHolder;
		this.accountNumber= accountNumber;
		this.balance=balance;

	}

	void withdraw(Long money){
		if(money>balance)System.out.println("Low Balance, Can't Withdraw");
		else{
			balance-=money;
		}
		displayDetails();
	}

	void deposit(Long money){
		balance+=money;
		displayDetails();
	}

	void displayDetails(){
		System.out.println("Name of the Bank : "+ Bank.bankName);
		System.out.println("Name of Account Holder : "+ accountHolder);
		System.out.println("Account number : "+ accountNumber);
		System.out.println("Current Balance :" +balance);
	}
	
}
	

public class Banks {
    public static void main(String args[]){
		// Create a Scanner object for taking input
		Scanner scanner = new Scanner(System.in);
		
		// Ask the user to enter the name of holder
		System.out.println("Enter the account holder name");
		String accountHolder= scanner.nextLine();
		
		// Ask the user to enter the account number
		System.out.println("Enter the account number");
		String accountNumber=scanner.nextLine();
		
		// Ask the user to enter the balance
		System.out.println("Enter the balance");
		Long balance=scanner.nextLong();

		// Object of Bank Class
		Bank bank1 = new Bank();

		// Object of Customer class
		Customer customer = new Customer(accountHolder,accountNumber,balance);

		bank1.openAccount(accountNumber);
		bank1.displayDetails();
		// Display
		System.out.println("Enter 1 to current balance");
		System.out.println("Enter 2 to deposit money");
		System.out.println("Enter 3 to withdraw money");
		int input=scanner.nextInt();
		Long money=0l;
		if(input<1&&input>3)System.out.println("Invaild Input");
		else if(input!=1){
			System.out.println("Enter the amount");
			money=scanner.nextLong();
		}
		if(customer instanceof Customer){
			if(input==1)customer.displayDetails();
			else if(input==2)customer.deposit(money);
			if(input==3)customer.withdraw(money);
		}
		// Close the scanner
		scanner.close();
	}
}
