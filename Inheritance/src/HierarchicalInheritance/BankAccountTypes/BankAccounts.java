package HierarchicalInheritance.BankAccountTypes;

// Main class
public class BankAccounts {
    public static void main(String[] args) {

        // Create instances
        SavingsAccount newSavingsAccount = new SavingsAccount("20407460", 1000, 7.8);
        CheckingAccount newCheckingAccount = new CheckingAccount("20407461", 1000000, 50000);
        FixedDepositAccount newFixedDepositAccount = new FixedDepositAccount("20407462", 100000, 2);

        // Function Call
        newSavingsAccount.displayAccountType();
        newSavingsAccount.diplayDetails();
        newCheckingAccount.displayAccountType();
        newCheckingAccount.diplayDetails();
        newFixedDepositAccount.displayAccountType();
        newFixedDepositAccount.diplayDetails();

    }
}
