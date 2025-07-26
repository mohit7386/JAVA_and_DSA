
//WAp to check the elements of the stack is palindrome or not
import java.util.*;

public class Stack4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // creating a stack
        Stack<Integer> stack = new Stack<>();
        // adding the elements into the stack
        System.out.println("Enter the size of the Stack: ");
        int n = sc.nextInt();
        System.out.println("Enter the " + n + " elements into the Stack: ");
        for (int i = 0; i < n; i++) {
            int element = sc.nextInt();
            stack.push(element);
        }

        System.out.println("Original Stack: " + stack);
        System.out.println("isPalindrome: " + isPalindrome(stack));
    }

    public static boolean isPalindrome(Stack<Integer> stack) { // Stack<Integer> is a data type and stack is a variable
                                                               // same as like -> int x
        // creating a list because agar humein index based access chahiye hota hai stack
        // me to humein stack ko list me convert karna hota hai becuase stack based
        // access kewal list me hota hai stack me nahi
        List<Integer> list = new ArrayList<>(stack); // Copy stack into the list so that ki hum iske element ko index
                                                     // based access kar paayein
        // copying each element into the list firwst we need to traverse the each
        // element of the stack by using loop
        int n = list.size();
        for (int i = 0; i < n / 2; i++) { // first half ko check karenge
            if (!list.get(i).equals(list.get(n - i - 1))) { // yahan pe bhai humne (n-i-1) kiya hai because ek to first
                                                            // wale element ko lenge doosre fir ek chodke next wale ko
                                                            // lenege means end wale ko lenge-> like 121 is palindrome
                                                            // so we check 1st element '1' and last element '1' for this
                                                            // logic so if it is matched then elements are palindrome
                                                            // otherwise not
                return false;
            }

        }
        return true;

    }
}
