//Constructor - Perameterized Constructor (Here we can pass different values which helps to display the details of multiple things with the same class and same constructor with the help of creating the multiple objects )
//Parameterized Constructor ki help se hum multiple details ko print kara sakte hain naya object create karke usme values pass karke 
class Car {
    String Brand;
    int Model;
    int Speed;

    // Creating constructor ( parameterized Constructor )
    Car(String CBrand, int CModel, int CSpeed) {
        Brand = CBrand;
        Model = CModel;
        Speed = CSpeed;

    }

    // creating a method
    void display() {
        System.out.println("Car Details:-");
        System.out.println("Car Brand: " + Brand);
        System.out.println("Car Model: " + Model);
        System.out.println("Car Speed: " + Speed + " km/h");
        System.out.println();
    }
}

// Main Code
public class OOPS6 {
    public static void main(String[] args) {
        // creating an object
        Car C1 = new Car("Mercedes", 2024, 250);
        // Calling Method
        C1.display();
        // Creating new object for displaying another car details
        Car C2 = new Car("BMW", 2023, 340);
        C2.display();
        // Creating another Object
        Car C3 = new Car("Audi", 2022, 250);
        C3.display();

    }

}
