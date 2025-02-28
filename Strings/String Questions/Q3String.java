
//WAP to Reverse the String
import java.util.*;

public class Q3String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String!");
        String str = sc.nextLine(); // Taking a String from the user
        StringBuilder sb = new StringBuilder(str); // creating a stringbuilder
        System.out.println("Reversed String:- " + sb.reverse());
        sc.close();

    }

}
