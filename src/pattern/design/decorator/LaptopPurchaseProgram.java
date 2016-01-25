package pattern.design.decorator;

/**
 * Created by ykhdzr on 1/25/16.
 */
public class LaptopPurchaseProgram extends SalaryExpenses {
    Salary salary;

    public LaptopPurchaseProgram(Salary salary) {
        this.salary = salary;
    }

    @Override
    public String getDesc() {
        return salary.getDesc() + "\n(-) Laptop Purchase Program Rp 250,000";
    }

    @Override
    public long totalDeduction() {
        return salary.totalDeduction() + 250000;
    }

    @Override
    public long totalSalary() {
        return salary.totalSalary() - 250000;
    }
}
