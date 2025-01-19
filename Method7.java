//WAP to print the factorial of a number using method
import java.util.*;
public class Method7 {
     static int findFactorial(int num){
             int fact=1;
             for(int i=1;i<=num;i++){
                 fact=fact*i;
             }
             return fact;
         }
         public static void main(String[] args){
             Scanner sc=new Scanner(System.in);
             System.out.print("Enter Number: ");
             int num =sc.nextInt();
             System.out.println("Factorial of "+num+ " is: "+findFactorial(num));
sc.close();
    }
    
}
