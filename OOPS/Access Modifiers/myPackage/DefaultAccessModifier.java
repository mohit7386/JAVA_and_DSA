//Here we learn about the accesss modifier - 
//Default Modifier - access level of default modifier is can only be accessed inside the same package. If you do not specify the access modifier then it will set to the default modifier.
package myPackage;

class defaultmodifier {
    String check = "Successfull!"; // here we do not specify any of the modifier so java automatically sets the
                                   // default modifier

    // method
    void displaycheck() { // default method
        System.out.println("Default Modifier testing: " + check);
    }
}

public class DefaultAccessModifier {
    public static void main(String[] args) {
        // creating an object
        defaultmodifier Obj = new defaultmodifier(); // - this is a default constructor
        Obj.displaycheck();
    }

}
