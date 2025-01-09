//WAP to program to right rotate the elements of an array!
import java.util.*;
public class Array14 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an Array!");
        int size=sc.nextInt();
        //Create an array 
        int[] arr=new int[size];
        //Enter the elements in the array
        System.out.println("Enter the elements in the array!");
        //taking the elements from the user 
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        //Taking no. of rotations from the user 
        System.out.println("Enter the no. of rotations ?");
        int rotations=sc.nextInt(); 
        //Normalize the rotations jisse extra rotation perform nahi karna pade agar rotations greater then size agar dede user to extra rotation ke liye code nahi chalana pade isiluge hum aisa karenge
        if(rotations>size){
            rotations=rotations%size;
        } 
        //Rotate the array to right
        for(int r=0;r<rotations;r++){
            //ab right rotate karte waqt hum jo last element hai na usko store kar denge ek last naam ke variable me 
            int last=arr[size-1];

            //Ab hum shift karenge elements ko right me 
            for(int i=size-1;i>0;i--){
                //ab ek ek elements ko uthake current positiom me dalenge 
                arr[i]=arr[i-1];
            }
            //ab last wale element ko place kar denge hum first element pe
            arr[0]=last;
        }
        //Now Displaying the rotated arrray 
        System.out.println("Elements of an array after right rotation!");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
        sc.close();

    }
    
}
