package BankingSystem;

// Define the subclass
public class CurrentAccount extends BankAccount{

    private boolean isEligible=false;

    // Constructor
    CurrentAccount(String holderName, String accountNumber, double balance){
        super(holderName, accountNumber, balance);
    }

    // Implementation of overridden Methods
    @Override
    public void calculateInterest() {
        System.out.println("The interest is : "+(getBalance()*0.08));
    }

    @Override
    public void applyForLoan() {
        if(isEligible)System.out.println("Applied for loan");
        else System.out.println("Not eligible");
    }

    @Override
    public void calculateLoanEligibility() {
        if(getBalance()>=60000) {
            System.out.println("Eligible");
            isEligible=true;
        }
        else System.out.println("Not eligible");
    }
}
