//final with method
class parent{
    final void show(){
        System.out.println("Final Method");
    }
}
class child extends parent{
    /*void show(){ //cannot override a final method - overriding means declaring a method in a subclass which is already present in a parent class.
     * System.out.println("Trying to override the parent method");
    } */
}
public class FinalKeyword2 {
    public static void main(String[] args){
        //creating an object 
        child obj=new child();
        obj.show(); //calling parent method
    }
    
}
