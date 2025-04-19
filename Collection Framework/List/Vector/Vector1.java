
//WAP to create a vector and add elements into the vector and also use operations of the vector
//Thread safe hai -> multiple threads ek saath access kareim to bhi koi dikkat nahi hogi
//Interanlly array maintain karta hai or dynamic array ka kaam karta hai and jab array full ho jaata ha to size double ho jaata hai..
//Ye list interface ko implement karta hai and elements arraylist ki tarah ek order me store hote hai.. 
//Ye arraylist ke comparison me thoda slow hai because of synchronization
import java.util.*;

public class Vector1 {
    public static void main(String[] args) {
        // creating a vector
        Vector<String> vector = new Vector<>();
        // adding the data into the vector
        vector.add("A");
        vector.add("B");
        vector.add("C");
        vector.add("D");
        vector.add("E");
        System.out.println("Vector Elements: " + vector);
        vector.add(5, "F");
        System.out.println("After adding the alphabet at the particular index: " + vector);
        vector.remove(5);
        System.out.println("After Removing 5th index element :" + vector);
        System.out.println("First Element: " + vector.firstElement());
        System.out.println("First Element: " + vector.lastElement());
        System.out.println("Size of the vector: " + vector.size());
    }

}
