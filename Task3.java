public class Task3 {
    public static void main(String[] args) {
        DepositTransaction d1 = new DepositTransaction(1200, 1500);
        WithdrawalTransaction w1 = new WithdrawalTransaction(1200, 1500);

        d1.deposit(300); // Valid deposit
        d1.deposit(1201); // Invalid deposit exceeding limit
        w1.withdraw(1201); // Valid withdrawal
    }
}

// Transaction interface
interface Transaction {
    int getAmount();

    boolean isValid();
}

class DepositTransaction implements Transaction {
    private int amount;
    private int transLimit;
    private int currentAmount;

    DepositTransaction(int amount, int limit) {
        this.amount = amount;
        this.transLimit = limit;
        this.currentAmount = amount;
        System.out.println("Constructor called for DepositTransaction");
    }

    @Override
    public int getAmount() {
        return currentAmount;
    }

    @Override
    public boolean isValid() {
        return currentAmount <= transLimit;
    }

    public void deposit(int depositAmt) {
        if (isValid() && currentAmount + depositAmt <= transLimit) {
            this.currentAmount += depositAmt;
            System.out.println("Amount deposited successfully. Current balance: " + currentAmount);
        } else {
            System.out.println("Deposit failed. Exceeds transaction limit.");
        }
    }
}

class WithdrawalTransaction implements Transaction {
    private int amount;
    private int transLimit;
    private int currentAmount;

    WithdrawalTransaction(int amount, int limit) {
        this.amount = amount;
        this.transLimit = limit;
        this.currentAmount = amount;
        System.out.println("Constructor called for WithdrawalTransaction");
    }

    @Override
    public int getAmount() {
        return currentAmount;
    }

    @Override
    public boolean isValid() {
        return currentAmount >= transLimit;
    }

    public void withdraw(int withdrawAmt) {
        if (isValid() && currentAmount - withdrawAmt >= 0) {
            this.currentAmount -= withdrawAmt;
            System.out.println("Amount withdrawn successfully. Current balance: " + currentAmount);
        } else {
            System.out.println("Withdrawal failed. Insufficient funds or exceeds transaction limit.");
        }
    }
}
