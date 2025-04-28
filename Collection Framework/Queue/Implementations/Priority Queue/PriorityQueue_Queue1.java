
//WAP of Priority queue and add the elements init
import java.util.*;

public class PriorityQueue_Queue1 {
    public static void main(String[] args) {
        // creating a priority queue
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // adding the elements in the PQ
        pq.add(10);
        pq.add(5);
        pq.add(2);
        pq.add(3);
        pq.add(20);
        System.out.println("Priority Queue Elements: " + pq);
        System.out.println(pq.peek()); // Pq min heap ki tarah kaam karta hai to by default priority jo hai wo sabse
                                       // chote element ko milegi '2' ko
        System.out.println(pq.poll()); // remove ho jaayega priority element '2'
        System.out.println(pq); // order random aa sakta hai
        System.out.println(pq.size());
    }
}
