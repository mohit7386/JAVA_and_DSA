
//Task Management System Using Linked List
import java.util.*;

class Task {
    int id;
    String description;
    String priority;

    Task(int id, String description, String priority) {
        this.id = id;
        this.description = description;
        this.priority = priority;
    }

    // Applying toString() method when we want to print the object then we need to
    // override toString method for redeable output
    @Override
    public String toString() {
        return "ID: " + id + "Description: " + description + "Priority: " + priority;
    }
}

// main code
public class Linkedlist5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // creating a list
        List<Task> list = new LinkedList<>();

        // creating a infinite loop jisse jab tak user exit nahi karega tab tak ye run
        // hota rahega
        while (true) {
            System.out.println("1. Add Normal Task");
            System.out.println("2. Add High Priority Task");
            System.out.println("3. Resolve (complete) Task");
            System.out.println("4. Show Pending Task");
            System.out.println("5. Exit");
            System.out.println("Choose an Option");
            int Choice = sc.nextInt();
            sc.nextLine(); // consume new line character jo input buffer me reh jaati hai

            switch (Choice) {
                case 1:
                    Task t1 = createTask(sc, "Normal");
                    list.addLast(t1); // Normal task at the end
                    System.out.println("[Normal Task added at end]");
                    break;
                case 2:
                    Task t2 = createTask(sc, "High");
                    list.addFirst(t2); // High priority task at the start
                    System.out.println("[High Priority Task added at start]");
                    break;
                case 3:
                    if (!list.isEmpty()) {
                        Task resolved = list.removeFirst(); // Resolving task (removing from front)
                        System.out.println("Resolved Task: " + resolved);
                    } else {
                        System.out.println("No tasks to resolve.");
                    }
                    break;
                case 4:
                    if (list.isEmpty()) {
                        System.out.println("No pending tasks.");
                    } else {
                        System.out.println("Pending Tasks:");
                        for (Task t : list) {
                            System.out.println(t);
                        }
                    }
                    break;
                case 5:
                    System.out.println("Exiting Task Management System. Bye!");
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }

    }

    // creating a method jisse bar bar repeated code na likhna pade humein
    public static Task createTask(Scanner sc, String priority) {
        System.out.println("Enter Task Id");
        int id = sc.nextInt();
        // consume new line character
        sc.nextLine();
        System.out.println("Enter Task Description");
        String description = sc.nextLine();
        return new Task(id, description, priority);
    }

}
