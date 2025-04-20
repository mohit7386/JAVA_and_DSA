/*What is Inheritance?
Inheritance is a feature in OOP that allows a class (child class) to acquire the properties and behavior of another class (parent class). This helps in code reusability and hierarchy maintenance.

🔹 Why is Inheritance Used?
✅ Code Reusability – No need to rewrite common code in multiple classes.
✅ Extensibility – Child classes can extend parent class functionality.
✅ Maintainability – Makes the code structured and organized.

🔹 Types of Inheritance in Java
Java supports 5 types of inheritance: 1️⃣ Single Inheritance 🏛️ (One parent, one child)
2️⃣ Multilevel Inheritance 🏗️ (Parent → Child → Grandchild)
3️⃣ Hierarchical Inheritance 🌳 (One parent, multiple children)
4️⃣ Multiple Inheritance (via Interface) 🔄 (One class implements multiple interfaces)
5️⃣ Hybrid Inheritance (Combination of above) ⚡

👉 Note: Java does NOT support multiple inheritance with classes (to avoid ambiguity), but supports it using interfaces.

 */
//Example of Single Inheritance - 
class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}

public class Inheritance1 {
    public static void main(String[] args) {
        // creating an Object of Dog Class (Child Class) - Because child class inherits
        // properties of parent class so we can access methods of parent class using
        // child class object
        Dog myDog = new Dog();
        // Now accesssing the methods of parent class using child class object
        myDog.eat();
        myDog.bark();
    }

}
