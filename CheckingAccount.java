import java.util.Scanner;

interface BankAccount {
     void deposit(int amount);

     void withdraw(int withdraw_amount);

}

public class CheckingAccount implements BankAccount {

    int balance;
    int amount;
    int withdraw_amount;

    public void deposit(int amount) {
        balance += amount;
        System.out.println("The deposited money in the account :" + amount);

    }

    public void withdraw(int withdraw_amount) {
        if (withdraw_amount <= balance) {
            balance -= withdraw_amount;
            System.out.println("The availabe amount int the account :  " + balance);
        } else {
            System.out.println("Insufficient Balance");
        }

    }

    public static void main(String[] args) {
        int x;
        int y;
        Scanner sc=new Scanner(System.in);

        CheckingAccount obj = new CheckingAccount();

        System.out.println("Enter the deposited amount :");
        x=sc.nextInt();

        System.out.println("Enter the withdraw amount :");
        y=sc.nextInt();

        obj.deposit(x);
        obj.withdraw(y);

    }

}
