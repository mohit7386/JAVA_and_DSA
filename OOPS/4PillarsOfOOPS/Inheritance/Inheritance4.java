/*MULTILEVEL INHERITANCE - means:

One class inherits another class, and then another class inherits that class.

🧱 Example structure:

class GrandParent {
    // Base class
}

class Parent extends GrandParent {
    // Inherits from GrandParent
}

class Child extends Parent {
    // Inherits from Parent, which inherited from GrandParent
}
So basically:

GrandParent → Parent → Child

🔍 Why use it?
Multilevel Inheritance allows you to:

Reuse code across multiple levels.

Build a hierarchy.

Add more specialization at each level. */

//Let's take an example of multilevel inheritance 
//- Company Employee Developer - example:
//Base Class
class Company{
    String companyName="Google";

    void displaycompany(){
        System.out.println("Company: "+companyName);
    }
}
//Intermediate Class 
class Employee extends Company{
    String empName= "Mohit";

    void showEmpName(){
        System.out.println("Employee Name: "+empName);
    }
}
//Child class
class Developer extends Employee{
    String techStack="Java , SpringBoot";

    void showTechStack(){
        System.out.println("Tech Stack: "+techStack);
    }
}
//Driver Code
public class Inheritance4 {
    public static void main(String[] args){
        //creating an object 
        Developer Obj=new Developer(); //Here we are creating the object of child class aur humne intermediate class ka obect kyun nhi banaya uska reason simple hai ki kyuki na develper class inherit kar rahi hai employee class ko aur employee class inherit kar rahi hai company class ko that's why developer classs ke paas saara access hai to developer class ka object banayenge to saare methods ko developer ke object ke help se hum access kar sakte hain.
        Obj.displaycompany();
        Obj.showEmpName();
        Obj.showTechStack();
    }
}
