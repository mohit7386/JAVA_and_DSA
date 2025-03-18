//final with classes - It prevents classes to be extended (inheritance) by any other class.
final class FinalClass { // constant class with final keyword
    void show() {
        System.out.println("This is the final class!");
    }
}
// try to extends the class
/*
 * class child extends FinalClass{ - We cannot extends the final class by any
 * other class because parent class already decalred as final
 */

public class FinalKeyword3 {
    public static void main(String[] args) {
        // creating an object
        FinalClass obj = new FinalClass();
        // Accessing the obj
        obj.show(); // accessing the parent method because already it sets as final
    }

}
