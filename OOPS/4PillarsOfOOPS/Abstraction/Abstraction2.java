//Interface in Java - An Interface is like a blueprint where all methods are abstract  and implemented in another class.
/*1- Achieves 100% Abstracton
 * 2- Supports multiple inheritance (A class can implement multiple interfaces)
 * 3- Variables- Only Static and Final Variables
 * 4- Class can be instantiated (Cannot create Object directly - implements in another class)
 */
//creating an Interface
interface Animal{
    void Sound(); //Abstract method (no body) - because all methods are abstract in interface even if we don't write abstract in front of method.
}
//class implementing interface
class Dog implements Animal{
    public void Sound(){ //implementing abstract method
        System.out.println("Dog Barksss.....");
    }
}
//Driver Code
public class Abstraction2 {
    public static void main(String[] args){
        //creating an object
    Animal Obj = new Dog(); //Parent class refrence and child class object 
    Obj.Sound(); //Calls the implemented method
    }
}
