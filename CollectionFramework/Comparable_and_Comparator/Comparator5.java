import java.util.*;

class Employee {
    String name;
    String department;
    int salary;

    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + " | " + department + " | Rs" + salary;
    }
}

public class Comparator5 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Ankit", "TL", 50000));
        employees.add(new Employee("Riya", "Engineering", 80000));
        employees.add(new Employee("Sahil", "HR", 60000));
        employees.add(new Employee("Tina", "Engineering", 75000));
        employees.add(new Employee("Mohit", "Marketing", 45000));

        // Sort using Lambda
        // employees.sort((e1, e2) -> {
        // int deptCompare = e1.department.compareToIgnoreCase(e2.department);
        // if (deptCompare == 0) {
        // return e2.salary - e1.salary; // salary descending
        // } else {
        // return deptCompare; // department ascending
        // }
        // });
        // Sort Using Comparator
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee a, Employee b) {
                int deptCompare = a.department.compareToIgnoreCase(b.department);
                if (deptCompare == 0) {
                    return b.salary - a.salary;
                } else {
                    return deptCompare;
                }
            }
        });

        System.out.println("Sorted Employees:");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
