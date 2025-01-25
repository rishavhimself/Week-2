package BankingSystem;

// Define the main class
public class BankingSystem {
    public static void main(String[] args){

        // Create instances
        BankAccount savingsAccount = new SavingsAccount("Rishav","20407460",10000);
        BankAccount currentAccount = new CurrentAccount("Raxx", "323343423",12345678);

        // Function Call
        savingsAccount.calculateInterest();
        savingsAccount.calculateLoanEligibility();
        savingsAccount.applyForLoan();

        // Function Call
        currentAccount.calculateInterest();
        currentAccount.calculateLoanEligibility();
        currentAccount.applyForLoan();
    }
}
