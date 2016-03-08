package pattern.design.iterator;

import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by ykhdzr on 3/8/16.
 */
public class Engineer implements EmployeeIterator {

    Employee[] employees;

    int arrayValue;

    public Engineer() {
        employees = new Employee[4];

        addEmployee("Putri", "Bogor", 22);
        addEmployee("Mexan", "Tangerang", 32);
        addEmployee("Nabilla", "Jawa Tengah", 20);
    }

    private void addEmployee(String name, String address, int age) {
        Employee employee = new Employee(name, address, age);
        employees[arrayValue] = employee;
        arrayValue++;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    @Override
    public Iterator createIterator() {
        return Arrays.asList(employees).iterator();
    }
}
