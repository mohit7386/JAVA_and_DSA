import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Arraydeque3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string to reverse: ");
        String input = sc.nextLine();

        // Creating a Deque
        Deque<Character> deque = new ArrayDeque<>();

        // Pushing all characters into deque
        for (char ch : input.toCharArray()) { // toCharArray() is used to convert the String into the character array ->
                                              // aisa isiliye kiya humne because hum uska ek ek character chahiye jisse
                                              // hum pop kar sakein isiliye poori string ko characterarray bana diya ab
                                              // index based accesss ho paayegi aur access kar payenege hum aur ab har
                                              // ek character ko pop kar payenge because ab wo ek string nahi character
                                              // array hai
            deque.push(ch);
        }

        // Building reversed string
        StringBuilder reversed = new StringBuilder();
        while (!deque.isEmpty()) {
            reversed.append(deque.pop());
        }

        // Printing the reversed string
        System.out.println("Reversed String: " + reversed.toString());
    }
}
