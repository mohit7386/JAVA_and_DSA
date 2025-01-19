//WAP to check the number is armstrong or not using functions-
import java.util.*;
public class Method14 {
    static boolean checkArmstrong(int num){
        int originalnum=num;
        int sum=0;
        while(num>0){
           int r=num%10;
           sum=sum+(r*r*r);
           num=num/10; //update the num for moving to the next iteration
        }
        return sum==originalnum;
    }
    public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number: ");
int num=sc.nextInt();
if(checkArmstrong(num)){
    System.out.println("Number is Armstrong!");
}
else
System.out.println("Number is not an Armstrong!");
sc.close();
    }
    
}
