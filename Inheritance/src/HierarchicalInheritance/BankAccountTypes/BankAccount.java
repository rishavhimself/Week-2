package HierarchicalInheritance.BankAccountTypes;

// Define the superclass
class BankAccount{
    protected String accountNumber;
    protected long balance;

    // Constructor
    BankAccount(String accountNumber , long balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }

    // Implementation of displayDetails
    protected void diplayDetails(){
        System.out.println("Account Number : "+accountNumber);
        System.out.println("Balance : INR "+ balance);
    }
}