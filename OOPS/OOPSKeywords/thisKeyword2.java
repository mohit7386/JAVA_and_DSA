class Student {
    private int percentage;

    // creating a default constructor
    Student() {
        System.out.println("Mohit Pratap Singh");
    }

    // creating a parameterized constructor
    Student(int x) {
        this(); // calling another constructor (default constructor)
        this.percentage = x;
    }

    // Getter method for percentage for accessing the private data
    public int getPercentage() {
        return this.percentage;
    }
}

// Driver code
public class thisKeyword2 {
    public static void main(String[] args) {
        // creating object
        System.out.println("Main method working");
        Student Obj = new Student(10); // passing arguments

        // Directly printing the desired information
        System.out.println("Percentage: " + Obj.getPercentage());
    }
}