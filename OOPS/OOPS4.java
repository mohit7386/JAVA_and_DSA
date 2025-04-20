//Creating Class
class Mobile {
    String Brand;
    int Price;
    int RAM;
    int Storage;

    // Creating a method
    void displaydetails() {
        System.out.println("Mobile Specifications: ");
        System.out.println("Brand: " + Brand);
        System.out.println("Price: " + Price);
        System.out.println("RAM: " + RAM + " GB");
        System.out.println("Storage: " + Storage + " GB");
    }
}

// main class
public class OOPS4 {
    public static void main(String[] args) {
        // Creating an Object
        Mobile Mob1 = new Mobile();
        // Accessing Attributes
        Mob1.Brand = "Samsung";
        Mob1.Price = 130000;
        Mob1.RAM = 16;
        Mob1.Storage = 500;
        // Calling Method for object 1
        Mob1.displaydetails();
        System.out.println();

        // Creating the second object
        Mobile Mob2 = new Mobile();
        Mob2.Brand = "Apple";
        Mob2.Price = 120000;
        Mob2.RAM = 12;
        Mob2.Storage = 256;
        // Calling Method for object 2
        Mob2.displaydetails();
    }
}
