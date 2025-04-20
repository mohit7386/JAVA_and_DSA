
/*Wrapper class in java -> In Java, Wrapper Classes are used to convert primitive types (like int, char, boolean) into objects. Kyunki Java collections only work with objects, not primitives and wrapper classes are immutable like Strings.
 * Primitive Type	   Wrapper Class
    int	                  Integer
    char	              Character
    double	              Double
    float	              Float
    long	              Long
    short	              Short
    byte	              Byte
    boolean	              Boolean

Why Wrapper Classes?
Collections only work with Objects, not primitives.

Wrapper classes “wrap” primitive types into objects.

Enable utility methods (e.g., parsing, comparisons).

Help in Autoboxing / Unboxing.
    */
//Example of autoboxing and unboxing
import java.util.*;

public class WrapperClass1 {
    public static void main(String[] args) {
        // creating a List
        List<Integer> list = new ArrayList<>(); // here we are using Integer Wrapper class because collection do not
                                                // support the primitive types it supports objects
        // Adding data to the list
        // Autoboxing
        list.add(10); // primitive data converted into the Integer
        list.add(20);
        // Unboxing
        int x = list.get(1); // here Interger to int
        System.out.println("Second Element Multiplied by 4: " + (x * 4));
        // Printing the list
        System.out.println("List Elements: " + list);

    }

}
