
//WAP to find all elements that exactly appears at once in an array
import java.util.*;

public class Hashset8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        // creating an array
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // creating the hashset
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        // adding the elements in the hashset
        for (int num : arr) {
            if (!set1.add(num)) { // set.add(num) kya karta hai ki jab element naya milta hai add kar deta hai
                                  // result mein but agar koi element milta hai jo alaready present hai set me to
                                  // set duplicates allowed nahi karega aur usko remove kar deta hai remove nahi
                                  // set add hi nhi karta hai duplicate element ko aur ignore kar deta
                                  // hai......aur
                                  // false result deta hai jab agar koi element duplicate hogaa but '!' use karke
                                  // hum uske result ko reverse kar de rahe hain condition true ho ja rahi hai
                                  // jisse iske andar ki condition execute ho kyuki jab true hogi tabhi condition
                                  // exectute hogi aur duplicate wale jo element hain wo add ho jayenge set2 mein
                set2.add(num);
            }
        }
        // printing the elements
        System.out.println("Duplicate Elements: " + set2); // set2 ke andar hai jo elements duplicates hain wo pade hain
        System.out.println("Elements that exactly appear once: ");
        for (int num : arr) {
            if (!set2.contains(num)) { // to set2 ke andar to duplicates elements hain bhai to jab hum ye condition
                                       // likh rahe hain to iska mtalb hai ki jo duplicate nahi hai because '!' use
                                       // karne se reverse ho gaya logic mtlb jo nahi hai duplicate wo print ho jayenge
                System.out.println(num + " ");
            }
        }
        sc.close();
    }

}
