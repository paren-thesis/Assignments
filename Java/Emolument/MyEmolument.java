public class MyEmolument extends Emolument {

    //Non-args Constructor
    public MyEmolument() {
        super(0, 0);
    }

    //Constructor with parameters
    public MyEmolument(double basic_salary, double tax_relief) {
        super(basic_salary, tax_relief);
    }

    //Method to calculate income tax
    public double incomeTax() {
        double taxableIncome = taxableIncome();
        double tax = 0;

        if (taxableIncome <= 500) {
            tax = 0.05 * taxableIncome;
        } else if (taxableIncome <= 1000) {
            tax = 0.05 * 500 + 0.125 * (taxableIncome - 500);
        } else {
            tax = 0.05 * 500 + 0.125 * 500 + 0.175 * (taxableIncome - 1000);
        }
        return tax;
    }

    //Method to calculate total deduction
    public double totalDeduction() {
        return SSNIT() + incomeTax();
    }

    //Method to calculate net salary
    public double netSalary() {
        return getBasic_salary() - totalDeduction();
  }
    
}