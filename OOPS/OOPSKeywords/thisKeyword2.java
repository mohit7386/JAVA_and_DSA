//Calling another Constructor using this() in the same class with the help of constructor
class Student {
    // creating a default constructor
    Student() {
        System.out.println("Mohit Pratap Singh");
    }

    // creating a parameterized constructor
    Student(int x) {
        this(); // calling another constructor (default constructor)
        System.out.println("Percentage: " + x);
    }
}

//Why use this? - To avoid Code duplication and reusability of Code

// Driver code
public class thisKeyword2 {
    public static void main(String[] args) {
        // creating object
        System.out.println("Main method working");
        Student Obj = new Student(10); // passing arguments
        System.out.println(Obj.toString()); // using the Obj variable
    }
}
