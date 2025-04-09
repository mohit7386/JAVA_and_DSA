//Nested try-catch - best way to represent the multiple catch and tries
public class ExcHandling4 {
    public static void main(String[] args) {
        try {
            try {
                int a = 10 / 0;
            } catch (ArithmeticException e) {
                System.out.println("Inner catch");
                System.out.println("Exception: " + e);
            }
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("Outer catch");
            System.out.println("Exception: " + e);
        }

    }

}
