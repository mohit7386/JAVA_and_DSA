//Exception Handling -> Exception Handling in Java is a way to handle runtime errors (like divide by 0, null access, file not found, etc.) in a graceful way without crashing the program.
/*What is an Exception?
An exception is an unexpected event that occurs during the execution of a program and disrupts the normal flow of instructions. Exception hamare code ko wahin pe rok dega aage kuch bhi agar apne code likha hai to aage kuch print nahi hogaa....

Example: Dividing a number by zero, accessing an invalid array index, etc.

⚠️ Why do we need Exception Handling?
To prevent program crash during unexpected situations.

To handle errors gracefully.

To ensure the user gets proper messages instead of cryptic system errors.

To continue program execution even if something goes wrong.

---> To jo exception hota hai koi bhi wo built-in class hoti hai java mein jo automatically declared hoti hai java ke har program mein isko humein declare nahi karna padhta hai. If you want to write then -> import java.lang."ExceptionName". Even if you don't write it still works.
Ex- ArithematicException , NullPointerException these all are built-in classes in java in every program.

✅ Step 1: Basic Structure of Exception Handling
In Java, we use these keywords:

try → Code that might cause an exception.

catch → Block that handles the exception.

finally → Always executes (whether exception occurred or not).

throw → Used to manually throw an exception.

throws → Declares exceptions a method might throw. 
try {
    // risky code
} catch (ExceptionType e) {
    // handling code
} finally {
    // optional: cleanup code
}*/
public class ExcHandling1 {
    public static void main(String[] args) {
        // //try wahan lagayenge jahan pe humein lagega ye line of code error dega
        // int a = 5 / 0; // It throws an exception which is arithematic exception like
        // this - "Exception
        // // in thread "main" java.lang.ArithmeticException: / by zero" because 0 is in
        // // denominator which is mathimatically wrong.

        // // So for remoing this error we need to handle this error gracefully

        // System.out.println(a);
        // System.out.println("Hello I'm Exception"); // even jab error hoga code me to
        // code wahin ruk jaayega aur crash
        // // kar jaayega aur aage ka code nahi chalega supppose that ek multi
        // // function app humne banaya hai jisme ek feature me exception aane
        // // par wo aage kuch bhi run nahi karta hai to aise to poora code
        // // crash ho gaya app crash ho gaya to user impact kharab hota
        // // hai.....aur agar hum iss error ko gracefully handle kar lein aur
        // // baaki features chalte rahein to isse user experience achcha rahega
        // // aur isi ko exception handling kehte hain jisse code crash na ho.
        try {
            int a = 5 / 0;
        } catch (ArithmeticException e) { // here 'e' is an object of this class
            System.out.println("Exception Caught: " + e);
        }
        System.out.println("Hello I'm Arithematic Exception");

    }

}
