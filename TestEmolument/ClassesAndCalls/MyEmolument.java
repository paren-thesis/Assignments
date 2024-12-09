
public class MyEmolument extends Emolument {

    public MyEmolument(double basic_salary, double tax_relief) {
        super(basic_salary, tax_relief);
    }

    public MyEmolument() {
        super(0, 0);
    }

    public double incomeTax() {
        double income = taxableIncome();
        double tax = 0;

        if (income <= 500) {
            tax = income * 0.05;
        } else if (income <= 1000) {
            tax = 0.05 * 500 + 0.125 * (income - 500);
        } else {
            tax = 0.05 * 500 + 0.125 * 500 + 0.175 * (income - 1000);
        }
        return tax;
    }

    public double totalDeduction() {
        return SNIT() + incomeTax();
    }

    public double netSalary() {
        return getBasic_salary() - totalDeduction();
    }

}
