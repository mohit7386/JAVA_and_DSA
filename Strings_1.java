import java.util.*;

public class Strings_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Full Name:- ");
        // String name = sc.next(); when I am using this then it will only print the
        // first name jaise hi white space ayega ye print nhi krega so hum iski jagah
        // nextline use karte hain read karane ke liye space ke baad wale letters bhi
        String name = sc.nextLine(); // Reads the Whole name of the string
        System.out.println("Your Full Name is:- " + name);
        String Name2 = new String("Here I am creating a name object of String - Mohit Pratap Singh"); // here we are
                                                                                                      // creating the
                                                                                                      // object of the
                                                                                                      // new string
        System.out.println(Name2);
        sc.close();
    }

}
