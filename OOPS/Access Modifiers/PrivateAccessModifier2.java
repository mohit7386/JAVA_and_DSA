//Here we are practicing private access modifier
//creating private student data and accesssing safely using getter and setter methods and we need to public the getter and setter methods then only we can access the private data outside the class because without getter and setter method in the same class we cannot access the private data directly.
class Student {
    private String StuPassword = "Mohit123"; // we can only access the private data directly we use getter and setter
                                             // methods to read and modify the data and maintain security
    // getter method

    public void getData() {
        System.out.println("Current Password: " + StuPassword);
    }

    // Setter method to modify the Private data
    public void setData(String newPass) {
        StuPassword = newPass;
    }

    // Getter method to access the new password data
    public void getnewPass() {
        System.out.println("New Password: " + StuPassword);
    }
}

public class PrivateAccessModifier2 {
    public static void main(String[] args) {
        Student Obj = new Student();
        Obj.getData(); // Calling the current getter method
        Obj.setData("Jarvis345"); // Calling the new setter method
        Obj.getnewPass(); // Calling the new getter method

    }
}
