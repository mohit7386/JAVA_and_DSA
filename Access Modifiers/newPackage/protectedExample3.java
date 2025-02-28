//Here we can also access the protected data member in different package with subclass (Extends Class)
package newPackage;

//Now for accessing the protected member we need to import the package and class of the old file
import checkPackage.protectedExample;

public class protectedExample3 extends protectedExample { // we need to extends the class to access the protected member
                                                          // without same package
    public static void main(String[] args) {
        protectedExample3 Obj = new protectedExample3(); // yahan hum new object create kar sakte hain aur humein same
                                                         // object likhne ki need nhi hai
        System.out.println(Obj.name);
        Obj.getName();
    }
}
