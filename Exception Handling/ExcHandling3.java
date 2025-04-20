//WAP for try-catch for NULLPointerException
public class ExcHandling3 {
    public static void main(String[] args) {
        try {
            String s = null;
            System.out.println(s.length()); // Here it throws an exception - NULLPointerException because we are
                                            // accessing
                                            // the length of the string which is empty so now we need to handle this
                                            // exception

            // Here we are accessing the both exceptions using only one try-catch block but
            // in this try already one exception is catched so ek baar ek exception aa gaya
            // to aage ka exception check nhi hoga aur matching wale catch ko dhundhega ye
            // and wo print karayega
            int a = 40 / 0;

            Here so we can also use multiple catch to handle the exception
            } catch (ArithmeticException f) {
            System.out.println("Arithematic Exception" + f);
            } catch (NullPointerException e) {
            System.out.println("Null Pointer Error: " + e);
            }
            //We can also use "Exception" parent class to print all exceptions in respect of using multiple catch
        // } catch (Exception e) {
        //     System.out.println("Caught Exception: " + e);
        // }
    }

}
