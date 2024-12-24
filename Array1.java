//WAP to print the elements of the array
public class Array1 {
    public static void main(String[] args) {
        // Creating a array
        int[] numbers = { 10, 20, 30, 40, 50 }; // here we are declaring the array and intitialise with the values
        // printing the elements of the array aur array ke har element ko print karne ke
        // liye usko traverse karna padega isiliye hum loop ka use karenge
        System.out.println("Array Elements are:- ");
        for (int i = 0; i < numbers.length; i++) { // numbers.length methos is a inbuilt method which is used to find
                                                   // the size of an array
            System.out.println(numbers[i]);

        }
    }
}