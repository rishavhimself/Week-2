package HierarchicalInheritance.BankAccountTypes;

// Define the subclass
class CheckingAccount extends BankAccount{
    private long withdrawalLimit;

    // Constructor
    CheckingAccount(String accountNumber , long balance, long withdrawalLimit){
        super(accountNumber, balance);
        this.withdrawalLimit=withdrawalLimit;
    }

    // Implementation of displayDetails
    protected void diplayDetails(){
        super.diplayDetails();
        System.out.println("Withdraw Limit : "+ withdrawalLimit);
    }

    // Implementation of displayAccountType
    public void displayAccountType(){
        System.out.println("\nChecking Account");
    }

}