//Creating a Class (Blueprint)
class Car {
    String Color;
    String brand;
    int Speed;

    // Creating a method
    void displayCar() {
        System.out.println("Car Color: " + Color);
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Speed: " + Speed + " km/h");
    }
}

// main code
public class OOPS1 {
    public static void main(String[] args) {
        // Object Creation
        // Syntax
        // Classname objectname = new Calssname(); // in which new keyword which
        // allocates the space for the object in heal memory
        System.out.println("_________________");
        System.out.println("Details of Car 1: ");
        System.out.println("-----------------");
        Car car1 = new Car();
        // Now we can use attributes of the class with the help of object
        car1.Color = "Black";
        car1.brand = "Tesla";
        car1.Speed = 200;
        // object ke through method ko call karenge
        car1.displayCar();

        // here we can create multiple objects with the same class
        System.out.println();
        System.out.println("________________");
        System.out.println("Details of Car 2");
        System.out.println("----------------");
        Car car2 = new Car();
        car2.Color = "Blue";
        car2.brand = "TATA Avinya";
        car2.Speed = 300;
        // calling method
        car2.displayCar();

    }

}
