//Passing this as a parameter and also used in object communication 
class B {
    void show() {
        new A().display(this); // Passing this as a parameter
    }

}

class A {
    void display(B obj) { // passing object of B as an argument
        System.out.println("Method called using 'this' keyword.");
    }
}

public class thisKeyword5 {
    public static void main(String[] args) {
        B obj = new B();
        obj.show(); // Output: Method called using 'this' keyword.
    }
}
