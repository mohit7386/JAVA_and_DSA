//WAP to check the number is prime or not using function
import java.util.*;
public class Method9 {
    static void checkPrime(int num){
        if(num<=1){
            System.out.println("Number is not a prime number"); //Negative numbers and 1 dega user to usko non prime batane ke liye .
            return; //extra iterration na ho aur loop yahin se exit ho jaaye program ko rok de yahin pe aaur aage koi kaam hi na kare 
            } 
            
    for(int i=2;i<=Math.sqrt(num);i++){
        if(num%i==0){
            System.out.println("Number is not Prime!");
            break; //Break kewal loop se exit karta hai program ko while return poora function hi exit kar deta hai
        }
    }

    
    System.out.println("Number is prime");
     
    }
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Number: ");
    int num=sc.nextInt();
    checkPrime(num);
    sc.close();
   }    
}
