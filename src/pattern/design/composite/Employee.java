package pattern.design.composite;

/**
 * Created by ykhdzr on 3/8/16.
 */
public class Employee extends EmployeeComponent {

    String employeeName;

    public Employee(String employeeName) {
        this.employeeName = employeeName;
    }

    @Override
    public String getEmployeeName() {
        return employeeName;
    }

    public void showEmployeeInfo(){
        System.out.println(getEmployeeName());
    }
}
