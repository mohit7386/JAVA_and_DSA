
//Single Inheritance Question
//Employee and Manager Inheritance 
import java.util.*;

// Parent Class
class Employee {
    String name;
    int id;
    double salary;

    // Constructor for Employee
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee details
    void displayDetails() {
        System.out.println("\n---- Employee Details ----");
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: " + salary);
    }
}

// Child Class (Manager) - Inheriting from Employee
class Manager extends Employee {
    int teamSize;
    int bonus;

    // Constructor for Manager (calling parent constructor using super)
    Manager(String name, int id, double salary, int teamSize, int bonus) {
        super(name, id, salary); // Calling Employee constructor because if we do this then we can access both of
                                 // the constructor values.
        this.teamSize = teamSize;
        this.bonus = bonus;
    }

    // Method to display Manager details
    void displayManagerDetails() {
        displayDetails(); // Call Employee details
        System.out.println("Team Size: " + teamSize);
        System.out.println("Bonus: " + bonus);
    }
}

// Main Class
public class Inheritance2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Employee Salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter Team Size: ");
        int teamSize = sc.nextInt();

        System.out.print("Enter Bonus Amount: ");
        int bonus = sc.nextInt();

        // Creating an Object of Manager
        Manager obj = new Manager(name, id, salary, teamSize, bonus);

        // Displaying Manager Details
        obj.displayManagerDetails();

        sc.close();
    }
}
