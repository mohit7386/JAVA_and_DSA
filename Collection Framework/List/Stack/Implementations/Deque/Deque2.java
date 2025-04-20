
//Design a Deque that supports insertFront, insertRear, deleteFront, deleteRear, and getFront, getRear.
import java.util.*;

public class Deque2 {
    // creating a deque
    Deque<Integer> deque = new ArrayDeque<>();

    public void insertFront(int value) {
        deque.addFirst(value);
    }

    public void insertRear(int value) {
        deque.addLast(value);
    }

    public int deleteFront() {
        return deque.removeFirst();
    }

    public int deleteRear() {
        return deque.removeLast();
    }

    public int getFront() {
        return deque.peekFirst();
    }

    public int getRear() {
        return deque.peekLast();
    }

    public static void main(String[] args) {
        Deque2 mydeque = new Deque2();

        mydeque.insertFront(10);
        mydeque.insertRear(20);
        mydeque.insertFront(5);
        mydeque.insertRear(1);

        System.out.println("Frone Element: " + mydeque.getFront());
        System.out.println("Rear Element: " + mydeque.getRear());

        mydeque.deleteFront();
        mydeque.deleteRear();

        System.out.println("Front Element after deletion: " + mydeque.getFront());
        System.out.println("Rear Element after deletion: " + mydeque.getRear());
    }

}
