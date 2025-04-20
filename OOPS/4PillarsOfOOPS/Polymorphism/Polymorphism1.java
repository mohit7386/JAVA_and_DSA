/*Now we are starting the new topic Polymorphism
 * Polymorphism = Poly (many) + morph (forms)
👉 It means one thing behaving in many forms.

In Java, polymorphism allows:

1- One method to behave differently based on object/class

2- Reusability of code

3- Easier maintenance

TYPES OF POLYMORPHISM-
Java supports two types:

1️⃣ Compile-time Polymorphism (Static Binding / Method Overloading)

* Achieved via Method Overloading

* Decision taken at compile-time

2️⃣ Runtime Polymorphism (Dynamic Binding / Method Overriding)

* Achieved via Method Overriding

* Decision taken at runtime using object type

So here we are doing first compile time polymorphism which is achieved by Method Overloading:-
Compile-Time Polymorphism (Method Overloading)
💡 What is Method Overloading?
Same method name but different parameters (type(Data Type) or number(How many parameters we have)).
 */
class Calculator {
    // Here we are defining the same name method but the parameter and their types
    // of all these
    // methods are different So that's we called method overloading.
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

// Driver Code
public class Polymorphism1 {
    public static void main(String[] args) {
        // creating an object
        Calculator cal = new Calculator();
        System.out.println("----Result----");
        System.out.println(cal.add(5, 6)); // Compiler Knows in advance which version to call that's why polymorphism
        System.out.println(cal.add(2.5, 1.5));
        System.out.println(cal.add(2, 4, 6));
    }

}
