import javax.swing.JOptionPane;

public class TestMyEmolument {
    public static void main(String[] args) {
        double basic_salary = Double.parseDouble(JOptionPane.showInputDialog("Enter Basic Salary: "));
        double tax_relief = Double.parseDouble(JOptionPane.showInputDialog("Enter Tax Relief"));

        // Create a MyEmolument object
        MyEmolument staffSalary = new MyEmolument(basic_salary, tax_relief);

        // Calculate required values
        double basicSalary = staffSalary.getBasic_salary();
        double taxRelief = staffSalary.getTax_relief();
        double ssnitContribution = staffSalary.SSNIT();
        double taxableIncome = staffSalary.taxableIncome();
        double IncomeTax = staffSalary.incomeTax();
        double totalDeduction = staffSalary.totalDeduction();
        double netSalary = staffSalary.netSalary();

        // Display results
        String result = String.format("Basic Salary: %5.2f\nTax Relief: %5.2f\nSSNIT Contribution: %5.2f\n" +
                "Taxable Income: %5.2f\nIncome Tax: %5.2f\nTotal Deduction: %5.2f\n" +
                "Net Salary: %5.2f", basicSalary, taxRelief, ssnitContribution, taxableIncome, IncomeTax, totalDeduction,
                netSalary);

                JOptionPane.showMessageDialog(null, result);
    }
}
