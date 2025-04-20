//Now we are practising the finally block - finally block always runs agar exception aaye tab bhi nahi aaye tab bhi run hoga 
/*There are some cases where finally block does not execute:- 
 * 1- Use of System.exit() method
 * 2- The death of a thread
 * 3- An exception occurs in the finally block
 */
public class ExcHandling5 {
    public static void main(String[] args) {
        int a[] = new int[5];
        System.out.println("Hello World!");
        try {
            System.out.println(a[8]);
        } catch (Exception e) {
            System.out.println("Exception Caught: " + e);
            System.out.println("Exception Handled");
        } finally { // here we are using finally block and hum catch ko remove karke try ke saath
                    // bhi finally ko use kar sakte hain but humein and finally ko multiple use nahi
                    // kar sakte bas only we can use it once.

            // It is a good practice to use finally block to include important cleanup code
            // like - closing a file or connection.
            System.out.println("I'm finally block always runs....even it gives exception in try-catch block or not!");
        }
        System.out.println("Bye World!");

    }

}
