
//WAP to create a stack and add elements in the stack
import java.util.*;

public class Stack1 {
    public static void main(String[] args) {
        // creating a stack
        Stack<Integer> stack = new Stack<>();
        // adding the elements in the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50); // isme jo sabse last me add karenge element wo sabse top wala element hoga ->
                        // same as stack of plates in marriages and sabse pehle sabse last wala plate
                        // yani element remove hoga
        System.out.println("Stack After Push Operations: " + stack); // Ye stack ko as a list form me print karega as it
                                                                     // is...

        // peek() -> operation top element ko pop(remove) karne se pehle usko dekhna
        System.out.println("Top Element: " + stack.peek());
        // pop - element ko remove karna
        System.out.println("Popped element: " + stack.pop()); // Top element means last element ko remove karta hai ye
                                                              // operation
        System.out.println("After Popped Element: " + stack);
        // check is stack empty
        System.out.println("Is Stack Empty: " + stack.isEmpty());
        // Print the stack in stack format (LIFO) order-
        System.out.println("Stack in LIFO Order: ");
        while (!stack.isEmpty()) { // jab tak ye condition true rahegi means jab tak stack empty nahi ho jaata
            // tabtak ye pop karta rahega aur print karta rahega
            System.out.println(stack.pop());
        }
    }

}
