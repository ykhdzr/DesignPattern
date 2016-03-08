package pattern.design.composite;

/**
 * Created by ykhdzr on 3/8/16.
 */
public class HRD {

    EmployeeComponent employeeComponent;

    public HRD(EmployeeComponent employeeComponent) {
        this.employeeComponent = employeeComponent;
    }

    public void displayOrganizationStructure() {
        employeeComponent.showEmployeeInfo();
    }
}