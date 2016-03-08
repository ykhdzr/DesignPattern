package pattern.design.iterator;

import java.util.Hashtable;
import java.util.Iterator;

/**
 * Created by ykhdzr on 3/8/16.
 */
public class QA implements EmployeeIterator {

    Hashtable<Integer, Employee> employees = new Hashtable<>();

    int hashKey;

    public QA() {
        employees = new Hashtable<>();

        addEmployee("Edwin", "Bekasi", 25);
        addEmployee("Raihan", "Bogor", 22);
        addEmployee("Avian", "Tangerang", 32);
    }

    private void addEmployee(String name, String address, int age) {
        Employee employee = new Employee(name, address, age);
        employees.put(hashKey, employee);
        hashKey++;
    }

    public Hashtable<Integer, Employee> getEmployees() {
        return employees;
    }

    @Override
    public Iterator createIterator() {
        return employees.values().iterator();
    }
}
