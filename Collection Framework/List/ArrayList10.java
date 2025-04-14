
//WAP to Simulate the To do List App
import java.util.*;

class Task {
    int id;
    String title;
    boolean completed;

    Task(int id, String title) {
        this.id = id;
        this.title = title;
        this.completed = false;
    }

    /*
     * Actually bhai, har Java class by default Object class ko inherit karti hai —
     * chahe explicitly likha ho ya na likha ho. class Student extends Object { //
     * this happens implicitly
     * }
     * To technically, Student class Object class ka child hai.
     * 
     * Student s = new Student("Rahul", 90);
     * System.out.println(s);
     * Without override → output: Student@7a81197d
     * With override → output: Rahul - 90
     */
    @Override
    public String toString() {
        return id + ". " + title + " - " + (completed ? "Completed" : "Pending");
    }
}

public class ArrayList10 {
    public static void main(String[] args) {
        List<Task> tasks = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice, taskId = 1;

        while (true) {
            System.out.println("\n--- TODO App Menu ---");
            System.out.println("1. Add Task");
            System.out.println("2. Mark Task as Completed");
            System.out.println("3. Delete Task by ID");
            System.out.println("4. Display All Tasks");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            if (choice == 1) {
                System.out.print("Enter Task Title: ");
                String title = sc.nextLine();
                tasks.add(new Task(taskId++, title));
                System.out.println("Task Added!");
            } else if (choice == 2) {
                System.out.print("Enter Task ID to mark completed: ");
                int id = sc.nextInt();
                boolean found = false;
                for (Task t : tasks) {
                    if (t.id == id) {
                        t.completed = true;
                        found = true;
                        System.out.println("Marked as Completed.");
                        break;
                    }
                }
                if (!found)
                    System.out.println("Task Not Found!");
            } else if (choice == 3) {
                System.out.print("Enter Task ID to delete: ");
                int id = sc.nextInt();
                boolean removed = false;
                for (int i = 0; i < tasks.size(); i++) {
                    if (tasks.get(i).id == id) {
                        tasks.remove(i);
                        removed = true;
                        System.out.println("Task Deleted.");
                        break;
                    }
                }
                if (!removed)
                    System.out.println("Task Not Found!");
            } else if (choice == 4) {
                System.out.println("\nYour Tasks:");
                for (Task t : tasks) {
                    System.out.println(t);
                }
            } else if (choice == 5) {
                System.out.println("Exiting App.");
                break;
            } else {
                System.out.println("Invalid Choice. Try Again.");
            }
        }

        sc.close();
    }
}
