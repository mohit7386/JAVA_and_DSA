//Sum of numbers using for-each loop
public class Foreachloop2 {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 6 };
        int sum = 0;
        System.out.println("Sum of the numbers is:- ");
        for (int num : numbers) { // here num points the every element of the numbers array
            sum = sum + num;
        }
        System.out.println(sum);
    }

}
