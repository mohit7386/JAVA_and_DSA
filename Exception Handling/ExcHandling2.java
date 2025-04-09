//WAP to handle the array out of bounds exception and it is a unchecked exception (means checked at runtime also we called runtime exception)
public class ExcHandling2 {
    public static void main(String[] args) {
        int[] arr = new int[5]; // size of an array is 5
        try {
            System.out.println(arr[6]); // here we are accessing the index which doesn't really exist so it throws an
                                        // error index out of bounds so we need to handle this error gracefully so that
                                        // ki aage ka code chalta rahe error nahi aaye
        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Exception Caught: " + e);
            System.out.println("Length of the array is 5!");
        }
    }

}
