package composite.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wei.song
 * @since 2022/11/12 10:55
 */
public class Employee {

    private final String name;
    private final String dept;
    private final Double salary;
    private final List<Employee> subordinates;

    public Employee(String name, String dept, Double salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        subordinates = new ArrayList<>();
    }

    public void add(Employee employee) {
        subordinates.add(employee);
    }

    public void remove(Employee employee) {
        subordinates.remove(employee);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                '}';
    }
}
