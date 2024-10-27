import java.util.*; //It is a collection of all the commonly used classes and give the access of all classes and you don't need to import classes one by one 
//WAP to take a inout from the user 

public class Taking_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // isko sirf ek baar hi declare kar sakte hain hum apne code me aur ye user
                                             // se input lene ke liye use kiya jaata hai
        System.out.println("Enter Number1");
        int num1 = sc.nextInt(); // Taking input num1 from the user
        System.out.println("Enter Number2");
        int num2 = sc.nextInt(); // Taking input num2 from the user
        int sum = num1 + num2;
        System.out.println("Sum of " + num1 + " and " + num2 + " is:- " + sum); // Print the sum of num1 and num2
        sc.close(); // After completing the work we need to close the scanner class ->>> It's
                    // mandatory for a good programmer

    }

}
