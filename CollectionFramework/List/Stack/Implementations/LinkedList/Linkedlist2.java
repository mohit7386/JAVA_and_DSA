import java.util.LinkedList;
import java.util.Scanner;

public class Linkedlist2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String input = sc.nextLine();

        String reversed = reverseString(input);
        System.out.println("Reversed String: " + reversed);
    }

    public static String reverseString(String str) {
        LinkedList<Character> stack = new LinkedList<>();

        // Push each character into the LinkedList
        for (char ch : str.toCharArray()) {
            stack.push(ch);
        }

        // Pop characters to form the reversed string
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }
}
