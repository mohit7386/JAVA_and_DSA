import java.util.*;

public class String_Builder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
         * StringBuilder Java mein ek class hai jo mutable strings ke liye use hoti hai.
         * Iska matlab hai ki aap ek StringBuilder object ko modify kar sakte ho bina
         * naye objects banaye.
         * 
         * Fast and Efficient: StringBuilder ko single-threaded environments mein use
         * karte hain kyunki ye thread-safe nahi hai.
         * Modifications: Ismein aap append, insert, delete, aur reverse jaise methods
         * ka use kar sakte ho bina naye objects create kiye.
         * String me End Index exclusive hota hai that means ki tum agar end index 5
         * likh rahe ho to uska matlab 4 hogaa (ek Kam hota hai)
         */
        StringBuilder sb = new StringBuilder("Hello!");
        System.out.println(sb);
        System.out.println("Adding Second String So which String you want to add with Hello? :- ");
        StringBuilder sb1 = sb.append("World"); // append is also used for merging the two strings.
        System.out.println("After appending the string the result will be:- " + sb1);
        System.out.println("Now we are seeing the use of insert in the stringbuilder class");
        StringBuilder sb2 = sb.insert(6, " Beautiful "); // It helps to insert the string on the given index to their
                                                         // required size
        System.out.println("After adding the string on the given index:- " + sb2);
        System.out.println("Now we are seeing the use of delete the particular substring in the given string:- ");
        StringBuilder sb3 = sb.delete(6, 16); // helps to delete the particular string with the main string and last
                                              // index exclusive hota hai to ek kam leta hai
        System.out.println("After Deleting the substring:- " + sb3);
        System.out.println(
                "Now we are seeing the one more operation which is reverse. It helps to reverse the String :- ");
        StringBuilder sb4 = sb.reverse(); // helps to reverse the string
        System.out.println(sb4);
        sc.close();
    }

}
