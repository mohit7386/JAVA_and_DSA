//WAP to perform left rotation as per user demands 
import java.util.*;
public class Array13 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array!");
        int size=sc.nextInt();
        //creating an array
        int[] arr= new int[size];
        //Taking the elements in the array from the user
        System.out.println("Enter the elements in the array!");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        //Taking Rotations user se 
        System.out.println("Enter the no. of rotations user wants!");
        int rotation =sc.nextInt();
        //Normalize the rotation iska matalb hai ki agar user ne rotation array ke size se badhe de diye to extra rotation ko kam karne ke liye ye method use karenge jisse ki code aur efficeint bane aur ache se work kar paaye to example - jaise ki rotation hai 5 to 5 ka roataion same aayega original array ke usme koi change nahi aayega ek bhi change nhi ayega usme kyuki rotate hoke wo original position me hi aa jaayega aur bas humein 2 rotations hi karne hain to iska mtlb hua ki 7 rotation ka aur 2 rotation ka answer same hai to humein extra rotation perform karne ki need nhi hai isiliye hum rotation ka modulo nikaal lete hain.
    rotation=rotation%size;
 //Perform the left rotation
 for(int r=0;r<rotation;r++){ //loop ko jahan tak rotate karwa raha hai user wahin tak chalayenge aur ye loop kewal rotate karne ke liye hai
    int first=arr[0]; //Store the first element of the array in the variable name first. 
 
 //Shift all the element to one position left
 for(int i=0;i<size-1;i++){ //yahan size-1 isiliye liya hai kyuki jisse ki array out of bounds ka error nahi aa jaaye isiliye humne wahan pe size-1 liyaa hua hai. because neeche hum i ki value ek jyada index tak le rahe hain.
    arr[i]=arr[i+1]; //Shifts the next element to the current position isse ye ek position left me jaata jaayega

    //
 }
arr[size-1]=first; //move the first element of an array to the last element position.
    }
    //Display the rotated array
    System.out.println("Elements After Left Rotation!");
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+"  ");
    }
    sc.close();
}
}
