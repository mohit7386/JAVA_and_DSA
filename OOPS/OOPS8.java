//Copy Constructor
class Car {
    String Name;

    // Constructr
    Car(String CName) {
        Name = CName;
    }

    // Copy Constructor
    Car(Car a) {
        Name = a.Name;
    }

    // method
    void display() {
        System.out.println("Car Name: " + Name);
        System.out.println();
    }
}

// main code
public class OOPS8 {
    public static void main(String[] args) {
        // creating an object
        Car C1 = new Car("Mercedes");
        Car C2 = new Car(C1);
        // Calling method
        C1.display();
        C2.display();
    }

}
