//WAP to find the maximum element in the Queue using LinkedList
package Implementations.linkedlist;

import java.util.*;

public class Linkedlist_Queue4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();
        // Taking user input
        System.out.println("Enter how many numbers you want to add in the queue ?");
        int limit = sc.nextInt();
        System.out.println("Enter the " + limit + " numbers: ");
        for (int i = 0; i <= limit; i++) {
            int num1 = sc.nextInt();
            q.add(num1);
        }
        int max = Integer.MIN_VALUE;

        for (int num : q) {
            if (num > max)
                max = num;
        }

        System.out.println("Max element: " + max); // 9
    }
}
