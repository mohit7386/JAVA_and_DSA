/* Create an abstract class Appliance with an abstract method turnOn() and a concrete method turnOff().

Implement this class in Fan and WashingMachine classes. */
//abstract class 
abstract class Appliance{
    //abstract method
    abstract void turnOn(); //No body method

    //concrete method
    void turnOff(){
        System.out.println("Fan Off!");
    }
    //second concrete method 
    void turnOff2(){
        System.out.println("Washing Machine Off!");
    }
}
//chid class implements the abstract class 
class fan extends Appliance{
    public void turnOn(){
     System.out.println("Fan On!");
    }
}
class WashingMachine extends Appliance{
    public void turnOn(){
        System.out.println("Washing Machine On!");
    }
}
//Driver Code 
public class Abstraction3 {
    public static void main(String[] args){
        //creating an object 
        Appliance Obj=new fan();
        //Calls the implemented methods
        Obj.turnOn();
        Obj.turnOff();
        Appliance Obj2=new WashingMachine();
        Obj2.turnOn();
        Obj2.turnOff2();
    }
}
