//WAP to find the upper triangular matrix in an array - upper triangular matrix me Lower non-diagonal elements 0 ho jate hain.
import java.util.*;
public class TwoDArray3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of rows and cols (n*n)");
        int n=sc.nextInt();
        //creating an 2D array
        int[][]arr=new int[n][n];
        //taking the elements in the array
        System.out.println("Enter the elements in the array");
        for(int i = 0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
            //printing the upper triangular matrix
            System.out.println("***************************************");
            System.out.println("Printing the upper triangular matrix:-");
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(i>j){
                        System.out.print("0 "); //set the elements below the diagonal to 0.
                    }
                    else{
                        System.out.print(arr[i][j]+" ");
                    }
                }
                System.out.println();
            }
            sc.close();
        }
    }
    

