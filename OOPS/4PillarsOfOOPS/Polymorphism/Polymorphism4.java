// Question - Polymorphism:
// Create a Shape class and override its draw() method in Circle and Rectangle classes.
// Use runtime polymorphism to call the correct method.

// Parent class
class Shape {
    void draw() {
        System.out.println("Draw any shape you want!");
    }
}

// Child class Circle
class Circle extends Shape {
    // Overriding the draw() method
    void draw() {
        System.out.println("Draw a Circle!");
    }
}

// Child class Rectangle
class Rectangle extends Shape {
    // Overriding the draw() method
    void draw() {
        System.out.println("Draw a Rectangle!");
    }
}

public class Polymorphism4 {
    public static void main(String[] args) {
        // Runtime Polymorphism Example

        // Parent reference, child object - Circle
        Shape obj1 = new Circle();

        // Parent reference, child object - Rectangle
        Shape obj2 = new Rectangle();

        // At runtime, the correct overridden method is called
        obj1.draw(); // Output: Draw a Circle!
        obj2.draw(); // Output: Draw a Rectangle!
    }
}
