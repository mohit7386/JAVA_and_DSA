
//WAP and create custom priority of Student on the basis of their marks and if marks are same then sort them alphabetically 
import java.util.*;

//creating a custom class of student 
class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class PriorityQueue_Queue4 {
    public static void main(String[] args) {
        // Creating a priority queue and using comparator
        PriorityQueue<Student> pq = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if (s1.marks != s2.marks) {

                    return s2.marks - s1.marks; // descending order me sort karega on the basis of marks
                } else {
                    return s1.name.compareTo(s2.name); // when marks same hoga to alphabetically sort kar dega
                }
            }
        });
        // addint the elements in the queue
        pq.add(new Student("Rohit", 98));
        pq.add(new Student("Mohit", 89));
        pq.add(new Student("Aman", 100));
        pq.add(new Student("Laxman", 76));
        pq.add(new Student("Laxman", 65));

        // Highest marks wala student opehle aayega
        while (!pq.isEmpty()) {
            Student s = pq.poll();
            System.out.println(s.name + " " + s.marks);
            // Custom class bana ke comparator ki help se hum priority queue or queue ka
            // custom ordering define kar sakte hain custom class bana ke on the basis of
            // kuch bhi jo hum chahein uske base pe order decide kar sakte hain aur ye act
            // bhi max heap ki tarah karega
        }
    }

}
