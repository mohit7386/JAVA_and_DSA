
//WAP to sort the list in ascending order using comparable on the basis of salary 
import java.util.*;

class Employee implements Comparable<Employee> {
    String name;
    int Salary;

    // create the constructor
    Employee(String name, int Salary) {
        this.name = name;
        this.Salary = Salary;
    }

    // method to compare the one employee to the other
    @Override
    public int compareTo(Employee other) {
        return this.Salary - other.Salary;
    }

    @Override
    public String toString() {
        return name + "-" + Salary;
    }
}

// main code
public class Comparable2 {
    public static void main(String[] args) {
        // creating a list
        List<Employee> employee = new ArrayList<>();
        // adding the salry of the employee
        employee.add(new Employee("Mohit", 70000));
        employee.add(new Employee("Aman", 120000));
        employee.add(new Employee("Rishabh", 90000));
        employee.add(new Employee("Kiran", 40000));
        employee.add(new Employee("sejal", 60000));
        employee.add(new Employee("rajat", 450000));

        // sort the employees by their salaries
        Collections.sort(employee);
        // Printing the sorted Employee
        System.out.println("Sorted Employee by their Salaries: ");
        for (Employee employees : employee) {
            System.out.println(employees);
        }

    }

}
