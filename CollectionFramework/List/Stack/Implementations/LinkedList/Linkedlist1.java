
//Linked list implementation of stack
import java.util.LinkedList;

public class Linkedlist1 {
    public static void main(String[] args) {
        LinkedList<Integer> stack = new LinkedList<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        // (LinkedList ke push() method se element head pe add hota hai-> means jo sabse
        // baad me hoga wo head pe aayega LIFO follow karte hue, isiliye naye
        // elements aage se aate hain.)

        System.out.println(stack.peek()); // Output: 30
        System.out.println(stack.pop()); // Output: 30
        System.out.println(stack.peek()); // Output: 20
        System.out.println("Stack after popped: " + stack);
        System.out.println("Stack in LIFO Order: ");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
