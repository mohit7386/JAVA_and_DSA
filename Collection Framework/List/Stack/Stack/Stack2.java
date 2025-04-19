//WAP to Reverse a String Using Stack 
import java.util.*;
public class Stack2{
    public static void main(String[] args){
        String Str = "Hello";
        //creating a stack 
        Stack<Character> stack = new Stack<>();
        //adding the String into the stack
        for(int i=0; i<Str.length();i++){
            //now adding the string at every index
            stack.push(Str.charAt(i)); //har ek ith index pe humne String ke character ko push kar diya 
        }
        //Pop Characters from the string to get the reversed string 
        //first wwe need to creae the empty string 
        StringBuilder reversedStr= new StringBuilder();
        //agar stack empty nhi hai 
        while(!stack.isEmpty()){
            reversedStr.append(stack.pop()); //last element ko pop karke hum reversedStr me blank String me store kara rahe hain and append is used to add character by character 
        }
        System.out.println("Reversed String: "+reversedStr.toString());
    }
}