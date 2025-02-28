//WAP to print the transporse of a matrix
import java.util.*;
public class TwoDArray2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //Enter the rows and columns of a matrix
        System.out.println("Enter the rows of a matrix");
        int rows=sc.nextInt();
        System.out.println("Enter the cols of a matrix");
        int cols=sc.nextInt();
        //For the transporse of a matrix...matrix need to be square where rows and cols need to be equal 
        if(rows!=cols){
            System.out.println("Transporse of a matrix is only valid for square matrix..So the size of the rows and cols need to be equal");
            }
            else{
        
        //Declare an 2D Array
        int[][] arr=new int[rows][cols];
        //Creating an array for storing transporse of a matrix
        int[][] transporse=new int[rows][cols];
//Taking the elements in the 2D Array'
System.out.println("Enter the elements in the 2D Array");
for(int i=0;i<arr.length;i++){
    for(int j=0;j<arr.length;j++){
        arr[i][j]=sc.nextInt();
    }}
    //Calculate the transporse of a matrix
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length;j++){
            transporse[j][i]=arr[i][j];
        }
}
//Printing the transporse of a matrix
System.out.println("Transporse of a Matrix is:-");
for(int i=0;i<arr.length;i++){
    for(int j=0;j<arr.length;j++){
System.out.print(transporse[i][j]+"  ");

    }
    System.out.println();
}
            }
sc.close();
}
    
}
