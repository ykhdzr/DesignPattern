package pattern.design.decorator;

/**
 * Created by ykhdzr on 1/25/16.
 */
public class Jamsostek extends SalaryExpenses {
    Salary salary;

    public Jamsostek(Salary salary) {
        this.salary = salary;
    }

    @Override
    public String getDesc() {
        return salary.getDesc() + "\n(-) Jamsostek Rp 400,000";
    }

    @Override
    public long totalDeduction() {
        return salary.totalDeduction() + 400000;
    }

    @Override
    public long totalSalary() {
        return salary.totalSalary() - 400000;
    }
}
