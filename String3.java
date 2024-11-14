import java.util.*;

public class String3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Now ye program me hum Sub String method use karenge
        System.out.println("Enter the String!");
        String str1 = sc.nextLine();
        System.out.println("The SubString of a given String is:- " + str1.substring(0, 4)); // Here we are using the
                                                                                            // substring method of
                                                                                            // string which can find the
                                                                                            // sub string in the given
                                                                                            // string aur isme hum start
                                                                                            // index zero dete hain aur
                                                                                            // end index hamesha ek kam
                                                                                            // aayega agar 4 dete hain
                                                                                            // to 3 tak dikhayega
                                                                                            // substring ko.
        System.out.println("All Letters are converted into Capital letters! - " + str1.toUpperCase()); // ye string
                                                                                                       // method
                                                                                                       // convert kar
                                                                                                       // dega
                                                                                                       // saare letters
                                                                                                       // ko
                                                                                                       // capital me
        System.out.println("All letters are converted into lowercase! - " + str1.toLowerCase()); // This string method
                                                                                                 // is used to convert
                                                                                                 // all capital letters
                                                                                                 // into small letters.
        sc.close();
    }

}
