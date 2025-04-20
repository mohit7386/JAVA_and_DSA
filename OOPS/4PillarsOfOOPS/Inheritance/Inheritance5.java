//Multilevel Inheritance
import java.util.Scanner;

// Base Class
class University {
    private String universityName = "Dr. APJ Abdul Kalam Technical University";
    private String location = "Lucknow";

    // Getter Methods
    public String getUniversityName() {
        return universityName;
    }

    public String getLocation() {
        return location;
    }

    // Setter Methods
    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    void showUniDetails() {
        System.out.println("----- Updated University Details -----");
        System.out.println("University: " + getUniversityName());
        System.out.println("Location: " + getLocation());
    }
}

// Intermediate Class
class Department extends University {
    String departmentName = "CSE";

    void showDepartment() {
        System.out.println("Department: " + departmentName);
    }
}

// Child Class
class Professor extends Department {
    String profName = "Ravikant";
    String subject = "Cloud Computing";

    void showProfessorDetails() {
        System.out.println("Professor Name: " + profName);
        System.out.println("Subject: " + subject);
    }
}

// Main Class
public class Inheritance5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Professor obj = new Professor();

        // Take input
        System.out.print("Enter University Name: ");
        String newUniName = sc.nextLine();
        obj.setUniversityName(newUniName);

        System.out.print("Enter Location: ");
        String newLocation = sc.nextLine();
        obj.setLocation(newLocation);

        // Show updated details
        obj.showUniDetails();
        obj.showDepartment();
        obj.showProfessorDetails();
    }
}
