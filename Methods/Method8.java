//WAP to find the greatest of 3 numbers using function
import java.util.*;
public class Method8 {
    static int findGreatestIn3( int a , int b , int c){
        return Math.max(a, Math.max(b,c)); //Here we are using the pre-defined function for finding the maximum value

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Values of a , b and c:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Greatest Number: "+findGreatestIn3(a, b, c));
        sc.close();
    }
    
}
