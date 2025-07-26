
//WAP to create a list of integers and add 10 numbers to it.
import java.util.*;

public class ArrayList2 {
    public static void main(String[] args) {
        // create a list of integers
        List<Integer> numbers = new ArrayList<>(); // java collection do not support primitive data types like - int ,
                                                   // char , double etc directly instead of java uses wrapper class to
                                                   // box these primitives to objects so we use Integer in place of int
        // Now we are adding the 10 numbers in the list
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        System.out.println("List Elements are: " + numbers);

    }

}
