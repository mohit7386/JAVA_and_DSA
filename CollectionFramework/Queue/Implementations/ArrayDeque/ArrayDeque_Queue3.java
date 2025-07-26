//WAP to find the front and rear elements of the arraydeque without removinf the element 
package Implementations.ArrayDeque;

import java.util.*;

public class ArrayDeque_Queue3 {
    public static void main(String[] args) {
        // creating an arraydeque
        Deque<Integer> q = new ArrayDeque<>();
        // addding the elements in the arraydeque
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);

        // finding the first element of the arraydeque
        System.out.println("First element of the arraydeque: " + q.peekFirst());
        // finding the last element of the arraydeque
        System.out.println("last element of the arraydeque: " + q.peekLast());
    }

}
