//throws in exception handling - throws is used to declare that a method might throw an exception. 
public class ExcHandling8 {
    public static void checkAge(int age) throws ArithmeticException {
        if (age < 18) {
            throw new ArithmeticException("Not Eligible to Vote!");
        } else {
            System.out.println("Eligible to Vote!");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(20); // clling a method which might through an error
        } catch (ArithmeticException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }

    }

}
