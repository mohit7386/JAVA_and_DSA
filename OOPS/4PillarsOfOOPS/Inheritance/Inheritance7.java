//Multiple Inheritance - Actually Java does not support multiple inheritance through classes directly so we can achieve multiple inheritance using interface
//creating interfaces
interface Employee{
    void work();
}
interface Learner{
    void study();
}
//child class which implements the both interfaces 
class intern implements Employee , Learner{
    //implemets methods of employee and learner interfaces
    public void work(){
        System.out.println("8 Hours Shift!");
    }
    public void study(){
        System.out.println("12 Hours Study!");
    }
     void show(){
        System.out.println("Child class method and combination of both interfaces!");
    }
}
//Driver Code
public class Inheritance7 {
    public static void main(String[] args){
        //creating an object 
        intern Obj=new intern();
        //accessing the classes
        Obj.work();
        Obj.study();
        Obj.show();
    }
    
}
