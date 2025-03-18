/*static Keyword (Belongs to Class, Not Object)
Why is static used?
1- Memory optimization → Shared across all objects.
2- Used for constants.
3- Access without creating an object. */
class sample{
    static String company = "Google"; //common for all objects
    String name;

//creating a parameterized constructor 
    sample(String Nname){
        this.name=Nname; //'this' differentiate between the instance variable and constructor variable 
    }
    //creating method to display the content
    void display(){
        System.out.println(name+" works at "+company);
    }
}
public class StaticKeyword {
    public static void main(String[] args){
        //creating an object 
        sample Obj=new sample("Mohit");
        sample Obj2=new sample("Aman");
        //accessing the object 
        Obj.display();
        Obj2.display();
    }
}
//Industry Use - Used in constant and memory Optimisation
