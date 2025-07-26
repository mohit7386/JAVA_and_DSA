
//WAP to reverse the stack elements  
import java.util.*;

public class Stack3 {
    public static void main(String[] args) {
        // creating the stack (Original Stack)
        Stack<Integer> stack = new Stack<>();
        // adding elements into the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println("Original Stack: " + stack);
        // creating temporary stack for storing the popped eelemnt of original stack
        Stack<Integer> stacktemp = new Stack<>();
        // jab tak stack empty nahi ho jaata tabtak popped karte raho aur popped element
        // ko push kardo temporary stack mein
        while (!stack.isEmpty()) {
            stacktemp.push(stack.pop());
        }
        System.out.println("Reversed Stack: " + stacktemp);
    }

}
