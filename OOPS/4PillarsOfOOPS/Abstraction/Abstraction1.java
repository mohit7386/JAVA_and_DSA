/*In simple terms, Abstraction means hiding "how things work" and only showing "what they do." In Abstraction we are using abstract classes and abstract methods and we cannot create objects of abstract class directly, we are implementing the abstract class in child class. 

🛠 Example:

When you drive a car, you just press the accelerator to speed up.

You don’t need to know how the engine works internally.

💡 In Java, abstraction is achieved in two ways:
1️⃣ Abstract Classes (50% abstraction)
2️⃣ Interfaces (100% abstraction)
Abstract Class in Java
📌 An abstract class is a class that cannot be instantiated (cannot create objects directly) and may have abstract methods (methods without a body). */
//creating abstract class 
abstract class vehicle{
    abstract void start();  //abstract method (method without a body)

    //simple method or concrete method
    public void stop(){
       System.out.println("Vehicle Stopped!");
    }
}

//creating a child class which is implementing the abstract class 
class child extends vehicle{
       void start(){  //implement the abstract method
        System.out.println("Vehicle Start!");
       }
}
//Driver Code 
public class Abstraction1 {
    public static void main(String[] args){
        //creating an object 
        vehicle Obj =new child(); //Parent class refrence and child class object because abstract class cannot create objects directly.
        Obj.start();
        Obj.stop();
    }
    
}
