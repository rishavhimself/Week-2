package BankingSystem;

// Define the superclass
public abstract class BankAccount implements Loanable{
    private String accountNumber, holderName;
    private double balance;

    // Constructor
    BankAccount(String holderName, String accountNumber, double balance){
        setHolderName(holderName);
        setAccountNumber(accountNumber);
        setBalance(balance);
    }

    //Getter and Setter Methods
    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){
        balance+=amount;
    }

    // Implementation of withdraw method
    public void withdraw(double amount){
        if(amount<0)System.out.println("Invalid Amount");
        else if(amount>balance)System.out.println("Low Balance, Can't Withdraw !");
        else balance-=amount;
    }

    // Abstract method
    public abstract void calculateInterest();
}
