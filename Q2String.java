
//WAP to count the no. of Vowels present in our string....
import java.util.*;

public class Q2String {
    public static void main(String[] args) {
        System.out.println("Enter a String!");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I'
                    || str.charAt(i) == 'O' || str.charAt(i) == 'U') { // here we are checking the vowel is present on
                                                                       // index value or not if it is not
                // present then count increases...
                count++;
            }
        }
        System.out.println("Total Number of Vowels present in the String is:- " + count);
        sc.close();
    }

}
