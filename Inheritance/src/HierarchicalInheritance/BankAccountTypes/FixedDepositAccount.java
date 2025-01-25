package HierarchicalInheritance.BankAccountTypes;

// Define the subclass
class FixedDepositAccount extends BankAccount{
    private int duration;

    // Constructor
    FixedDepositAccount(String accountNumber , long balance, int duration){
        super(accountNumber, balance);
        this.duration=duration;
    }

    // Implementation of displayDetails
    protected void diplayDetails(){
        super.diplayDetails();
        System.out.println("Duration of fixed deposit : "+duration);
    }

    // Implementation of displayAccountType
    public void displayAccountType(){
        System.out.println("\nFixed Deposit Account");
    }

}
