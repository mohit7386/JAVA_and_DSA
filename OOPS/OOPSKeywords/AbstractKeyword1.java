//Abstract - Abstract keyword is used to create incomplete (Blueprint) classes and force implementation in child classes.
//Abstract with class
/*An abstract class cannot be instantiated (you can't create an object)
It can contain abstract (incomplete) methods which can be implemented by child classes.
*/
abstract class Vehicle{ //abstract class (incomplete class and we cannot create object of abstract class)
    abstract void start();  //abstract method (No Body)

//concrete method
void stop(){
System.out.println("Vehicle Stopped");
}
}
class child extends Vehicle{
     void start(){ //implementing abstract method
        System.out.println("Car Start with a key");
        System.out.println("Abstract method implementing in child class");
     }
}
public class AbstractKeyword1 {
    public static void main(String[] args){
        //sample obj = new sample(); - here we cannot instantiate the type sample class because we cannot create the object of the abstract class
        Vehicle obj=new child();
        obj.start(); 
        obj.stop();

    }
    
}
