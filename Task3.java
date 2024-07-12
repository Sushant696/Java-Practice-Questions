
// **4. Design and implement a Java program that simulates a financial transaction system.
//  Your system should be capable of processing different types of transactions, such as deposits and withdrawals, and alerting if any transactions exceed certain limits.
//   Use interfaces to define common behaviors for transactions and implement these behaviors in different transaction classes.
//    Create an interface named Transaction with at least two methods:**

// - getAmount() which returns the amount of the transaction as a double
// - isValid() which returns a boolean indicating if the transaction is valid based on certain criteria. 
// Implement the Transaction interface in at least three separate classes, DepositTransaction and WithdrawalTransaction.
//   Each class should have a constructor that sets a limit for transactions and specific logic to determine if the transaction is valid.

public class Task3 {
    public static void main(String[] args) {
        DepositTransaction d1 = new DepositTransaction(1200, 1500);
        WithdrawalTransaction w1 = new WithdrawalTransaction(1200, 1500);
        d1.Deposit(301);
        w1.Withdraw(1201);

    }
}

// Transaction interface
interface Transaction {
    int getAmount();

    boolean isValid();
}

class DepositTransaction implements Transaction {
    final int amount;
    static int transLimit;
    static boolean valid;

    DepositTransaction(int amount, int limit) {
        this.amount = amount;
        this.transLimit = limit;
        System.out.println("constructor called of deposit class");

    }

    @Override
    public int getAmount() {
        System.out.println(this.amount);
        return 1;
    };

    @Override
    public boolean isValid() {
        // System.out.println('');
        System.out.println(this.amount);
        return false;

    };

    public void Deposit(int depositAmt) {

        System.out.println("Deposit amount");
        if (transLimit < (amount + depositAmt)) {
            System.out.println(
                    "Your deposit amount exceeds the transaction limit by:" + ((amount + depositAmt) - transLimit));
            this.valid = false;

        } else {
            System.out.println("Amount deposited successfully, current balance is : " + (amount + depositAmt));
        }

    }
}

class WithdrawalTransaction implements Transaction {
    private static int amount;
    static boolean valid;
    static int transLimit;

    WithdrawalTransaction(int amount, int limit) {
        this.amount = amount;
        this.transLimit = limit;

        // if (amount)

    }

    @Override
    public int getAmount() {
        // System.out.println(this.amount);
        return amount;
    };

    @Override
    public boolean isValid() {
        // System.out.println('');
        // System.out.println(this.valid);
        // return true;
        return amount <= transLimit;

    };

    public void Withdraw(int withdrawAmt) {
        if (amount - withdrawAmt <= 0) {
            this.valid = false;
            System.out.println("Insufficient funds.");
        } else {
            this.valid = true;
        }
        if (valid) {
            this.amount += withdrawAmt;
            System.out.println("Amount deposited successfully, current balance is: " + amount);
        }

    }
}
