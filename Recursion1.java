//WAP to print the numbers from 1 to n using recusrion
public class Recursion1 {
   public static void printNum(int num){
    //Creating a base case where recursion needs to be stop
    if(num==0){
        return; //agar hamari num ki value 0 ho jaati hai to recursion ko stop kar denged
    }
    printNum(num-1); //recursive call (Function calling itself)
    System.out.print(num+" ");
    //Here recursive call first then print the statement so the output will be in ascending order (1 to N) It also called head recursion 
    //Head  recursion follows LIFO principle where last call pehle print hogi then first call baad me print hogi so output reverse order me aata hai 
   } 
    public static void main(String[] args){
        printNum(5);
    }
}
