//Student Class Tasks 

import java.util.ArrayList;
import java.util.List;

class Student {
    String Name;
    int marks;

    // constructor
    Student(String Name, int marks) {
        this.Name = Name; // refers to the Instance of this class
        this.marks = marks;
    }

    // @Override
    public String toString() {
        return Name + "-" + marks;
    }
}

// main code
public class ArrayList9 {
    public static void main(String[] args) {
        // creating a list
        List<Student> students = new ArrayList<>(); // here we use Student class because hum usi ke objects ko create
                                                    // karenge to isiliye humne Student use kiya
        // adding the objects of the student class name and marks of the multiple
        // students
        students.add(new Student("Aman", 97)); // here we are using new Student kyuki yahan humein multiple details
                                               // chahiye name and marks dono isiliye pehle humne student class banayi
                                               // fir uske objects banake list me daala.
        students.add(new Student("Mohit", 85));
        students.add(new Student("Rishabh", 86));
        students.add(new Student("Aditya", 90));
        students.add(new Student("Maya", 89));

        // sort by marks
        for (int i = 0; i < students.size() - 1; i++) {
            for (int j = i + 1; j < students.size(); j++) {
                if (students.get(i).marks < students.get(j).marks) { // here we are tracking the all index of i and j if
                                                                     // i wala element agar j se chota hai to swap kar
                                                                     // denge i ko j me aur j ko i me
                    Student temp = students.get(i);
                    students.set(i, students.get(j));
                    students.set(j, temp);

                }
            }
        }
        // Students Sorted by marks
        System.out.println("Students Sorted by Marks: ");
        for (Student s : students)
            System.out.println(s);

        // 🔹 Top 3 Scorers
        System.out.println("\nTop 3 Scorers:");
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).marks > 87) { // yahan hum direct students.get(i) nahi likh sakte hain bhai because
                                              // students.get(i) pura ek object return karta hai (Student type ka), aur
                                              // usko directly number (> 87) se compare nahi kar sakte.
                System.out.println(students.get(i));
            }
        }

        // 🔹 Count marks > 75
        int count = 0;
        for (Student s : students) {
            if (s.marks > 75) {
                count++;
            }
        }
        System.out.println("\nStudents with Marks > 75: " + count);

        // 🔹 Average Marks
        int sum = 0;
        for (Student s : students) {
            sum += s.marks;
        }
        double average = (double) sum / students.size();
        System.out.println("\nAverage Marks: " + average);
    }
}
