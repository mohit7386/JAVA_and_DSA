//Run Time Polymorphism - which is achieved by Method Overriding
//What is Method Overriding ?-
/*When a child class gives its own version of a method that already exists in its parent class – this is called Method Overriding.

🎯 Condition:
Same method name

Same parameters

But different method body (logic)

 */
//Method Overriding Example-
class Vehicle {
    void Car() {
        System.out.println("Car Speed will be max 300km/h!");
    }
}

// child class
class Bike extends Vehicle {
    // @Override - same method and parameters but dfferent body and same method
    // signature
    void Car() {
        System.out.println("Car Brand: Mercedes");
    }
}

// Driver Code
public class Polymorphism2 {
    public static void main(String[] args) {
        // creating an Object
        Vehicle Obj = new Bike(); // Parent reference vehicle and child class object Bike
        Obj.Car();
    }

}
