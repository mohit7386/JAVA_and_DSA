//WAP to check the Queue is palindrome or not ?
package Implementations.linkedlist;

import java.util.*;

public class Linkedlist_Queue5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // creating a queue
        Queue<Integer> q = new LinkedList<>();
        System.out.println("Enter Queue elements: ");
        // adding the elements in the queue
        for (int i = 0; i < 5; i++) {
            int num = sc.nextInt();
            q.add(num);
        }
        // q.add(1);
        // q.add(2);
        // q.add(3);
        // q.add(2);
        // q.add(1);

        if (isPalindrome(q)) {
            System.out.println("Palindrome Queue");
        } else {
            System.out.println("Not a Palindrome Queue");
        }

    }

    public static boolean isPalindrome(Queue<Integer> q) {
        // creating a stack because it has LIFO behaviour jisse ki hum last wale element
        // ko compare kar payein pop karke apne queue ke first element ke saath mein
        // jisse ki agar first and last ke elements equal honge then tabhi to palindrome
        // hoga otherwise nahi hoga
        Stack<Integer> s = new Stack<>();
        Queue<Integer> temp = new LinkedList<>(q); // yahan humne temporary queue banayi hai because hum nahi chahte
                                                   // original queue me changes karna so isiliye humne temporary queue
                                                   // bana li jisse ki original queue safe rahe aur object ke andar 'q'
                                                   // likha hai iska mtlb hai ki hum original queue ke elements ko isme
                                                   // copy kar rahe hain isiliye 'q' likha hai jisse temporary queue
                                                   // humne same bana di ab original queue waise ki waisi rahegi usme
                                                   // changes nahi karna padega humein.....

        // Now adding the queue elements to the stack
        for (int num : q) {
            s.push(num); // queue ke elements ko push kar diya stack me jisse baad me compare kar payein
                         // temporary queue se.
        }

        while (!temp.isEmpty()) {
            if (!temp.remove().equals(s.pop())) { // agar temp queue aur stack dono se nikalne wale element agar same
                                                  // nahi hain to
                return false;
            }
        }
        return true;
    }
}
