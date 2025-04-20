/*final Keyword (Prevents Modification)
Why is final used?
1- To create constants (final int).
2- To prevent method overriding (final method).
3- To prevent inheritance (final class). */
//final with variable
class Sample_FinalKeyword{
    final int MAX_VALUE = 100;  //final Variable ( constant ) //final keyword acts as a constant of a variable so MAX_VALUE is fixed value it cannot be change anymore

    //creating a method 
    void display(){
        //MAX_VALUE = 200; //Cannot change a final variable because we cannot reintitalise the final variable because it prevents modifications
        System.out.println("Max Variable: "+MAX_VALUE);
    }
}
public class FinalKeyword1 {
    public static void main(String[] args){
        Sample_FinalKeyword obj=new Sample_FinalKeyword();
        obj.display();
    }
    
}
