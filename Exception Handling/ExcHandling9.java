//throws example
public class ExcHandling9 {
    public static void divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            System.out.println("Division not possible!...Arithmetic Exception!");
        } else {
            System.out.println(a / b);
        }
    }

    public static void main(String[] args) {
        try {
            divide(4, 0); // calling method but it gives an error so we need to handle this error
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
