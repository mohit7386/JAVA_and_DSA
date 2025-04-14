
//WAP to sort the list of products on the basis of their price and then sort the products on the basis of their price > 25000
import java.util.*;

class Product {
    String name;
    int price;

    Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " -> " + price;
    }
}

// main code
public class Lambda1 {
    public static void main(String[] args) {
        // create the list
        List<Product> list = new ArrayList<>();
        // adding the products in the list
        list.add(new Product("Mobile", 15000));
        list.add(new Product("TV", 18000));
        list.add(new Product("Laptop", 55000));
        list.add(new Product("Tablet", 30000));
        list.add(new Product("Soundbar", 7000));

        // Sort the products on the basis of their price
        list.sort((p1, p2) -> p1.price - p2.price); // sorting using lambda expression and -> = this sign is a lambda
                                                    // Operator
        System.out.println("Products Sorted by price!");
        for (Product p : list) {
            System.out.println(p);
        }
        // sort the products on the basis of the price > 25000
        System.out.println("\nProducts with price > 25000");
        for (Product product : list) {
            if (product.price > 25000) {
                System.out.println(product);
            }
        }
    }

}
