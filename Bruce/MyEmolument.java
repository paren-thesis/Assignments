
public class MyEmolument extends Emolument{

    public MyEmolument(double basic_salary, double tax_relief) {
        super(basic_salary, tax_relief);
    }

    public MyEmolument() {
        super(0, 0);
    }

    public double incomeTax() {
        double taxableIncom = taxableIncome();
        double tax = 0;

        if (taxableIncom <= 500) {
            tax = taxableIncom * 0.05;
        } else if (taxableIncom <= 1000) {
            tax = 0.05 * 500 * 0.0125 * (taxableIncom - 500);
        } else {
            tax = 0.05 * 500 + 0.125 * 500 + 0.175 * (taxableIncom - 1000);
        }
        return tax;
    }
    
    public double totalDeduction() {
        return SSNIT() + incomeTax();
    }
    
    public double netSalary() {
        return getBasic_salary() - totalDeduction();
    }
    
}
