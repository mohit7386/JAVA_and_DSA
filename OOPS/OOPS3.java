//Creating Class
class Dog {
    // Creating attributes
    String name;
    String Breed;
    int age;

    // Creating Method and method ka use isiliye kiya jisse code reusable bane aur
    // bar bar statements naye objects ke liye nahi likhna pade
    void Displaydetails() {
        System.out.println("Dog Name: " + name);
        System.out.println("Breed Name: " + Breed);
        System.out.println("Age: " + age);
    }
}

// Creating a main class
public class OOPS3 {
    public static void main(String[] args) {
        // Creating an object which can access all attributes and method of class
        Dog D1 = new Dog();
        // Now accessing the attributes of the class
        D1.name = " Jacky";
        D1.Breed = "German Shephered";
        D1.age = 5;
        // Calling the method
        D1.Displaydetails();
        System.out.println();
        // We can Create multiple objects using the same class
        Dog D2 = new Dog();
        D2.name = "Shera";
        D2.Breed = "Labra";
        D2.age = 6;
        // Calling Method for second object
        D2.Displaydetails();

    }

}
