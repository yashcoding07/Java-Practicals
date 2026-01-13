public class BankSystem {
    public static void main(String[] args){
        BankAccount b1 = new BankAccount();
        BankAccount b2 = new BankAccount(true);
        BankAccount b3 = new BankAccount(12345, "Hetvi", 10000.00); 
        
        System.out.println("Bank Account 1: ");
        b1.deposite(1000);
        b1.printAccountDetails();
    }
}

class BankAccount {
    final private int accountNumber;
    private String accountHolderName;
    private double balance;
    
    // default constructor
    BankAccount() {
        accountNumber = 0;
        accountHolderName = "not Assigned";
        balance = 0.0;
    }

    // No arg constructor
    BankAccount(boolean bankDefault) {
        accountNumber = 100;
        accountHolderName = "New account";
        balance = 1000.0;
    }

    // paramaterised constructor
    BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // getters and setters
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setBalance(double balance) {
        if (balance > 0){
            this.balance = balance;
        } else {
            System.out.println("Invalid Balance");
        }
    }

    public double getBalance() {
        return balance;
    }

    // depositing money
    double deposite(double amount) {
        return balance + amount;
    }

    double deposite(double amount, String mode) {
        return balance + amount;
    }

    double deposite(double amount, String mode, double bonus) {
        return balance + bonus + amount;
    }

    void printAccountDetails() {
        System.out.println("Account number: " + accountNumber);
        System.out.println("Account Holder name: " + accountHolderName);
        System.out.println("balance: " + balance);
    }
}
