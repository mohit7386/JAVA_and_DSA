import java.util.*;

public class Treeset2 {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(30);
        ts.add(10);
        ts.add(20);
        ts.add(40);

        System.out.println(ts); // [10, 20, 30, 40]

        System.out.println("First: " + ts.first()); // 10
        System.out.println("Last: " + ts.last()); // 40

        System.out.println("Ceiling(25): " + ts.ceiling(25)); // 30 (smallest >= 25) ->means sabse chota element jo bada
                                                              // ho '25' se ya uske equal ho
        System.out.println("Floor(25): " + ts.floor(25)); // 20 (largest <= 25) -> means sabse bada element jo chota ho
                                                          // '25' se ya uske equal ho

        System.out.println("Higher(20): " + ts.higher(20)); // 30 (strictly greater) -> sabse chota element jo bada ho
                                                            // '25' se.
        System.out.println("Lower(20): " + ts.lower(20)); // 10 (strictly smaller) -> sabse bada element jo chota ho
                                                          // '25' se

        ts.remove(30);
        System.out.println("After removing 30: " + ts); // [10, 20, 40]

        System.out.println("Poll First: " + ts.pollFirst()); // removes 10 -> pollFirst means retrieves and remove the
                                                             // first smallest element
        System.out.println("Poll Last: " + ts.pollLast()); // removes 40 -> pollLast means retrieves and remove the last
                                                           // Largest element

        System.out.println("Final TreeSet: " + ts); // [20]
    }
}
