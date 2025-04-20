//WAP to print the numbers from (N to 1) using recursion (Tail Recursion)
public class Recursion2 {
    static void printNum(int num) {
        // Base Case
        if (num == 0) {
            return;
        }
        // first kaam karega then khudko call krega tail recursion
        System.out.println(num);
        // Recursive call
        printNum(num - 1);
    }

    // Ye tail recursion hai isme calls stack me store nahi hoti hain aur ye
    // optimised hota hai direct print hota hai store nahi hoti aur stack overflow
    // ka bhi khatra nahi hota hai
    public static void main(String[] args) {
        printNum(6);
    }

}
