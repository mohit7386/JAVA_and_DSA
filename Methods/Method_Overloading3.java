//Write a Overloaded method and calculate the area of the circle , square , rectangle
public class Method_Overloading3 {
    static double area(double radius){
        return (22/7)*(radius*radius);
    }
    static double area(int side){
        return side*side;
    }
    static double area(int length , int breadth){
        return length*breadth;
    }
    public static void main(String[] args){
        System.out.println("Area of Circle: "+area(4.0));
        System.out.println("Area of Square: "+area(6));
        System.out.println("Area of Rectangle: "+area(12, 10));
    }
    
}
