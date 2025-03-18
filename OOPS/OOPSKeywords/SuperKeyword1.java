//SUPER KEYWORD :-
/*super Keyword (Refers to Parent Class)
Why is super used?
To call parent class constructors.
To call parent class methods.
To call parent class variables. */
class parent{
    parent(){
        System.out.println("Parent constructor"); //parent constructor
    }
}
class child extends parent{
    child(){ //here we are creating the child constructor in which we can access the parent class constructor properties
        super(); //Calling parent class constructors
        System.out.println("Child Constructor");
    }
}
public class SuperKeyword1 {
    public static void main(String[] args){
     //creating an object 
     child Obj =new child();
    }
}
//Industry Use - Used in Inheritance when child class need to initialise the parent class properties like calling parent cnstructor , calling parent class methods , calling parent class variables 
