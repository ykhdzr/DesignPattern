package pattern.design.composite;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by ykhdzr on 3/8/16.
 */
public class EmployeeManager extends EmployeeComponent {

    ArrayList employeeComponents = new ArrayList();

    String managerName;

    public EmployeeManager(String managerName) {
        this.managerName = managerName;
    }

    public String getManagerName() {
        return managerName;
    }

    @Override
    public void add(EmployeeComponent employeeComponent) {
        employeeComponents.add(employeeComponent);
    }

    @Override
    public void remove(EmployeeComponent employeeComponent) {
        employeeComponents.remove(employeeComponent);
    }

    @Override
    public EmployeeComponent getComponent(int componentIdx) {
        return (EmployeeComponent) employeeComponents.get(componentIdx);
    }

    public void showEmployeeInfo() {
        System.out.println(getManagerName());
        Iterator iterator = employeeComponents.iterator();
        while (iterator.hasNext()) {
            EmployeeComponent employeeComponent = (EmployeeComponent) iterator.next();
            employeeComponent.showEmployeeInfo();
        }
    }
}
