package pattern.design.decorator;

/**
 * Created by ykhdzr on 1/25/16.
 */
public class EngineerSalary extends Salary {

    public EngineerSalary() {
        desc = "Engineer Salary Gross Rp 10,000,000";
    }

    @Override
    public long totalSalary() {
        return 10000000;
    }

    @Override
    public long totalDeduction() {
        return 0;
    }
}
