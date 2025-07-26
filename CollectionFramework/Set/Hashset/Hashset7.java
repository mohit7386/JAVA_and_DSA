
//WAP to check if 2 arrays have any element in common and also print the common elements in both the arrays
import java.util.*;

public class Hashset7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // taking the size of the 1st array
        System.out.println("Enter the size of the 1st array: ");
        int n1 = sc.nextInt();
        // taking the size of the 2nd array
        System.out.println("Enter the size of the 2nd array: ");
        int n2 = sc.nextInt();
        // creating an array
        int[] arr1 = new int[n1];
        // creating 2nd array
        int[] arr2 = new int[n2];
        // taking elements in the 1st array and array me jab bhi unput lenge hum to
        // hamesha normal loop use karenge in comparison to for-each loop
        System.out.println("Enter the elements in the 1st array: ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        // taking the elements in the 2nd array
        System.out.println("Enter the elements in the 2nd array: ");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        // creating the hashset
        HashSet<Integer> set = new HashSet<>();
        // creating a hashset for catching the common elements
        HashSet<Integer> Commonelement = new HashSet<>();
        // adding the elements of the first array into the set
        for (int n : arr1) {
            set.add(n);
        }
        boolean found = false; // setting the boolean to be false mention that ki koi element nahi mila hai
        // check karenge set me ki second array ke elements to nahi present hain set
        // mein ?
        for (int m : arr2) {
            if (set.contains(m)) { // agar set me second array ka koi bhi element present hai to duplicate mil gaya
                found = true;
                Commonelement.add(m);
            }
        }
        // check karenge ki agar koi element found hota hai to common element mil
        // jaayega otherwise nahi milega
        if (found) {
            System.out.println("Common element exist between the two arrays");
            System.out.println("Common elements are: " + Commonelement);

        } else {
            System.out.println("Common elements doesn't exist between the two arrays");
        }
        sc.close();
    }

}
