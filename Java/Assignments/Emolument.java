public class Emolument {
    private double basic_salary;
    private double tax_relief;

    //Constructor
    public Emolument(double basic_salary, double tax_relief) {
        this.basic_salary = basic_salary;
        this.tax_relief = tax_relief;
    }

    //Getter for basic_salary
    public double getBasicSalary() {
        return basic_salary;
    }

    // Getter for tax_relief
    public double getTaxRelief() {
        return tax_relief;
    }

    public double SSNIT() {
        return 0.035 * basic_salary;
    }

    // Method to calculate taxable income
    public double taxableIncome() {
        return basic_salary - (tax_relief + SSNIT());
    }
}
