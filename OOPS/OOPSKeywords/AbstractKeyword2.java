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
}
 public class AbstractKeyword2 {
    public static void main(String[] args){
        //creating an object 
        Shape obj=new Circle();
        obj.draw();
    }
    
}
