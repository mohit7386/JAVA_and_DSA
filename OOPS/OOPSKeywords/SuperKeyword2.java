//Calling parent class method
class parent{
    void show(){
        System.out.println("Parent Method");
    }
}
//creating child class 
class child extends parent{
    void show(){
     super.show(); //here we can calling the parent class method using child class 
     System.out.println("Child Method"); //child method
    }
}
public class SuperKeyword2 {
    public static void main(String[] args){
        //creating an object 
        child Obj = new child();
        Obj.show(); //calling method of the child class which is same as the parent class it will print both of the methods
    }
    
}
//Industry Use - Used in Method Overriding
