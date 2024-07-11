// **2. Create a BankAccount class to simulate a bank account. The class should have the following attributes: account number, account holder name, and balance.
//  Include methods to deposit(), withdraw(), and checkBalance(). Implement functionality to:**

// - Create new accounts
// - Deposit money into the account
// - Withdraw money
// - Check the account balance.

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Welcome to program");
        BankAccount b1 = new BankAccount();
        b1.accountHolder = "Sushant Babu Prasai";
        b1.balance = 10;
        b1.checkBalance();
        b1.accountNumber = 934777934;
        b1.withdraw(12);
        b1.deposit(6500);
        b1.checkBalance();

    }
}

class BankAccount {
    int accountNumber;
    String accountHolder;
    int balance;

    public void deposit(int addAmount) {
        this.balance += addAmount;
        System.out.println("Updated balance: " + balance);
    }

    public int checkBalance() {
        System.out.println("Avaliable balance: " + balance);
        return balance;
    }

    public void withdraw(int withdrawnAmt) {

        if ((this.balance - withdrawnAmt) < 0) {
            System.out.println("Funds not avaliable to withdraw");
        } else {
            System.out.println("Amount withdrawn successfully");
        }
    }
}