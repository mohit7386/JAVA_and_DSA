//Here we are using the with return and with parameter method 
public class Method4 {
    static int add(int a , int b){
        return a+b;
    }
    public static void main(String[] args){
        int sum =add(5,6); //calling method and passing arguments and stored in the new object sum
        System.out.println("Sum: "+sum);
    }
    
}
