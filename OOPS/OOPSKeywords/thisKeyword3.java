//Returning current class instance 

/* Test ek class hai, jo ek method getInstance() provide karti hai.
🔹 getInstance() method this return karta hai, jo current object ka reference hai.
🔹 show() ek simple method hai jo ek message print karta hai. */
class Test {
    // creating method
    Test getInstance() {
        return this; // Returning Current Object which is the refrence of current object
    }

    public void show() {
        System.out.println("Hello I am from first class!");
    }
}

// Driver code
public class thisKeyword3 {
    public static void main(String[] args) {
        // creating an object
        Test Obj = new Test().getInstance(); // calling getInstance which returns 'this'
        Obj.show(); // Method Calling
    }

}
/*
 * the "current object reference" means the object that was originally created
 * using new Test() is being used again.
 * ✔️ getInstance() is just returning that same object, and we are storing it in
 * Obj.
 * ✔️ That’s why we can use Obj.show(); to call methods on the same object.
 */
