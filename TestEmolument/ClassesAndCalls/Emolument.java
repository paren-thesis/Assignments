public class Emolument {
    public double basic_salary;
    public double tax_relief;
    
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
    
    public double SNIT() {
        return 0.035 * getBasic_salary();
    }

    public double taxableIncome() {
        return getBasic_salary() - (getTax_relief() + SNIT());
    }

    public String getCompanyName() {
        return companyName;
    }
    
    
}