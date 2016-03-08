package pattern.design.iterator;

/**
 * Created by ykhdzr on 3/8/16.
 */
public class Employee {

    private String name;

    private String address;

    private int age;

    public Employee(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }
}
