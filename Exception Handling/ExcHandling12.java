class LowBalanceException extends Exception {
    public LowBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws LowBalanceException {
        if (amount > balance) {
            throw new LowBalanceException("Insufficient Balance!");
        }
        balance -= amount;
        System.out.println("Withdraw Successful! Remaining balance: ₹" + balance);
    }
}

public class ExcHandling12 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(5000);

        try {
            account.withdraw(6000); // Trying to withdraw more than balance
        } catch (LowBalanceException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }
    }
}
