import java.util.*;

public class Typecasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char grade = 'A';
        grade = (char) (grade + 4); // yahan pe hum char me integer add kar rahe hain joki ek interger value ban gyi
                                    // to interger bada data type hai char se to impicit conversion nahi hoga to
                                    // humein explicitly convert karna hogaa interger value ko char me here we are
                                    // converting the integer to char that's why it showing error so for
        // the resolution of this particular problem is we need to typecast the
        // expression and convert into character.
        System.out.println(grade); // Now it will print the grade by adding the 4 in the current grade

        float num = 4 + 6;
        System.out.println(num); // here it will give you the answer in float and if you want answer in only
                                 // integer then you need to force the compiler by typecasting
        System.out.println((int) num); // After Typecasting result will be in integer format
        // -----------------------------------------------------------------
        // Let's take an another example
        // Java me double hota hai agar kisi number ke baad me f nahi lagaya hai to f
        // means float otherwise double hota hai ye
        float num2 = (8.2f + 4);
        System.out.println(num2);
        System.out.println((int) num2);// here we cannot convert the float into int so if we want the answer in
        // integer format then we need to typecast the expression

        // Checking the entered number by the user is greater then the given number or
        // not ?
        System.out.println("Enter the Number!");
        int num3 = 10;
        int num4 = sc.nextInt();
        System.out.println(num3 > num4); // Aise koi bhi expression agar print karate hain to hume true ya false milta
                                         // hai answer mein
        sc.close();

    }

}
