//Here we are doing all operator operations ->
public class Operators {
    public static void main(String[] args) {
        int a = 5; // here 'a' is a variable which is used to store some value and also a name of
                   // the
                   // memory location where 5 is stored in the memory
        int b = 6;
        int c = 10;
        int sum = 0, mul = 0;
        float div = 0f;
        int d = 12;
        // Perform Operations of unary operator
        System.out.println("The Value of a after performing some Unary Operations:- " + ++a); // Pehle increment, fir
                                                                                              // print: Output 6
        System.out.println("The Value of a after performing some Unary Operations:- " + a--); // Pehle print, fir
                                                                                              // decrement: Output 6
        System.out.println("The Value of a after performing some Unary Operations:- " + a); // ab yahaan pe jo upar ki
                                                                                            // final value hogi wo print
                                                                                            // ho jaayegi

        // Performing some arithematic Operations
        sum = b + c;
        mul = b * c;
        div = (float) c / b; // ab yahan pe hua ye ki float me aaye result but hum jo divide kara rahe hain
        // wo dono interger values hain to result bhi integer me aa rha hai but float me
        // hone ke kaaran wo output me point ke baad zero kar de raha hai to isko theek
        // karne ke liye hum typecast karenge aur kisi bhi ek value ko float me convert
        // kar denge isse hoga ye ki calculation float me hogi point me hogi
        int modulo = c % b; // it is a modulo operator and it gives the remainder in output
        System.out.println("The Modulo of c % b is:- " + modulo);
        System.out.println("The sum of b and c is:- " + sum);
        System.out.println("The Multiply of b and c is:- " + mul);
        System.out.println("The Divide of c/b is:- " + div);

        // Performing Assignment Operator it is used for assigning the value and it's
        // execution is right to left.
        d = d + 12;
        System.out.println(d);
        d -= 4; // same as d=d-4; //" = " iss sign ko hi assignment operator karte hain jiski
                // help se hum kisi bhi variable ko value assign karte hain...
        System.out.println(d);

        // Performing Logical Operators Operations
        int f = 10, e = 5, g = 6, h = 6;
        System.out.println(f > e && e > 0); // Output: true LOGICAL AND in case we need to be both conditions is true
        System.out.println(f > e || e < 0); // Output: true In Logical OR If we have one value which is true then it
                                            // gives the result true and same as for false..
        System.out.println(g != h); // Output: false LOGICAL NOT in this NOT operator it reverse the result

        // Performing Ternary Operator
        String result = (a > b) ? "a is greater" : "b is greater"; // Question mark sign represent the ternary operator
        System.out.println(result); // Output: "b is greater"

        // Here we are performing Shift Operator
        int i = 5; // Binary of 5 is 0101 after left shift answer is - 1010
        System.out.println(i << 1); // here is a representation of left shift by 1 and the output or decimal
                                    // equivalent is 10 because output jo hai wo 10 dikhega kyuki binay format
                                    // convert hoke decimal ke equivalent show hota hai output mein
        int j = 7; // Binary of 7 is 0111 after left shift answer is - 1110
        System.out.println(j << 1); // Dekho kuch mat karo left shift dekhlo karke ki kitna aayega answer but jo
                                    // output show hoga wo decimal equivalent show hoga means ki jo number hai na
                                    // usko 2 se multiply kar do to answer aa jayega.

    }

}
