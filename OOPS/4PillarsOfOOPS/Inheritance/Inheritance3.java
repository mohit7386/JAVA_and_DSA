
//Single Inheritance Question 3 
import java.util.*;

class Restaurant {
    String name;
    String location;
    int rating;

    // create Constructor to assign the values
    Restaurant(String name, String location, int rating) {
        this.name = name;
        this.location = location;
        this.rating = rating;

    }

    // display restaurant details
    void displayRestaurantDetails() {
        System.out.println("---Restaurant Details---");
        System.out.println("Restaurant Name: " + name);
        System.out.println("Restaurant Location: " + location);
        System.out.println("Restaurant Rating: " + rating);
    }
}

// creating child class that inherits the parent class
class Fastfood extends Restaurant {
    String Foodtype;
    Boolean DeliveryAvailable;

    // creating a constructor for fastfood class
    Fastfood(String name, String location, int rating, String Foodtype, Boolean DeliveryAvailable) {
        super(name, location, rating); // calling parent class constructor using super because we can access the both
                                       // parent and class constructors
        this.Foodtype = Foodtype;
        this.DeliveryAvailable = DeliveryAvailable;
    }

    // method to display the fastfood class
    void fastfoodDetails() {
        displayRestaurantDetails(); // Calling Parent method so that ki hum ek hi class ke Object se dono methodds
                                    // ko access kar payein
        System.out.println("Food Type: " + Foodtype);
        System.out.println("Delivery Available: " + DeliveryAvailable);
    }
}

// Driver Code
public class Inheritance3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Restaurant Name: ");
        String name = sc.nextLine();
        System.out.println("Enter the location: ");
        String location = sc.nextLine();
        System.out.println("Give Your Feedback with the rating 1-5: ");
        int rating = sc.nextInt();
        // adding extra next line to protect the new line in buffer
        sc.nextLine();
        System.out.println("Enter Food Type: ");
        String Foodtype = sc.nextLine();
        System.out.println("Is Delivery Available ? (True/False)?: ");
        Boolean DeliveryAvailable = Boolean.parseBoolean(sc.next(0));

        // Creating Object
        Fastfood Obj = new Fastfood(name, location, rating, Foodtype, DeliveryAvailable);
        Obj.fastfoodDetails();

    }

}
