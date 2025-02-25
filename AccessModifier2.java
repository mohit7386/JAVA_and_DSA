//private modifier - access level of private modifier is only with in the class we cannot access the data of the private variable outside the class.
//We use getter and setter methods in the same class to access and modify the private data without getter and setter method you cannot access the private data
class privateVariable {
    private String check;

    // creating a setter method to access the data the private data
    public void showDetails(String CheckName) {
        check = CheckName;
    }

    // creating a public getter method and calling the private method to print the
    // private data
    public void display() {
        System.out.println("Private Access Modifier testing: " + check);
    }
}

// main driver code
public class AccessModifier2 {
    public static void main(String[] args) {
        // creating Object
        privateVariable Obj = new privateVariable();
        Obj.showDetails("Successful!");
        Obj.display();
    }

}
