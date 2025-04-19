import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Arraydeque4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string of brackets: ");
        String input = sc.nextLine();

        System.out.println("Is the string balanced? " + isBalanced(input));
    }

    public static boolean isBalanced(String str) {
        Deque<Character> stack = new ArrayDeque<>();

        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch); // Opening brackets push
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty())
                    return false; // Koi opening nahi par closing mil gaya

                char top = stack.pop();
                if (!matches(top, ch))
                    return false; // Matching galat
            }
        }

        return stack.isEmpty(); // Last mein stack empty hona chahiye
    }

    private static boolean matches(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }
}
