import javax.swing.JOptionPane;

public class TryEmolument {

    public static void main(String[] args) {
        double bSalary = Double.parseDouble(JOptionPane.showInputDialog("Enter your net salary: "));
        double tRelief = Double.parseDouble(JOptionPane.showInputDialog("Enter the tax relief: "));

        MyEmolument Staff_Salary = new MyEmolument(bSalary, tRelief);

        double basicSalary = Staff_Salary.getBasic_salary();
        double taxRelief = Staff_Salary.getTax_relief();
        double ssnitContribution = Staff_Salary.SSNIT();
        double taxIncome = Staff_Salary.taxableIncome();
        double totalDeduction = Staff_Salary.totalDeduction();
        double netSalary = Staff_Salary.netSalary();

        String output = String.format("Basic Salary: %5.2f\nTax Relief: %5.2f\nSSNIT Contribution: %5.2f\nTaxable Income: %5.2f\nTotal Deduction: %5.2f\nNet Salary: %5.2f" , basicSalary,taxRelief,ssnitContribution,taxIncome,totalDeduction,netSalary);
        JOptionPane.showMessageDialog(null, output, "Output", 1);   

    }
}
