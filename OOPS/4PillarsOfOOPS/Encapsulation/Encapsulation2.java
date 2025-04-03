//Encapsulation with Read only access
class BankAccount {
    private double balance = 58940.47;

    // creating the public getter method to access the data of the private variable
    public double getBalance() { // this class provides read only access because there is no setter method
        return balance;
    }
}

// driver code
public class Encapsulation2 {
    public static void main(String[] args) {
        // creating an object
        BankAccount Obj = new BankAccount();
        System.out.println("Current Balance: " + Obj.getBalance());
    }
}
