/* What is Hybrid Inheritance?
Hybrid Inheritance = Combination of more than one type of inheritance.

Example: Single + Multiple

Or Multilevel + Multiple 
Why Java doesn’t allow hybrid via class?”, just say:

“Because Java avoids ambiguity and diamond problem using interfaces — it chooses simplicity over confusion."*/
interface Father{
    void giveDiscipline();
}
interface Mother{
    void giveLove();
}
//Parent Class implementing both interfaces
class Parent implements Father , Mother{
    public void giveDiscipline(){
        System.out.println("Follow Discipline!");
    }
    public void giveLove(){
        System.out.println("Gives Love!");
    }
    void show(){
        System.out.println("Parent takes care of child!");
    }
} 
//child class extends parent (multilevel Inheritance)
class child extends Parent{
    void Play(){
        System.out.println("Child Plays Happily!");
    }
}
//Driver Code
public class Inheritance8 {
    public static void main(String[] args){
        //Creating an Object
        child obj= new child();
        obj.giveDiscipline();
        obj.giveLove();
        obj.show();
        obj.Play();
    }
    
}
