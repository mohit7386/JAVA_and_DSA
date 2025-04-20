
////Print the stack using deque 
/*Deque ka matlab hota hai "Double Ended Queue".

Deque me dono ends se insert aur delete kar sakte hain:

Front se bhi aur Rear se bhi.

Stack kya karta hai?

Stack Deque ka ek special case hai jisme sirf ek side se (top se) push/pop karte hain.

ArrayDeque aur LinkedList dono Deque implement karte hain internally.

Matlab Deque flexibility deta hai both ends pe kaam karne ki.

Jab Stack bana rahe hote hain, hum bas ek end (top) se hi kaam karte hain.

 */
import java.util.*;

public class Deque1 {
    public static void main(String[] args) {
        // creating a Deque
        Deque<Integer> deque = new ArrayDeque<>();/*
                                                   * Deque ek interface hai Java Collection Framework me.
                                                   * 
                                                   * ArrayDeque ek class hai jo Deque interface ko implement karti hai.
                                                   * 
                                                   * Java me interface ka object directly nahi ban sakta, isliye new
                                                   * Deque<>() likhoge to error aayega.
                                                   * 
                                                   * 👉 Interface sirf ek contract deta hai ki kya kya cheezein
                                                   * available hongi (jaise push(), pop(), peek(), etc).
                                                   * Par unka actual implementation koi class karti hai — jaise
                                                   * ArrayDeque.
                                                   */
        // adding the data into the deque itgives us functionality to add the data from
        // the both sides first and last.
        deque.addFirst(10); // In the beginning
        deque.addLast(20); // In the End
        deque.addLast(30);
        deque.addLast(40);
        deque.addFirst(50);
        deque.addLast(60);
        System.out.println(deque);
        // try to remove the data from the deque
        deque.removeFirst(); // remove the first element from the deque
        System.out.println(deque);
        System.out.println("Removing last element: " + deque.removeLast());
        System.out.println("Stack elements: " + deque);
    }

}
