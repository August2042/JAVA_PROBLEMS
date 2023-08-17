// Base class representing a bank account
class Account {
    long account_number; // Account number
    double balance = 0; // Initial balance set to 0

    // Method to deposit money into the account
    public void deposit(double amount) {
        balance = balance + amount; // Update the balance
        System.out.println("ACC. No :" + account_number);
        System.out.println("Deposit money :" + balance);
    }

    // Method to withdraw money from the account
    public void withdraw(double withdraw_amount) {
        if (balance >= withdraw_amount) {
            balance = balance - withdraw_amount; // Update the balance
            System.out.println("Withdraw money :" + withdraw_amount);
            System.out.println("Remaining balance  :" + balance);
        } else {
            System.out.println("Insufficient Balance !!!!");
        }
    }
}

// Subclass representing a savings account
class SavingAccount extends Account {
    int roi, t; // Rate of interest and time

    // Constructor for the SavingAccount class
    SavingAccount(long account_number, double balance, int roi, int t) {
        this.account_number = account_number;
        this.balance = balance;
        this.roi = roi;
        this.t = t;
    }

    // Method to calculate interest and update balance
    public void Calculate_Interest() {
        double Interest;

        Interest = (balance * roi * t) / 100;

        double addition_of_interest_in_balance = balance + Interest;

        System.out.println("Calculated Interest :" + Interest);
        System.out.println("Total Balance :" + addition_of_interest_in_balance);

    }

    // Method to display overdraft limit for savings account
    public void overdraftLimit() {
        System.out.println("Overdraft Limit :50000");
    }
}

// Subclass representing a checking (current) account
class CheckingAccount extends Account {
    int roi, t; // Rate of interest and time

    // Constructor for the CheckingAccount class
    CheckingAccount(long account_number, double balance, int roi, int t) {
        this.account_number = account_number;
        this.balance = balance;
        this.roi = roi;
        this.t = t;
    }

    // Method to calculate interest and update balance for checking account
    public void Calculate_Interest() {
        double Interest;

        Interest = (balance * roi * t) / 100;

        double addition_of_interest_in_balance = balance + Interest;

        System.out.println("Calculated Interest :" + Interest);
        System.out.println("Total Balance :" + addition_of_interest_in_balance);

    }

    // Method to display overdraft limit for checking account
    public void overdraftLimit() {
        System.out.println("Overdraft Limit :60000");
    }
}

// Main class to demonstrate the account types
public class lms_q3_17 {
    public static void main(String[] args) {
        System.out.println("Welcome to Saving Account");
        
        // Create an instance of SavingAccount
        SavingAccount obj = new SavingAccount(15484344848741L, 0, 7, 2);
        obj.deposit(1000);
        obj.withdraw(450);
        obj.Calculate_Interest();
        obj.overdraftLimit();
        
        System.out.println();
        System.out.println("Welcome to current account");
        
        // Create an instance of CheckingAccount
        CheckingAccount obj1 = new CheckingAccount(154854687645741L, 0, 5, 3);
        obj1.deposit(5000);
        obj1.withdraw(500);
        obj1.Calculate_Interest();
        obj1.overdraftLimit();

    }
}
