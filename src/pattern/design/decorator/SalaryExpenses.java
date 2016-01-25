package pattern.design.decorator;

/**
 * Created by ykhdzr on 1/25/16.
 */
public abstract class SalaryExpenses extends Salary {
    @Override
    public abstract String getDesc();

    @Override
    public abstract long totalDeduction();
}
