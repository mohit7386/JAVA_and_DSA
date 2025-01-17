//WAP to print the matrix is sparse or not
import java.util.*;
public class TwoDArray4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows and cols of the matrix (n*n)");
        int n=sc.nextInt();
        int size =n*n ,count=0;
        //creating a 2D array
        int [][] arr=new int[n][n];
        //taking the elements in the array
        System.out.println("Enter the elements in the array");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
            //printing the sparse matrix
            for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
    if(arr[i][j]==0){
        count++;
    }
}

            }
            if(count>(size/2)){
                System.out.println("Matrix is Sparse Matrix");
            }
            else
            System.out.println("Matrix is not a sparse matrix");
            sc.close();
        }
    }
    

