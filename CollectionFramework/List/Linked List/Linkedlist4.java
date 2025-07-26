//WAP to create a customer ticket system
import java.util.*;

class Ticket {
    int id;
    String customerName;
    String issue;

    public Ticket(int id, String customerName, String issue) {
        this.id = id;
        this.customerName = customerName;
        this.issue = issue;
    }

    @Override
    public String toString() {
        return id + " | " + customerName + " | " + issue;
    }
}

public class Linkedlist4 {
    public static void main(String[] args) {
        LinkedList<Ticket> ticketQueue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Normal Ticket");
            System.out.println("2. Add High Priority Ticket");
            System.out.println("3. Resolve Ticket");
            System.out.println("4. Show Pending Tickets");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    Ticket t1 = createTicket(sc);
                    ticketQueue.addLast(t1);
                    System.out.println("[Ticket added at end]");
                    break;
                case 2:
                    Ticket t2 = createTicket(sc);
                    ticketQueue.addFirst(t2);
                    System.out.println("[High Priority Ticket added at start]");
                    break;
                case 3:
                    if (!ticketQueue.isEmpty()) {
                        Ticket resolved = ticketQueue.removeFirst();
                        System.out.println("Resolved Ticket: " + resolved);
                    } else {
                        System.out.println("No tickets to resolve.");
                    }
                    break;
                case 4:
                    if (ticketQueue.isEmpty()) {
                        System.out.println("No pending tickets.");
                    } else {
                        System.out.println("Pending Tickets:");
                        for (Ticket t : ticketQueue) {
                            System.out.println(t);
                        }
                    }
                    break;
                case 5:
                    System.out.println("Exiting Ticket System. Bye!");
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }

    public static Ticket createTicket(Scanner sc) {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Issue: ");
        String issue = sc.nextLine();

        return new Ticket(id, name, issue);
    }
}
