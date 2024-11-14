import java.util.*;

public class dowhileloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of num!");
        int num = sc.nextInt();
        // dowhile loops me pehle initialisation hota hai then statement print ho
        // jaayega fr uske baad hi increment / decrement hota hai uske baad condition
        // check hoti hai that means ye loop ek baar to chalega kam se kam ek bar to
        // print karega hi uske baad hi condition check hogi
        int i = 1; // initialisation
        do {
            System.out.println("Hello doWhile loops!"); // printing the statement
            i++; // then after that increment and decrement the statement
        } while (i <= num); // after that checking the condition
        sc.close();
    }

}
