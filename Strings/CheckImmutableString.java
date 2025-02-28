
public class CheckImmutableString {
    public static void main(String[] args) {
        String str = "Hello";
        str.concat("World"); // here we cannot modify the string because strings are immutable and if you
                             // want to try to modify the string then it will create the new object in new
                             // memory location which is because enhancement of security
                             // So For mutating the string we use 2 methods - Stringbuilder and Stringbuffer
                             // ye dono ki help se hum string ko modify kar sakte hain bina naye object
                             // banaye
        System.out.println(str);
    }

}
