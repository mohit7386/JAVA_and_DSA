
//WAP create a list of doubles and find their average 
import java.util.*;

public class ArrayList3 {
    public static void main(String[] args) {
        // creating a list of Doubles
        List<Double> numbers = new ArrayList<>(); // we use wrapper class of double
        // adding the numbers in the lst
        numbers.add(2.1);
        numbers.add(3.4);
        numbers.add(5.2);
        numbers.add(6.3);
        numbers.add(8.5);
        numbers.add(9.6);

        double sum = 0;
        // find the sum of all the numbers
        for (Double num : numbers) { // when we want to only read and printing the elements then we use for each loop
            sum = sum + num;
        }
        /*
         * Syntax of for each loop
         * for(Data Type variable : Collection)
         */
        double average = sum / numbers.size(); // numbers.size() - used to find the total number of elements in the list
        System.out.println(numbers);
        System.out.println("Average: " + average);
    }

}
