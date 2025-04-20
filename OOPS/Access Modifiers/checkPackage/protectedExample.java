//Here we are learning about the Protected Access Modifiers
/*Protected members can be accessed:
1- Within the same package.
2- In subclasses (even if they are in a different package). */
package checkPackage;

public class protectedExample {
    protected String name = "Mohit Pratap Singh";

    // creating method
    protected void getName() {
        System.out.println("Hello " + name + " From Protected Member!");
    }
}
