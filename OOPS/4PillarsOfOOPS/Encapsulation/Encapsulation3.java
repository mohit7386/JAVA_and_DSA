//Encapsulation with Validation (Secure Data)
class BankAccount {
    private String Name; // Setting balance to private only user can see the balance
    // constructor to set intial name

    public BankAccount(String initialName) { // Constructor (Set Initial Values only onw time call)
        this.Name = initialName;
    }

    // Setter method
    public void setName(String newName) {
        this.Name = newName;
    }

    // Getter method to read the data
    public String getName() {
        return Name;
    }

}

// Driver Code
public class Encapsulation3 {
    public static void main(String[] args) {
        // Object Creation
        // Using Constructor
        BankAccount Obj1 = new BankAccount("Mohit");
        System.out.println("Initial Name (Constructor): " + Obj1.getName());
        Obj1.setName("Pratap Singh"); // Setting the value to the setter method
        System.out.println("Updated Name (Setter Method): " + Obj1.getName());
    }

}
