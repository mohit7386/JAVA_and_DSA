//4 Pillars of OOPS - Encapsulation , Polymorphism , Abstraction , Inheritance
//Encapsulation
class BankAccount {
    // Data members
    private double balance; // Private variable (data hiding) - user modify nhi kar paaye data ko

    // Constructor
    BankAccount(double initialbalance) {
        System.out.println();
        System.out.println("Account Details:- ");
        // checking case
        if (initialbalance > 0) { // agar balance hamara 0 se jyada hai to display kara denge
            balance = initialbalance;
        }
    }

    // public method banayenge deposit money ke liye - public isiliye jisse sab koi
    // access kar paaye user ko dikhe
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposited: " + amount);
        }
    }

    // public method for withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    // public method to get balance
    public double getbalance() {
        return balance;
    }
}

public class OOPS9 {
    public static void main(String[] args) {
        // creating object
        BankAccount acc = new BankAccount(5000);
        acc.deposit(2000); // Depositing money
        acc.withdraw(500); // Withdrawn Money
        // checking current balance
        System.out.println("current Balance: " + acc.getbalance());

    }
}
