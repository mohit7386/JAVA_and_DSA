import java.util.*;

public class String6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name:- ");
        String str1 = sc.nextLine();
        System.out.println("Enter Age - ");
        int age = sc.nextInt();
        System.out.println("After Formatted the String in a manner:-");
        String formattedstring = String.format("Name: %s \nAge: %d", str1, age); // Java mein String.format() method ka
                                                                                 // use karke output ko format kar sakte
                                                                                 // hain. Ye bahut helpful hai jab
                                                                                 // precise output chahiye ho matlab
                                                                                 // jaisa output chahte hain hum waisa
                                                                                 // hi output agar chahiye same to same
                                                                                 // to humein String.format method ko
                                                                                 // use karna hi padega.
        System.out.println(formattedstring);
        sc.close();

    }

}
