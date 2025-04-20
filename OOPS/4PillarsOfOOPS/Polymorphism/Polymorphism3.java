//What is Run time Polymorphism? 
//-> When a method is called on a parent reference but the decision of which method to run is taken at runtime, based on the actual object type that’s called Runtime Polymorphism.

/*Keywords:
Method Overriding makes runtime polymorphism possible

Inheritance

Upcasting (Parent reference = Child object) 

How It Works ✅:
Method is defined in parent class

Overridden in child class

You create parent type reference but child object

At runtime, Java checks: actual object kis class ka hai? Usi class ka method chalayega
🧠 Real-Life Analogy:
Let’s say:

You have a general Remote (parent class)

But you use it with different TVs – SonyTV, LGTV, etc. (child classes)

Remote is same, but functionality changes depending on TV

*/
//Parent class 
class Animal {
    void sound() {
        System.out.println("Animal Makes Sound!");
    }
}

// child class @override method of parent class
class Dog extends Animal {
    void sound() {
        System.out.println("Dog Barks!");
    }
}

// child class @override method of parent class - signature is same but the body
// of the method is different
class Cat extends Animal {

    void sound() {
        System.out.println("Cat Meow!");
    }
}

// Driver Code
public class Polymorphism3 {
    public static void main(String[] args) {
        // creating an object
        Animal Obj = new Dog(); // Parent refrence and actual object = Dog
        Animal Obj2 = new Cat(); // parent refrence and actual object = Cat
        Obj.sound(); // here at run time we can decide which object to call
        Obj2.sound();
        // method call Obj.sound() is resolved at runtime, based on which object Obj is
        // pointing to.

    }

}
