
//WAP to create a class of Student with name and marks and add 5 Students in a list and and use comparable to sort them in ascending order of marks
import java.util.*;

//create a class of Student with name and marks 
class Student implements Comparable<Student> { // here we are implementing the Comparable for the Student class
    String name;
    int marks;

    // creating constructor
    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    // compare method by sorting by marks in ascending order
    @Override
    public int compareTo(Student other) {
        return this.marks - other.marks;
    }

    @Override
    public String toString() {
        return name + "-" + marks;
    }
}

// main code
public class Comparable1 {
    public static void main(String[] args) {
        // create a list
        List<Student> students = new ArrayList<>();
        // add 5 Students into the list
        students.add(new Student("Mohit", 95)); // yahan humne ek custom class banayi hai Student jisme do values hain
                                                // marks and name isiliye iska object banana padega
        students.add(new Student("Aman", 85));
        students.add(new Student("Neeraj", 75));
        students.add(new Student("Suman", 45));
        students.add(new Student("rohit", 87));

        // sort the students based on marks
        Collections.sort(students);
        // Printing the sorted list
        System.out.println("Sorted Students by Marks: ");
        for (Student student : students) {
            System.out.println(student);
        }
    }

}
