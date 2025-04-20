//Differentiate between the instance variable and method parameteres when both have the same name
class Student {
    String name; // instance Variable

    // creating parameterized constructor
    Student(String name) { // So here parameter and instance variable both have same name so this.name jo
                           // hai wo point kar raha hai class variable ko and name kewal refer kar raha hai
                           // parameter ko

        this.name = name; // this.name refers to the instance variable and name refers to the parameter
        // without 'this' Java assumes name = name -> which has Nothing
    }

    // creating a method to display the details
    public void display() {
        System.out.println("Student Name: " + this.name);
    }

    public class thisKeyword1 {
        public static void main(String[] args) {
            // creating an object
            Student S1 = new Student("Mohit Pratap Singh");
            S1.display();
        }
    }
}