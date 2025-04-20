
//Encapsulation in Employee Data 
import java.util.*;

class Employee {
    private String name;
    private int id;
    private double salary;

    // Setter for name
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Invalid name! Cannot be empty.");
        }
    }

    // Setter for ID with validation
    public void setId(int id) {
        if (id >= 1000 && id <= 9999) { // It Insures that the id should be only 4 digits.
            this.id = id;
        } else {
            System.out.println("Invalid ID! It must be a 4-digit number.");
        }
    }

    // Setter for Salary with validation
    public void setSalary(double salary) {
        if (salary >= 10000) {
            this.salary = salary;
        } else {
            System.out.println("Invalid Salary! It must be at least 10,000.");
        }
    }

    // Display employee details with method
    /*
     * Here we don't need getter method because we can also access the private data
     * without getters but in the same class which is Employee
     * dekho yahin pe print kara rahe hain apne sout ki help se to hum aise access
     * kar sakte hain same class mein.
     * 
     * but agar hum outside the class isko karenge to error aayega because we use
     * getter methos to access the private data outside the class.
     * 
     * Example - we can create a getter method in the same class -
     * public String getName() {
     * return name;
     * }
     * then we can access the private data from outside the class or in different
     * class. (Like main class - System.out.println(emp.getName());
     * 
     */
    public void displayDetails() {
        System.out.println("\n--- Employee Details ---");
        System.out.println("Name: " + this.name);
        System.out.println("ID: " + this.id);
        System.out.println("Salary: " + this.salary);
    }
}

// **Driver Code**
public class Encapsulation5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Creating an Object
        Employee emp = new Employee();

        System.out.print("Enter Employee Name: ");
        emp.setName(sc.nextLine()); //naye variable ki need nahi hai direct usi me hum paas kar sakte hain values ko 

        System.out.print("Enter Employee ID (4-digit): ");
        int inputId = sc.nextInt();
        sc.nextLine(); // Consume newline to fix input issue
        emp.setId(inputId);

        System.out.print("Enter Employee Salary (>=10,000): ");
        double inputSalary = sc.nextDouble();
        emp.setSalary(inputSalary);

        emp.displayDetails(); // Display employee details
        sc.close();
    }
}
