import java.util.*;

public class String_Buffer {
    /*
     * StringBuffer bhi StringBuilder ki tarah ek mutable string ko represent karta
     * hai, lekin ye thread-safe hota hai. Matlab, ye synchronized hai aur ismein
     * simultaneous modifications safe hain. Iska use multi-threaded environments
     * mein hota hai jahan multiple threads ko same string modify karna ho.
     * 
     * Slightly Slower: Kyunki StringBuffer synchronized hai, ye StringBuilder se
     * thoda slow hota hai.
     * 
     * Thread Safety: Agar multiple threads ek hi StringBuffer object pe kaam kar
     * rahe hain, toh ye safe hai aur koi inconsistent data issue nahi aayega.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer("Hello"); // StringBuffer Synchronized hota hai aur slow hota hai
                                                     // StringBuilder se.
        System.out.println(sb);
        sb.append(" text"); // concat the strings
        System.out.println(sb.toString()); // tostring() method is used to print the string
        sb.insert(5, " text"); // Insert the string on the given index
        System.out.println(sb.toString());
        sb.delete(2, 5); // delete the substring in the main string
        System.out.println(sb.toString());
        sb.replace(1, 6, " World! "); // repalce the string with the current string
        System.out.println(sb.toString());

        sc.close();
    }

}
