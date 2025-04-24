package Implementations.linkedlist;

//WAP using linkedlist implementation as queue 
import java.util.*;

public class Linkedlist_Queue1 {
    public static void main(String[] args) {
        // creating a Queue using Linkedlist
        Queue<Integer> q = new LinkedList<>();
        // adding the data into the queue - methods same use honge jo queue me use hote
        // hain
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(30); // duplicates are allowed in queue
        System.out.println(q);
        q.offer(40);
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q.peek());
        System.out.println(q);

    }

}
