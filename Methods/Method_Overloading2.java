//WAP to show the method overloading
public class Method_Overloading2 {
    static int multiply(int a  , int b){
        return a*b;
    }
    //Non-static method
     double multiply(double a , double b){
        return a*b;
    }
    public static void main(String[] args){
        //Here we are creating the object aur second method ko non-static banaya hai aur jab hum static method se non-static method ko call karte hain to error aata hai because hum static method se kisi non-static method ko call nahi kar sakte hain kyuki main method already static hota hai aur call karne ke liye hume usko object banana padega pehle tab usko call kar sakte hain....then tb jaake metho overloading possible hai then tab fark nahi padega method static ho ya non-static
        Method_Overloading2 obj=new Method_Overloading2();
        System.out.println("Multiplications are: ");
        System.out.println("Multiply: "+multiply(4, 6));
        System.out.println("Multiply: "+obj.multiply(2.4, 1.2));

    } 
 
    
}
