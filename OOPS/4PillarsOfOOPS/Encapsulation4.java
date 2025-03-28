import java.util.Scanner;

class BankAccount {
    private double balance; // Private variable to store balance

    // Constructor to set initial balance
    public BankAccount(double initialBalance) {
        if (initialBalance > 0) {
            balance = initialBalance;
        } else {
            balance = 0; // If negative balance is given, set to 0
            System.out.println("Invalid initial balance! Set to 0.");
        }
    }

    // Getter to check balance
    public double getBalance() {
        return balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Withdraw method with validation
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }
}

// **Driver Code**
public class Encapsulation4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter initial balance: ");
        double initialBalance = sc.nextDouble();

        BankAccount myAccount = new BankAccount(initialBalance);

        while (true) {
            System.out.println("\n--- Banking System Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = sc.nextDouble();
                    myAccount.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = sc.nextDouble();
                    myAccount.withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.println("Current Balance: " + myAccount.getBalance());
                    break;
                case 4:
                    System.out.println("Exiting... Thank you for using our banking system.");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please enter again.");
            }
        }
    }
}
