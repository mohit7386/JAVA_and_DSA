import java.util.*;

public class String2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String!");
        String str1 = sc.nextLine(); // Taking the String input from the user
        System.out.println("The Length of the given String is:- " + str1.length()); // here we are using the
                                                                                    // (str.length())
                                                                                    // method which is used to return
                                                                                    // the length of the string.
        System.out.println("Enter the index value! of which character you want to print?");
        int i = sc.nextInt();

        System.out.println("The Character at index " + i + " is:- " + str1.charAt(i)); // this is also a method of
                                                                                       // string which is used to return
                                                                                       // the indexing value of the
                                                                                       // particular character given by
                                                                                       // the user.
        sc.close();
    }

}
