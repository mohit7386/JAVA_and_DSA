
//WAP and do all methods operations of Queue
import java.util.*;

public class Queue1 {
    public static void main(String[] args) {
        // creating a Queue
        Queue<Integer> q = new LinkedList<>(); /*
                                                * Queue ek interface hai.
                                                * 
                                                * Interface ka object direct new karke nahi ban sakta Java me. ❌
                                                * 
                                                * LinkedList ek class hai jo Queue interface ko implement karti hai. ✅
                                                * 
                                                * Isliye new LinkedList<>() karte hain.
                                                * So, Left Side me Interface and Right side me implementation
                                                */

        // adding the data into the queue
        q.add(10); // add() method add element at the rear(end) -> Exception if full (but
                   // LinkedList never full)
        q.add(20);
        q.add(30);
        q.add(40);
        System.out.println("Queue after add(): " + q);
        // offer() also add the element at the rear -> Safe (returns false if fail)
        q.offer(50);
        System.out.println("Queue after offer(): " + q);
        // remove() remove and return head -> Exception if empty
        q.remove();
        System.out.println("Queue after remove(): " + q);
        // poll() remove and return head -> Null if empty
        q.poll();
        System.out.println("Queue after poll(): " + q);
        // element() just return head without removing -> Exception if empty
        System.out.println("Queue after element(): " + q.element());
        // peek() just return head without removing -> Null if empty
        System.out.println("Queue after peek(): " + q.peek());

    }

}
