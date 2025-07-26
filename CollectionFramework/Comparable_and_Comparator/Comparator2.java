
//WAP to sort the list of elemets on the basis of name using comparator
import java.util.*;

class Student {
    String name;
    int marks;

    // constructor
    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return name + " -> " + marks;
    }
}

// main code
public class Comparator2 {
    public static void main(String[] args) {
        // creating a list
        List<Student> students = new ArrayList<>();
        // adding data to the list
        students.add(new Student("Aman", 95));
        students.add(new Student("Rohit", 85));
        students.add(new Student("Amit", 98));
        students.add(new Student("Mohit", 99));
        students.add(new Student("Bosky", 45));

        // Sorting with comparator
        Collections.sort(students, new Comparator<Student>() {
            public int compare(Student a, Student b) {
                return a.name.compareToIgnoreCase(b.name); // this logic will print the students on the basis of marks
                                                           // in ascending order
            }
        });
        // Printitng the sorted Students on the basis of marks
        System.out.println("Sorted Students Using Comparator on the basis of marks!:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

}
