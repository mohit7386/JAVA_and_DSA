public class Array_Error {
    public static void main(String[] args) {
        int[] num = { 1, 2, 3 };
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[5]); // here we are try to accessing the wrong index value which is not available
                                        // into aour array so that's why it throws an error which is
                                        // "java.lang.ArrayIndexOutOfBoundsException" error
        }
    }

}
