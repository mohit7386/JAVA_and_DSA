//WAP to check the given number is palindrome or not using function-
import java.util.*;
public class Method15 {
    static boolean checkPlaindrome(int num){
        int originalnum=num;int reversednum=0;
        while(num>0){
            int remainder = num%10;
            reversednum=reversednum*10+remainder; //ye reverse kar dega number ko then hum reversednum me add kar denge usko.
            num=num/10;
        }
        return reversednum==originalnum;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num=sc.nextInt();
        if(checkPlaindrome(num)){
            System.out.println("No. is Palindrome!");
        }
        else
        System.out.println("No. is not Palindrome!");
        sc.close();
    }
    
}
