// Import Scanner class from util package for user input
import java.util.Scanner;
// Create BankAccount Class 
class BankAccount{
    static String bankName="ABC Bank";
    static int totalNumber=0;
	String accountHolder;
	final String accountNumber;
	Long balance;
	
	BankAccount(String accountHolder, String accountNumber, Long balance){
		this.accountHolder= accountHolder;
		this.accountNumber= accountNumber;
		this.balance=balance;
        totalNumber++;
	}
	
    static void getTotalAccount(){
          System.out.println("Total number of accounts are : "+totalNumber);
        }
	
    void displayDetails(){
		System.out.println("Name of the Bank : "+ bankName);
		System.out.println("Name of Account Holder : "+ accountHolder);
		System.out.println("Account number : "+ accountNumber);
		System.out.println("Current Balance :" +balance);
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
    
	
}

public class BankAccounts{
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
	
			// Object of BankAccount class
			BankAccount bankAccout = new BankAccount(accountHolder,accountNumber,balance);

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
            if(bankAccout instanceof BankAccount){
                System.out.println("The given object is an instance of BankAccount Class ");
			    if(input==1)bankAccout.displayDetails();
			    else if(input==2)bankAccout.deposit(money);
			    if(input==3)bankAccout.withdraw(money);
            }
			// Close the scanner
			scanner.close();
		}
	}
	