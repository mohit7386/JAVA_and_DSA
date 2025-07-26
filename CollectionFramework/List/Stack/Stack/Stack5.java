
//WAP in Stack and perform Undo operations as per user choice
import java.util.*;

public class Stack5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // creating a stack
        Stack<String> actions = new Stack<>();

        while (true) {
            System.out.println("\n1.Perform Actions");
            System.out.println("2. Undo Action");
            System.out.println("View action");
            System.out.println("Exit");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();
            // consume newline character in the input buffer
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter action: ");
                    String action = sc.nextLine();
                    actions.push(action);
                    break;
                case 2:
                    if (!actions.isEmpty()) {
                        System.out.println("Undoing: " + actions.pop());
                    } else {
                        System.out.println("No actions to undo!");
                    }
                    break;
                case 3:
                    System.out.println("Current actions: " + actions);
                    break;
                case 4:
                    System.out.println("Exiting!....");
                    return;
                default:
                    System.out.println("Invalid Choice!");
            }
        }

    }

}
