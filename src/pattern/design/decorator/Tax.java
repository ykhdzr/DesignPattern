package pattern.design.decorator;

/**
 * Created by ykhdzr on 1/25/16.
 */
public class Tax extends SalaryExpenses {
    Salary salary;

    public Tax(Salary salary) {
        this.salary = salary;
    }

    @Override
    public String getDesc() {
        return salary.getDesc() + "\n(-) Tax Rp 700,000";
    }

    @Override
    public long totalDeduction() {
        return salary.totalDeduction() + 700000;
    }

    @Override
    public long totalSalary() {
        return salary.totalSalary() - 700000;
    }
}
