
//WAP to find the largest elements in the queue or array with the help of how many 'K' means how many largest elements you want to find in the array 
import java.util.*;

public class PriorityQueue_Queue2 {
    public static void main(String[] args) {
        int[] arr = { 10, 5, 2, 30, 50 }; // hardcoded
        int k = 3; // how many largest elements we want from our array
        // creating a priority queue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : arr) {
            pq.add(num);
            if (pq.size() > k) {
                pq.poll(); // remove kar dega chote elements ko because jab poll karte hain to smallest
                           // element pehle remove hota hai because Priority queue ka default behaviour min
                           // heap hota hai jisme chote elements pehle aate hain
                // System.out.println(pq.poll());
            }
        }

        System.out.println("Top " + k + " Largest elements: ");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll() + " ");
        }
    }
}
