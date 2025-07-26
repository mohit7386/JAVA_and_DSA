package Implementations.linkedlist;

import java.util.*;

public class Linkedlist_Queue2 {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        /*
         * remove() and element() methods throw exceptions if queue is empty ❌
         * poll() and peek() methods return null if empty ✅
         */
        // q.remove(); // ❌ Exception
        // q.element(); // ❌ Exception

        // ye dono methods run ho jayenge aur error nahi denge output me null aa jayega
        System.out.println("Poll on empty queue: " + q.poll()); // null
        System.out.println("Peek on empty queue: " + q.peek()); // null
    }
}
