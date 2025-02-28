//WAP to check if the number is evern or odd using method
import java.util.*;
public class Method6 {
    static void checkEvenorOdd(int num1){
        if(num1%2==0){
            System.out.println("Number is even");
        }
        else
        System.out.println("Number is Odd");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
System.out.print("Enter the number: ");
int num1=sc.nextInt();
checkEvenorOdd(num1);
sc.close();
    }
    
}
