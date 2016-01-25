package pattern.design.decorator;

/**
 * Created by ykhdzr on 1/25/16.
 */
public abstract class Salary {

    protected String desc;

    public String getDesc() {
        return desc;
    }

    public abstract long totalSalary();

    public abstract long totalDeduction();
}
