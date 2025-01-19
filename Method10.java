//WAP to find the sum of an array using function
import java.util.*;
public class Method10 {
    static int sumArray(int[] arr){
        int sum=0;
        for(int num:arr){
            sum+=num;
        }
        return sum;
    }
    
    public static void main(String[] args){
        //try-with resource it will automatically close the sc
        try(Scanner sc=new Scanner(System.in)){ //Jab bhi kabhi sc is not closed in this location wala error aaye to hum hamesha try laga denge scanner class pe aur semicolon hata denge
        System.out.println("Enter the size of an array!");
        int size=sc.nextInt();
        if(size<=0){
            System.out.println("Invalid Array Size! Must be greater than 0.");
            return;
        }
        //creating an array
        int[] arr=new int[size];
        System.out.println("Enter the elements in the array");
        for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();
        }
        System.out.println("Sum of all the elements in the array: "+sumArray(arr));
        sc.close();
    }
}
}

