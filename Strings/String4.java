import java.util.*;

public class String4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First String!");
        String str1 = sc.nextLine();
        System.out.println("Enter the Second String!");
        String str2 = sc.nextLine();
        System.out.println(
                "After Comparing the content of both the Strings...Is it equal or not ? :- "
                        + str1.equals(str2)); // This
        /*
         * This method checks the content of string 1 is fully equal to string 2 or not
         * if it is fully same then only it gives the true statement otherwise it gives
         * us false statement
         */
        sc.close();
    }

}
