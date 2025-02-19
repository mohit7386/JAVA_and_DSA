//Constructor- It is a Special method which is used to initialise an object when it is created.
//Cons - Ki jab hum multiple details ek saath print karna chahein to jisme different values print nahi hongi uske liye humein parameterized constructor use karna padega
//Creating a class
class Car {
    String Model;
    String Brand;
    int speed;

    // Creating Constructor (Defualt Constructor)
    Car() {
        System.out.println("Constructor is created");
        Model = "2024";
        Brand = "Mercedes Benz";
        speed = 250;
    }

    // Creating method
    void Visible() {
        System.out.println("Car Brand: " + Brand);
        System.out.println("Car Model: " + Model);
        System.out.println("Car Speed: " + speed + " km/h");
    }
}

// Main method
public class OOPS5 {
    public static void main(String[] args) {
        // creating an object (Constructor called automatically)
        Car C1 = new Car();
        C1.Visible();
    }
}
