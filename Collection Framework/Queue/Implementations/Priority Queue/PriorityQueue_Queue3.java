
//Convert the priority queue as min heap default to max-heap
import java.util.*;

public class PriorityQueue_Queue3 {
    public static void main(String[] args) {
        // creating the max heap
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); // Comparator.reverseOrder() hamara
                                                                                    // use hota hai max heap banane ke
                                                                                    // liye priority queue ko because
                                                                                    // iska default order min heap hota
                                                                                    // hai to iska order reverse kar
                                                                                    // denge jisse ye max heap ki tarah
                                                                                    // behave karega or ban jaayega
        // adding the elements in the max heap
        pq.add(15);
        pq.add(56);
        pq.add(3);
        pq.add(45);
        System.out.println(pq); // jab hum isko print karenge to order random ho sakta hai

        while (!pq.isEmpty()) {
            System.out.println(pq.poll()); // ab ye max heap me convert ho gaya hai to ye bigger element ko pehle
                                           // uthayega aur tab tak jab tak ki khaali nahi ho jaati queue
        }
    }

}
