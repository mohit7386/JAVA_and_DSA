import java.util.*;

public class HaveAGoodDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name! :- ");
        String name = sc.nextLine();
        System.out.println("Hello " + name + " have a good day! ");
        System.out.println("Checking the number entered by the user is integer or not!");
        System.out.println(sc.hasNextInt()); // This method is used to check the entered number by user is integer or
                                             // not and if it gives the true that means number entered by the user is
                                             // integer otherwise not.
        sc.close();
    }

}
