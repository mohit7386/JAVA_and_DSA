//Wap in method overloading
//Method overloading is happened when the multiple methods is written in the class with the same name but different parameters then method overloading happened.
import java.util.*;
public class Method_Overloding {
    //Here we are writing multiple methods in a same class with the same method name but all the parameters are different
    static int add(int a , int b){
        return a+b;
    }
    static int add(int a, int b , int c){
        return a+b+c;
    }
    static double add(double a  , double b){
        return a+b;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Outputs after method overloading: ");
        System.out.println("Sum: "+add(5, 6));
        System.out.println("Sum: "+add(9, 5, 6));
        System.out.println("Sum: "+add(2.75, 1.13));
        sc.close();
    }
    
}
