package HierarchicalInheritance.BankAccountTypes;

// Define the subclass
class SavingsAccount extends BankAccount{
    private double interestRate;

    // Constructor
    SavingsAccount(String accountNumber , long balance, double interestRate){
        super(accountNumber, balance);
        this.interestRate=interestRate;
    }

    // Implementation of displayDetails
    protected void diplayDetails(){
        super.diplayDetails();
        System.out.println("Interest Rate : "+interestRate);
    }

    // Implementation of displayAccountType
    public void displayAccountType(){
        System.out.println("\nSavings Account");
    }
}