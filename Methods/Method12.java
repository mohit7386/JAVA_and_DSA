//WAP to print the fibonacci series using function
//Looks like - 0 1 1 2 3 5 8.....
//third number will be the sum of first and second number
import java.util.*;
public class Method12 {
    static void fibo(int num){
        int first=0;
        int second=1;
        System.out.print(first+" "+second+" ");
        int next=0;
        for(int i=2;i<num;i++){
            next=first + second;
        System.out.print(next+" ");
        first=second;
        second=next;
    }
}

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
System.out.println("Enter limit for fibonacci series: ");
int num=sc.nextInt();
System.out.print("The Fibonacci Series: ");
fibo(num);
sc.close();
    }
}
