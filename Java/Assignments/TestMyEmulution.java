import javax.swing.JOptionPane;

public class TestMyEmulution {
    public static void main(String[] args) {
        // Accept input from the user
        double basic_salary = Double.parseDouble(JOptionPane.showInputDialog("Enter Basic Salary:"));
        double tax_relief = Double.parseDouble(JOptionPane.showInputDialog("Enter Tax Relief:"));

        // Create a MyEmolument object
        MyEmolument staffSalary = new MyEmolument(basic_salary, tax_relief);

        // Calculate required values
        double basicSalary = staffSalary.getBasicSalary();
        double taxRelief = staffSalary.getTaxRelief();
        double ssnitContributuion = staffSalary.SSNIT();
        double taxableIncome = staffSalary.taxableIncome();
        double incomeTax = staffSalary.incomeTax();
        double totalDeduction = staffSalary.totalDeduction();
        double netSalary = staffSalary.netSalary();

        // Display results
        String result = String.format("Basic Salary: %.2f\nTax Relief: %.2f\nSSNIT Contribution: %.2f\n" +
                "Taxable Income: %.2f\nIncome Tax: %.2f\nTotal Deduction: %.2f\n" + "Net Salary: %.2f\n",
                basicSalary, taxRelief, ssnitContributuion, taxableIncome, incomeTax, totalDeduction, netSalary);

                JOptionPane.showMessageDialog(null, result);
    }
}
