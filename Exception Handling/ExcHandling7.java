//NullPointerException in java
public class ExcHandling7 {
    public static void main(String[] args) {
        String s = null;
        try {
            if (s == null) {
                throw new NullPointerException("String cannot be Null!"); // ye humne khudse ek error create kar diya ki
                                                                          // string null agar hogi to nullpointer error
                                                                          // aayega ab runtime pe ye exception show
                                                                          // karega

                // ab isko hum handle bhi kar sakte hain if we want
            }
        } catch (NullPointerException e) {
            System.out.println("Our thrown exception is handled!");
        }
        System.out.print("Name: " + s);

    }

}
