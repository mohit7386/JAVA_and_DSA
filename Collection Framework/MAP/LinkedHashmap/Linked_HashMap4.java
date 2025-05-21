
//WAP and remove duplicates from the string 
import java.util.*;

public class Linked_HashMap4 {
    public static void main(String[] args) {
        String str = "programming";

        LinkedHashMap<Character, Boolean> map = new LinkedHashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, true); // pehli baar aaya toh daal do
        }

        StringBuilder sb = new StringBuilder();
        for (char ch : map.keySet()) {
            sb.append(ch);
        }

        System.out.println("String after removing duplicates: " + sb.toString());
    }
}
