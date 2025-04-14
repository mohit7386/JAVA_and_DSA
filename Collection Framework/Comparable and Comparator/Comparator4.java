
//WAp to sort the product data on the basis of their price if it's same then sort by name and if it is not then sort by price
import java.util.*;

// Product class
class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // toString method for printing
    @Override
    public String toString() {
        return name + " - " + price;
    }
}

// Main class
public class Comparator4 {
    public static void main(String[] args) {

        // Step 1: Create list of products
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 65000));
        products.add(new Product("Mobile", 30000));
        products.add(new Product("Tablet", 30000));
        products.add(new Product("Headphones", 5000));
        products.add(new Product("Charger", 2000));
        products.add(new Product("Monitor", 30000));

        // Step 2: Sort using Comparator with multiple conditions
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                if (p1.price == p2.price) {
                    // If prices are same, sort by name (alphabetical)
                    return p1.name.compareTo(p2.name);
                } else {
                    // Otherwise, sort by price (ascending)
                    return Double.compare(p1.price, p2.price);
                }
            }
        });

        // Step 3: Print sorted list
        System.out.println("Sorted Products:");
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
