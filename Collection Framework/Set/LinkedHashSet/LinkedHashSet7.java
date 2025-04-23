import java.util.*;

public class LinkedHashSet7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();

        // LinkedHashSet to store characters (preserve order + unique)
        LinkedHashSet<Character> set = new LinkedHashSet<>();

        // Add each character into set
        for (char ch : str.toCharArray()) { // String ko character array me convert kar diya jisse traverse kar paayein
                                            // hum har ek character pe
            set.add(ch); // Duplicate characters automatically ignored because of set
        }

        // Build the result string yahan stringbuilder isiliye use kiya hai humne
        // because string ko humne character array me convert kar diya tha jisse agar
        // output aata to wo string ki form me nahi array ki form me aata like ->
        // [m,o,h,i,t] to interview me aise nhi hota hai humein string me dena hota hai
        // output so hum string me wapas set ko convert karne ke liye stringbuilder use
        // kiye hain
        StringBuilder result = new StringBuilder();
        for (char ch : set) {
            result.append(ch); // har ek character ko set ke add kar rahe hain string me result me jisse wo
                               // string format me aa jaaye
        }

        System.out.println("String after removing duplicates: " + result.toString()); // then ab print karayenge to ab
                                                                                      // string milegi humein output
                                                                                      // mein
        // java me jab hum kabhi bhi set object ko pprint karate hain to wo internally
        // toString() method ko call karta hai....

        sc.close();
    }
}
