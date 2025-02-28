
//WAP to count the no. of letters is present in our string....
import java.util.*;

public class Q1String {
    public static void main(String[] args) {
        System.out.println("Enter a String!");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') { // here we are checking the space is present on index value or not if it is not
                                        // present then count increases...
                continue; // It Skips the iteration when space comes and move to the other iteration.
            }
            count++;
        }
        System.out.println("The Total Number of Letters present in the string is:- " + count);
        sc.close();
    }

}
