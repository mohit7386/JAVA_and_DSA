import java.util.*; //It is a collection of all the commonly used classes and give the access of all classes and you don't need to import classes one by one 
//WAP to take a input from the user 

public class Taking_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // isko sirf ek baar hi declare kar sakte hain hum apne code me aur ye user
                                             // se input lene ke liye use kiya jaata hai. Taking input from the keyboard
                                             // in our system
        System.out.println("Enter Number1");
        int num1 = sc.nextInt(); // Taking input num1 from the user and here sc is a object of scanner class name
                                 // of the object could be anything here we take sc because it represents sc as a
                                 // scanner class
        System.out.println("Enter Number2");
        int num2 = sc.nextInt(); // Taking input num2 from the user
        int sum = num1 + num2;
        System.out.println("Sum of " + num1 + " and " + num2 + " is:- " + sum); // Print the sum of num1 and num2
        System.out.println("********************************************************");
        System.out.println("Enter Number3 which is in point:- ");
        float num3 = sc.nextFloat();
        System.out.println("Enter Number 4 which is in point:- ");
        float num4 = sc.nextFloat();
        float Total = num3 + num4;
        System.out.println("The Sum of " + num3 + " and " + num4 + " is:- " + Total);
        System.out.println("----------------------------------------------------------");
        // Yahan pe nextFloat() use kiyaa hai humne to na ek new line character reh jata
        // hai scanner me to wo new line character first string dwara consume ho ja raha
        // hai jisse ho ye raha hai ki first string print nahi ho rahi hai kyuki wo new
        // line character ko read kar le raha hai jisse ho ye raha hai ki string print
        // nai ho rahi hai
        // ----------TO iske resolution ke liye hum yahan pe add karenge ek new line
        // character ko--------------
        sc.nextLine(); // adding new line character for consuming left over character in buffer of the
                       // scanner class or ab jo new line character reh gaya tha buffer me wo iske
                       // through consume ho gaya hai ab ye next string ko proper print karayega aur
                       // effectively answer dega.
        System.out.println("Enter Your First Name:- ");
        String Str1 = sc.nextLine(); // this is the method for taking string input from the user
        System.out.println("Your First Name is:- " + Str1);
        System.out.println("Enter Your Last Name:- ");
        String Str2 = sc.nextLine();
        System.out.println("Your Last Name is:- " + Str2);
        String Str3 = Str1 + Str2; // here we are merging two Strings
        System.out.println("Your Full Name is :- " + Str3);

        sc.close(); // After completing the work we need to close the scanner class ->>> It's
                    // mandatory for a good programmer

    }

}
