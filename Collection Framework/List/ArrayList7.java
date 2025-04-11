
//Reverse the elements of the string without using Collections.reverse()
import java.util.*;

public class ArrayList7 {
    public static void main(String[] args) {
        // creating a list of numbers
        List<Integer> number = new ArrayList<>();
        // addding the numbers in the list
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(5);

        // Traversing the each element and print the list into reverse order
        for (int i = number.size() - 1; i >= 0; i--) { // size-1 denge hamesha bhai jisse IndexOutOfBounds ka error na
                                                       // aaye
            System.out.println(number.get(i));
        }
    }

}
