//WAP to find the GCD (HCF) of two numbers using functions (Industry level Approach - Eucledian Algorithm):-
import java.util.*;
public class Method13 {
    static int findGcd(int a , int b){
        while(b!=0){
            int remainder = a%b; //diveide the a to b and find the GCD of two numbers
            a=b;
            b=remainder;
        }
        return a;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values of num1 and num2: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.print("GCD of "+a+ " and "+b+ " is: "+findGcd(a, b));
sc.close();
    }
    
}
