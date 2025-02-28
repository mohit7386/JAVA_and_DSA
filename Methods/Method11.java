//WAP to print the reversed string using function
import java.util.*;
public class Method11 {
    static String reversedString(String str){
        String reversed ="";
        for(int i=str.length()-1;i>=0;i--){
            reversed+=str.charAt(i); //adding each character of the string in the reversed string
        }
        return reversed;
    } 
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str=sc.nextLine();
        System.out.println("Reversed String: "+reversedString(str));
        sc.close();
    }
    
}
