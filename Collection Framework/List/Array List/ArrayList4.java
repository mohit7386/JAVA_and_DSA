
import java.util.*;

public class ArrayList4 {
    public static void main(String[] args) {
        // creating a list
        List<Integer> numbers = new ArrayList<>();
        // adding the numbers into the list
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        // Here we are using Lambda expression to remove multiple elements like all even
        // numbers in the list
        numbers.removeIf(num -> num % 2 == 0); // yahan humne lambda expression se list ke elements ko remove kar diya
                                               // because mera java ka version 8+ hai jiska 8 se kam hai usme ye kaam
                                               // nahi karega uske liye Iterator hi best option hai list ke elements ko
                                               // remove karne ke liye and here 'num' is a temporary variable jo list ke
                                               // har element ko represent karta hai
        System.out.println("Final List: " + numbers);

        /*
         * With the use of Iterator:-> Java me jab hum java collections ko safely
         * iterate and elements ko remove karna chahte hain to hum iterator ka use karte
         * hain aur normal for and for each se karne par error aata hai
         * to after adding the data into the list we use iterator
         * Iterator<Integer> it = list.iterator();
         * while(it.hasNext()) //hasNext() - checks ki aur koi element reh gaya hai ya
         * nahi
         * {
         * int num=it.next() - It is used to get next element
         * if(num%2==0){
         * it.remove() //remove even elments from the list
         * }
         * }
         */
    }

}
