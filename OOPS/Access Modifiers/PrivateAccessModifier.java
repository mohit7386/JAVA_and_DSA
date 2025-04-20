//private modifier - access level of private modifier is only with in the class we cannot access the data of the private variable outside the class.
//We use getter and setter methods in the same class to access and modify the private data without getter and setter method you cannot access the private data
class privateVariable {
    private String check = "Hello Mohit"; // Private modifier with it's value which cannont be modify directly

    // creating a setter method to modify the private data using the public method
    public void showDetails(String CheckName) {
        check = CheckName;
    }

    // creating a public getter method to access the private data safely
    public void display() {
        System.out.println(check);
    }
}

// main driver code
public class PrivateAccessModifier {
    public static void main(String[] args) {
        // creating Object
        privateVariable Obj = new privateVariable();
        Obj.showDetails("Successful!");
        Obj.display();
    }

}
