//WAP to Reverse a Queue using only Queue methods
package Implementations.linkedlist;

import java.util.*;

public class Linkedlist_Queue3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // creating a queue
        Queue<Integer> q = new LinkedList<>();
        // System.out.println("Enter how many elements you want to reverse in the Queue
        // ? ");
        // int limit = sc.nextInt();
        // // adding the data into the queue
        // for (int i = 1; i <= limit; i++) {
        // q.add(i);
        // }

        System.out.println("Enter the elements in the queue (Enter -1 to STOP): ");
        while (true) { // condition hamesha true rahega jab tak isse roka na jaaye ye chalta rahega
            int input = sc.nextInt();
            if (input == -1) { // jab tak -1 na aayega tab tak loop ko chalate raho jaise hi -1 aa jaayega
                               // tabhi loop ko rok do
                break;
            }
            q.add(input);
        }

        // creating a Stack because Humein reverse karna hai means ek type se LIFO
        // behaviour joki stack humein automatic deta hai aur queue FIFO to queue ke
        // elements ko reverse karna hai to stack is best option
        Stack<Integer> stack = new Stack<>();
        // ek loop chalayenge jab tak ki queue khali nahi ho jaati hai tab tak ye loop
        // chalta rahega
        while (!q.isEmpty()) {
            stack.push(q.remove()); // queue se element remove hoga joki FIFO order me hota hai to like aise jayega
                                    // -> 10,20,30,40 then bas humein isko LIFO me karna hai aur stack me add kar
                                    // rahe hain apne element ko
        }
        // now stack me element aa gaye joki LIFO follow karta hai jab remove karte hain
        // -pop()
        while (!stack.isEmpty()) {
            q.add(stack.pop()); // stack se pop krke means fir reverse order mil jaayega then q me add kar denge
                                // uss order ko
        }
        System.out.println("Reversed Order: " + q);

    }
}
