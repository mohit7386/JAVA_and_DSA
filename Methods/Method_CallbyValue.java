//WAP to show the how call by value is functioning
import java.util.*;
public class Method_CallbyValue {
    static void method(int x){ //here int , float , char these data types are parameters or formal parameters and value ae stored in temporary manner.
        System.out.println("Inside Method Value before change: "+x);
        x=50; //ye temporary value hai isse hamari original value pe effect nahi padega kuch bhi 
        System.out.println("Inside Method Value (Temporary Value): "+x);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int x=sc.nextInt(); //original value hogi hamari 'a' ye waali aur iski copy paas hoti hai parameter me aur original value pe effect nahi padhta hai 
        method(x); //arguments wo values hoti hain jo hum calling ke waqt paas karte hain....aur inko actual parameters bhi kehte hain aur ye real values bhi hoti hain. Inki copy parameter me pass hoti hai real values par effect nahi aata
        System.out.println("After Calling method value of a: "+x);
sc.close();
    }
    
}
