
//Store custom Student objects into TreeSet based on age 
//So here we are using comparable for sorting the Students on the basis of their age
import java.util.*;

class Student implements Comparable<Student> {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student other) {
        return this.age - other.age; // ascending order age
    }

    @Override
    public String toString() {
        return name + "    " + age;
    }
}

public class Treeset5 {
    public static void main(String[] args) {
        // creating a treeset
        TreeSet<Student> set = new TreeSet<>();
        // adding the name and age of the student
        set.add(new Student("Aman", 28));
        set.add(new Student("Bosky", 29));
        set.add(new Student("Lucky", 25));
        set.add(new Student("Krish", 15));

        // printing the sorted Students data by their age
        System.out.println("Sorted Student data by their age: ");
        System.out.println("Name       Age");
        for (Student s : set) {
            System.out.println(s);
        }
    }
}
