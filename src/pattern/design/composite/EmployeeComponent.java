package pattern.design.composite;

/**
 * Created by ykhdzr on 3/8/16.
 */
public abstract class EmployeeComponent {

    public void add(EmployeeComponent employeeComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(EmployeeComponent employeeComponent) {
        throw new UnsupportedOperationException();
    }

    public EmployeeComponent getComponent(int componentIdx) {
        throw new UnsupportedOperationException();
    }

    public String getEmployeeName(){
        throw new UnsupportedOperationException();
    }

    public void showEmployeeInfo(){
        throw new UnsupportedOperationException();
    }
}
