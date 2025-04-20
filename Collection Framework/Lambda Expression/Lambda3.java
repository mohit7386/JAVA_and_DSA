import java.util.*;

class Product {
    String name;
    String category;
    int price;

    public Product(String name, String category, int price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    @Override // It's a annotation in java jo batata hai ki mai parent class ka method
              // override kar raha hun
    public String toString() {
        return name + " | " + category + " | Rs" + price;
    }
}

public class Lambda3 {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("iPhone", "Mobile", 90000));
        products.add(new Product("Samsung Galaxy", "Mobile", 85000));
        products.add(new Product("MacBook", "Laptop", 150000));
        products.add(new Product("Dell Inspiron", "Laptop", 80000));
        products.add(new Product("Sony Bravia", "TV", 60000));
        products.add(new Product("LG OLED", "TV", 95000));
        products.add(new Product("Asus ROG", "Laptop", 180000));
        products.add(new Product("OnePlus", "Mobile", 75000));

        // Multi-level sort using Lambda
        products.sort((a, b) -> {
            int categoryCompare = a.category.compareToIgnoreCase(b.category);
            if (categoryCompare != 0)
                return categoryCompare;

            int nameCompare = a.name.compareToIgnoreCase(b.name);
            if (nameCompare != 0)
                return nameCompare;

            return b.price - a.price; // price descending
        });

        System.out.println("Sorted Products:");
        products.forEach(System.out::println);
    }
}
