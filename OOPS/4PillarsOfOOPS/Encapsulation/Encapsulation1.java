/*Encapsulation is the process of hiding the data (variables) of a class and only allowing access through methods. This protects the data from being directly modified and helps in maintaining data integrity and security.

🔹 Why is Encapsulation Needed?
✔ Data Security: Prevents direct access to sensitive data.
✔ Data Hiding: Only specific methods can modify the data.
✔ Code Reusability: Encourages modular code by controlling access.
✔ Better Maintainability: Makes debugging and modification easier.

How to Implement Encapsulation in Java?
Encapsulation is achieved by:
✅ Declaring class variables as private (restrict direct access).
✅ Providing public getter & setter methods to access and modify the private data. */
//Basic Encapsulation using getter and setter method
// package 4PillarsOfOOPS;
class employee {
    private String EmployeeID = "133558475152"; // setting private (Data Hiding)

    // creating a public getter method to read the private data
    public String getId() {
        return EmployeeID;
    }

    // creating a public setter method to modify the private data
    public String setId(String newId) { // modify the employee id and setting new in place of previous one.
        return EmployeeID = newId;
    }
}

// Driver Code
public class Encapsulation1 {
    public static void main(String[] args) {
        // creating a Object
        employee Obj = new employee();
        // Obj.EmployeeId() - ERROR❌- because we cannot access the private variable
        // directly and also we cannot modify the private variable directly we need
        // public getter and setter methods to read and modify the data
        // first accesss the previous id
        System.out.println("Your Previous Employee Id: " + Obj.getId());
        // now accesss the new id
        System.out.println("Your New Employee Id: " + Obj.setId("7906318238"));

    }
}