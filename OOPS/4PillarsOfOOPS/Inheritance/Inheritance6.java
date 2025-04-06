/*What is Hierarchical Inheritance?
When multiple child classes inherit from the same parent class, it is called Hierarchical Inheritance.

✅ Real Life Example:
Let's say we have a University class, and from it, multiple departments like EngineeringDepartment and MedicalDepartment are derived.

markdown
Copy
Edit
               University
              /         \
 EngineeringDepartment  MedicalDepartment
 */
//Parent Class
class University{
      String uniName="Dr.APJ Abdul Kalam Technical University";

      void showuniName(){
        System.out.println("University: "+uniName);
      }
}
//Multiple child class rely on the same parent that is exactly hierarchical Inheritance
//child clas
class EngineeringDepartment extends University{
      String depName="Computer Science";

      void showEngDepartment(){
        System.out.println("Engineering Department: "+depName);
      }
}
//child class
class MedicalDepartment extends University{
    String depaName="Cadiology";

    void showdepaName(){
        System.out.println("Medical Department: "+depaName);
    }
}
//Driver Code
public class Inheritance6 {
    public static void main(String[] args){
        //creating objects for the child classes yahan hum dono ke alag alag objects create karemge because kyuki dono parent pe rely hain 
        EngineeringDepartment Obj1=new EngineeringDepartment();
        MedicalDepartment Obj2=new MedicalDepartment();
        //accessing Engineering department
        System.out.println("----Engineering Info----");
        Obj1.showuniName();
        Obj1.showEngDepartment();
        //Accessing the medical Department
        System.out.println("----Medical Info----");
        Obj2.showuniName();
        Obj2.showdepaName();
    }
}
