
//WAP to sort the Employees on the basis of their slary in descending order if salary is not same the sort the employees on the basis of their age...
import java.util.*;

class Employee {
    String name;
    int age;
    int Salary;

    Employee(String name, int age, int Salary) {
        this.name = name;
        this.age = age;
        this.Salary = Salary;
    }

    @Override
    public String toString() {
        return name + "-" + age + "-" + Salary;
    }
}

// main code
public class Comparator3 {
    public static void main(String[] args) {
        // creating a list
        List<Employee> employee = new ArrayList<>();
        // adding the employees to the list
        employee.add(new Employee("Aman", 27, 65000));
        employee.add(new Employee("Mohit", 25, 65000));
        employee.add(new Employee("Srishti", 23, 65000));
        employee.add(new Employee("Rohit", 28, 85000));
        employee.add(new Employee("Bosky", 29, 55000));

        // sort the employees on the basis of therir salary if it is not equal then sort
        // on the basis of age
        Collections.sort(employee, new Comparator<Employee>() {
            @Override
            public int compare(Employee a, Employee b) {
                if (b.Salary != a.Salary) {
                    return b.Salary - a.Salary; // descending order salary
                } else
                    return a.age - b.age;
            }

        });
        // Printing the Employees
        for (Employee employees : employee) {
            System.out.println(employees);
        }
    }
}
