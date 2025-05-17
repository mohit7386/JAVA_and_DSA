
//WAP and count frequency of each elements in an array and print their frequencies using hashmap 
import java.util.*;

public class HashMap4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();
        // creating an array
        int[] arr = new int[size];
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // creating a map
        Map<Integer, Integer> map = new HashMap<>();
        // Now traversing and checking each element in the array
        for (int num : arr) {
            if (map.containsKey(num)) { // check karenge ki element pehle exist kar raha tha map me ya nahi agar kar
                                        // raha tha to count increase kar denge
                map.put(num, map.get(num) + 1); // agar koi already present milta hai to uska count increase kar denge
                                                // map me..../*Jab num key already map me present hoti hai, tab uski
                                                // existing value ko 1 se increase karte hain.Yeh line kaam karegi only
                                                // if map.get(num) null nahi hai.Agar num key map me exist nahi karti,
                                                // to map.get(num) return karega null, aur null + 1 pe error aayega => ❌
                                                // NullPointerException */

            }
            // aur agar pehle se exist nahi karta means first time aaya hai tab hum as it is
            // print kar denge aur 1 hi rehne denge usko
            else {
                map.put(num, 1);
            }
        }

        // Print the frequency of elements
        System.out.println("Printing Frequency Count: ");
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }

}
