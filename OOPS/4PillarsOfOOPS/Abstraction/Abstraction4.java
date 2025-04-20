/*Create an interface Animal with methods eat() and sleep().

Implement it in Lion and Elephant classes. */
interface Animal{
    void eat(); //abstract method - all methods in interface are abstract and implement in another class.
    void sleep();
}
//child class for implementing animal class 
class lion implements Animal{
    public void eat(){
        System.out.println("Lion Eats Meat!");
    }
    public void sleep(){
        System.out.println("Elephant eat grass!");
    }
}
//Driver Code 
public class Abstraction4 {
    public static void main(String[] args){
        //creating an object 
        Animal Obj = new lion(); //parent refrence and child class object
        Obj.eat();
        Obj.sleep();
    }    
}
