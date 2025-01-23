//WAP to print the disk of tower of hanoi
import java.util.*;
public class Recursion7 {
    static void towerOfHanoi(int N , String Src , String Hel , String Des){
        //If only one disk , move it directly
      if(N==1){ //If only one disk then move it directly from sorce se destination tak pahucha do  
        System.out.println("Move disk "+N+ " from " +Src+ " to "+Des);
        return;
      }
      //move (n-1) disk from source to destination and helper ban jaayega destination and destination ban jaayega helper
      towerOfHanoi(N-1, Src, Des, Hel); 
      //Move nth disk from the source to destination 
      System.out.println("Move disk "+N+ " from " +Src+ " to "+Des);
      //move n-1 disk from source to destination using source as a helper
      towerOfHanoi(N-1, Hel, Src, Des);

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of disks!");
        int N=sc.nextInt();
        System.out.println("***********TOWER OF HANOI*************");
        towerOfHanoi(N, "S", "H", "D");
sc.close();
    }
    
}
