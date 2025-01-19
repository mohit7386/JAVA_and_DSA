//WAP to count the vowels in a string using functons -
import java.util.*;
public class Method16 {
    static int countVowel(String str){
        int count=0;
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
System.out.print("Enter the String: ");
String str=sc.nextLine();
System.out.println("Vowels Count: "+countVowel(str));
sc.close();
    }
    
}
