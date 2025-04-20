import java.util.*;

public class String_Builder2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String!:- ");
        StringBuilder sb = new StringBuilder("Hello! Beautiful World");
        System.out.println(sb);
        System.out.println("Replacement of the substring in the given string:- ");
        sb.replace(6, 16, " Amazing"); // It helps to replace the substring with the current substring
        System.out.println(sb.toString()); // toString is a method of string jo string ki value ko print karane ke liye
                                           // use hota hai
        sc.close();
    }

}
