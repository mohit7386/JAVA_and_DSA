//WAP to reverse the arraydeque queue without using stack reversal
package Implementations.ArrayDeque;

import java.util.*;

public class ArrayDeque_Queue2 {
    public static void main(String[] args) {
        // creatng a arraydeque as queue
        Queue<Integer> q = new ArrayDeque<>();
        // adding the elements in the queue
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        // calling method
        reverseQueue(q);
        System.out.println("Reversed Queue: " + q);

    }

    public static void reverseQueue(Queue<Integer> q) {
        // creating a deque for reversing the queue without using stack
        Deque<Integer> stack = new ArrayDeque<>();

        // jab tak q khaali nahi ho jaati tab tak q ke saare elements ko push karte
        // raho
        // deque me means stack me
        while (!q.isEmpty()) {
            stack.push(q.remove()); // here queue me elments add hote hain end me and
            // delete hote hain first se
        }
        // jab tak deque means stack khali nahi ho jaata tab tak stack ke elements ko
        // remove krke queue me add kar do
        while (!stack.isEmpty()) {
            q.add(stack.pop()); // yahan hum stack ka operation use kar rahe hain stack
            // ko nahi because deque ki
            // ye khaasiyat hoti hai ki wo stack ki tarah bhi LIFO me work karta hai aur
            // Queue ki tarah bhi FIFO me work karta hai jab hum stack ke operations use
            // krte hain like -> push , pop to deque stack ki tarah kaam karta hai aur
            // jab
            // hum -> add , remove ye use karte hain to deque ek Queue ki tarah kaam
            // karta
            // hai
        }
    }
}
