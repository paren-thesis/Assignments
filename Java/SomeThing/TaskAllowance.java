import javax.swing.JOptionPane;

public class TaskAllowance {

    private double income;
    private double tax_percent;
    private double tax;

    public TaskAllowance(double income, double tax_percent, double tax) {
        this.income = income;
        this.tax_percent = tax_percent;
        this.tax = tax;
    }

    public TaskAllowance() {

    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public double getTax() {
        tax = income * tax_percent;
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getTax_percent() {
        
        if (!(income <= 0)) {
            if (income >= 100) {
                tax_percent = 0.1;
            } else if (income >= 500) {
                tax_percent = 0.3;
            } else {
                tax_percent = 0.5;
            }
        } else {
            JOptionPane.showMessageDialog(null, "The amont entered cannot be taxed", "Non-Taxable", 1);
        }
        return tax_percent;
    }

    public void setTax_percent(double tax_percent) {
        this.tax_percent = tax_percent;
    }

    public void CalculateTax() {
        JOptionPane.showMessageDialog(null, "Your tax is "+ getTax(), null, 1);
    }

}
