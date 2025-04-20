
//WAP to sort the employees on the basis of their salaries and then sort the employees on the basis of their salaries > 50000
import java.util.*;

class Employee {
    String name;
    int Salary;

    Employee(String name, int Salary) {
        this.name = name;
        this.Salary = Salary;
    }

    @Override
    public String toString() {
        return name + " -> " + Salary;
    }
}

public class Lambda2 {
    public static void main(String[] args) {
        // creating a list
        List<Employee> list = new ArrayList<>();
        // adding the employees data into the list
        list.add(new Employee("Mohit", 45000));
        list.add(new Employee("Aman", 35000));
        list.add(new Employee("Bosky", 55000));
        list.add(new Employee("Sejal", 65000));
        list.add(new Employee("Sneha", 85000));

        // sort the employees on the basis of their salaries
        list.sort((e1, e2) -> e1.Salary - e2.Salary); // Sorting using Lambda Expression ye hamare code ko short kar
                                                      // deta hai
        System.out.println("Sort the employees on the basis of their Salaries!");
        for (Employee E : list) {
            System.out.println(E);
        }
        // sort the employees on the basis of their salaries > 50000
        System.out.println("Sort the employees on the basis of their salaries > 50000");
        for (Employee e : list) {
            if (e.Salary > 50000) {
                System.out.println(e);
            }
        }
    }

}
