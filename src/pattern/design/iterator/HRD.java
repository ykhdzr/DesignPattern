package pattern.design.iterator;

import java.util.Iterator;

/**
 * Created by ykhdzr on 3/8/16.
 */
public class HRD {

    /*Engineer engineer;
    Designer designer;
    QA qa;*/

    EmployeeIterator iterEngineer, iterDesigner, iterQa;

    /*public HRD(Engineer engineer, Designer designer, QA qa) {
        this.engineer = engineer;
        this.designer = designer;
        this.qa = qa;
    }*/

    public HRD(EmployeeIterator iterEngineer, EmployeeIterator iterDesigner, EmployeeIterator iterQa) {
        this.iterEngineer = iterEngineer;
        this.iterDesigner = iterDesigner;
        this.iterQa = iterQa;
    }

    /*public void showEmployeeList() {
        System.out.println("List of Engineer at Ice House");
        for (int i = 0; i < engineer.getEmployees().length; i++) {
            System.out.println(engineer.getEmployees()[i].getName());
        }

        System.out.println();
        System.out.println("List of Designer at Ice House");
        for (int i = 0; i < designer.getEmployees().size(); i++) {
            System.out.println(designer.getEmployees().get(i).getName());
        }

        System.out.println();
        System.out.println("List of QA at Ice House");
        for (Enumeration<Integer> e = qa.getEmployees().keys(); e.hasMoreElements(); ) {
            System.out.println(qa.getEmployees().get(e.nextElement()).getName());
        }
    }*/

    public void showEmployeeList2() {
        Iterator engineer = iterEngineer.createIterator();
        Iterator designer = iterDesigner.createIterator();
        Iterator qa = iterQa.createIterator();

        System.out.println("List of Engineer at Ice House");
        printEmployees(engineer);

        System.out.println();
        System.out.println("List of Designer at Ice House");
        printEmployees(designer);

        System.out.println();
        System.out.println("List of QA at Ice House");
        printEmployees(qa);
    }

    private void printEmployees(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(((Employee) iterator.next()).getName());
        }
    }
}
