//abstract with method
/*abstract method has no body 
 * abstract method implementing in a subclass
 */
abstract class Shape{
    //creating abstract method
    abstract void draw(); //no body
}
class Circle extends Shape{
    void draw(){
        System.out.println("Draw a Circle"); //implementing abstract method
    }
} //we can also create multiple classes and using the same method again and again
class Rectangle extends Shape{
    void draw(){
        System.out.println("Draw a Rectangle");
    }
}
 public class AbstractKeyword3 {
    public static void main(String[] args){
        //creating an object 
        Shape obj1=new Circle(); // the reference variable (obj) belongs to the parent class (Shape), but the object is of the child class (Circle). subclass can take the refrence of it's parent class
        obj1.draw();
        Shape obj2=new Rectangle();
        obj2.draw();
    }
    
}
