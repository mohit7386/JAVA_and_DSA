
//WAP of ArrayDeque and do push/pop operations
/* 1- Fast and non-synchronized
 * 2- Isme grow and shrink karna efficient hota hai
 * 3- Modern Coding me ArrayDeque use karte hain mostly hum Stack ke liye. 
 */
import java.util.*;

public class ArrayDeque1 {
    public static void main(String[] args) {
        // create a Stack of ArrayDeque
        ArrayDeque<Integer> arraydeque = new ArrayDeque<>();
        // Addding the elements in the arraydeque
        arraydeque.push(10);
        arraydeque.push(20);
        arraydeque.push(30);
        arraydeque.push(40);
        System.out.println(arraydeque.size()); // find the size of the stack
        System.out.println(arraydeque.peek());
        System.out.println(arraydeque.pop()); // Popped Element
        System.out.println(arraydeque);
        System.out.println(arraydeque.peek());
    }

}
