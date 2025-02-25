//Here we learn about the accesss modifier - 
//Default Modifier - access level of default modifier is only accessible inside the package you cannot access the package outside the class. If you do not specify the access modifier then it will set to the default modifier.
class defaultmodifier {
    String check;

    // method
    void displaycheck() {
        System.out.println("Default Modifier testing: " + check);
    }
}

public class AccessModifier1 {
    public static void main(String[] args) {
        // creating an object
        defaultmodifier Obj = new defaultmodifier(); // - this is a default constructor
        Obj.check = "Successful";
        Obj.displaycheck();
    }

}
