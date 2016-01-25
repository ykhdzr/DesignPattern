package pattern.design.decorator;

/**
 * Created by ykhdzr on 1/25/16.
 */
public class DesignerSalary extends Salary {

    public DesignerSalary() {
        desc = "Designer Salary Gross Rp 7,000,000";
    }

    @Override
    public long totalSalary() {
        return 7000000;
    }

    @Override
    public long totalDeduction() {
        return 0;
    }
}
