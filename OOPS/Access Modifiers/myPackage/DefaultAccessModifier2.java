//Here we are checking the default modifier accessibility - which is only in the same package
package myPackage; //same package name

//aise hum default modifier ko access kar sakte hain same package ke andar direct same object call karke and same method ko call karke hum access kar sakte hain with in the package

public class DefaultAccessModifier2 {
    public static void main(String[] args) {
        defaultmodifier obj = new defaultmodifier(); // same object hona chahiye uss file ka aur method bhi same
        obj.displaycheck(); // calling the method of another file with same package
    }
}
