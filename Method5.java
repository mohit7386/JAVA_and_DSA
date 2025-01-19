// WAP to create a number that takes the number as input and print it's square
import java.util.*;
public class Method5 {
    static int printSquare(int num){
        return num*num;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num=sc.nextInt();
        int square=printSquare(num);
        System.out.println("Square: "+square);
        sc.close();
    }
    
}
