package Implementations.ArrayDeque;

import java.util.*;

public class ArrayDeque_Queue1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // creating an Arraydeque as queue
        Queue<Integer> q = new ArrayDeque<>();
        System.out.println("Enter how many elements you want to store in the Queue: ");
        int limit = sc.nextInt();
        System.out.println("Enter the elements in the Arraydeque Queue: ");
        for (int i = 0; i < limit; i++) {
            int num = sc.nextInt();
            q.add(num);
        }
        System.out.println("Arraydeque elements as queue: " + q);
        q.remove(); // removes the first element
        System.out.println("After using remove: " + q);
        System.out.println("Using peek: " + q.peek());
    }

}
