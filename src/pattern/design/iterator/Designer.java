package pattern.design.iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by ykhdzr on 3/8/16.
 */
public class Designer implements EmployeeIterator{

    ArrayList<Employee> employees;

    public Designer() {
        employees = new ArrayList<>();

        addEmployee("Den", "Bekasi", 25);
        addEmployee("Rob", "Bogor", 22);
        addEmployee("Wiki", "Tangerang", 32);
    }

    private void addEmployee(String name, String address, int age) {
        Employee employee = new Employee(name, address, age);
        employees.add(employee);
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    @Override
    public Iterator createIterator() {
        return employees.iterator();
    }
}
