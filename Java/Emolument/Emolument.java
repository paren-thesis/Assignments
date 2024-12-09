public class Emolument {
    private double basic_salary;
    private double tax_relief;

    public Emolument(double basic_salary, double tax_relief) {
        this.basic_salary = basic_salary;
        this.tax_relief = tax_relief;
    }

    public double getBasic_salary() {
        return basic_salary;
    }

    public double getTax_relief() {
        return tax_relief;
    }

    public double SSNIT() {
        return 0.035 * basic_salary;
    }

    public double taxableIncome() {
        return basic_salary - (tax_relief + SSNIT());
    }
}