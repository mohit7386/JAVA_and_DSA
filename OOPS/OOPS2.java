
//User Defined OOPS Example
import java.util.*;

//creating a class
class Student {
    String name;
    int Class;
    int age;

    // creating a method
    void displaydetails() {
        System.out.println("Student Details: ");
        System.out.println("Name: " + name);
        System.out.println("Class: " + Class);
        System.out.println("Age: " + age);

    }
}

// main method
public class OOPS2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name of the student: ");
        String Sname = sc.nextLine();
        System.out.print("Enter Class of the student: ");
        int SClass = sc.nextInt();
        System.out.print("Enter Age of the student: ");
        int SAge = sc.nextInt();

        // Creating a object
        Student S1 = new Student();
        S1.name = Sname;
        S1.Class = SClass;
        S1.age = SAge;
        // Calling Method
        S1.displaydetails();
        sc.close();

    }

}
