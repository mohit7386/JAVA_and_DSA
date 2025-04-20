//Here we are using the with return and with parameter method 
public class Method_CallbyValue2 {
    static int add(int a , int b){
        System.out.println("Original Sum: "+(a+b));
        //Ye jo changes hum modified kar rahe hain ye copy me modify ho rhe hain original value pe iska koi effect nahi padega wo as it is rahegi 
        a=1;
        b=4;
        return a+b; //return type ke kaaran modified values print ho rahi hain but original values pe koi effect nahi aaya hai 
    }
    public static void main(String[] args){
        int x=5,y=6;
        int sum =add(5,6); //calling method and passing arguments and stored in the new variable sum
        System.out.println("Modified Sum: "+sum);
        System.out.println("Original Values of a and b is: " +x+ " and " +y);

    }
}
    

