// Returning current class instance

/*
 * Test ek class hai, jo ek method getInstance() provide karti hai.
 * 🔹 getInstance() method this return karta hai, jo current object ka reference
 * hai.
 * 🔹 show() ek simple method hai jo ek message print karta hai.
 */
class Test {
    // creating method
    Test getInstance() {
        return this; // Returning Current Object which is the refrence of current object
    }

    public void show() {
        System.out.println("Hello I am from first class!");
    }

    public void display() {
        System.out.println("Hey I am just checking the method chaining!");
    }
}

// Driver code
public class thisKeyword4 {
    public static void main(String[] args) {
        // method chaining - which means calling multiple methods in one line
        new Test().getInstance().show(); // calling getInstance and show method which returns 'this' and some printing
                                         // statement
        Test Obj = new Test();
        Obj.display();

    }
}
/*
 * the "current object reference" means the object that was originally created
 * using new Test() is being used again.
 * ✔️ getInstance() is just returning that same object, and we are storing it in
 * Obj.
 * ✔️ That’s why we can use Obj.show(); to call methods on the same object.
 */
