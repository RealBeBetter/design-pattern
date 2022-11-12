package composite;

import composite.composite.Employee;

/**
 * @author wei.song
 * @since 2022/11/12 10:54
 */
public class CompositePattern {

    public static void main(String[] args) {
        Employee ceo = new Employee("John", "ceo", 30000.00);

        Employee headSales = new Employee("Robert", "Head Sales", 20000.00);

        Employee headMarketing = new Employee("Michel", "Head Marketing", 20000.00);

        Employee clerk1 = new Employee("Laura", "Marketing", 10000.00);
        Employee clerk2 = new Employee("Bob", "Marketing", 10000.00);

        Employee salesExecutive1 = new Employee("Richard", "Sales", 10000.00);
        Employee salesExecutive2 = new Employee("Rob", "Sales", 10000.00);

        ceo.add(headSales);
        ceo.add(headMarketing);

        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        // 打印该组织的所有员工
        System.out.println(ceo);
        for (Employee headEmployee : ceo.getSubordinates()) {
            System.out.println(headEmployee);
            for (Employee employee : headEmployee.getSubordinates()) {
                System.out.println(employee);
            }
        }
    }

}
