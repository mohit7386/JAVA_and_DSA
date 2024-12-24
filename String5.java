import java.util.*;

public class String5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking the String input fronm the user
        System.out.println("Enter the String!:-");
        String str = sc.nextLine();
        System.out.println(
                "Enter the String which you want to check in the main String! Whether it is present in the string or not?");
        String Sequence = sc.nextLine();
        System.out.println(str.contains(Sequence)); // Contains is a method of string which checks the given string or
        // characters is present in the main String or not

        // Here we are concatinating the two strings which means we are merging the
        // first string with the second string
        System.out.println("After Concatinating the new string will be:- " + str.concat(" " + Sequence));
        sc.close();

    }
}
