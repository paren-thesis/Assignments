import javax.swing.JOptionPane;

public class TestMyEmolument {
    public static void main(String[] args) {
        double bSalary = Double.parseDouble(JOptionPane.showInputDialog("Enter the basic salary"));
        double tRelief = Double.parseDouble(JOptionPane.showInputDialog("Enter tax relief"));
        
        MyEmolument Staff_Salary = new MyEmolument(bSalary, tRelief);

        double bs = Staff_Salary.getBasic_salary();
        double tf = Staff_Salary.getTax_relief();
        double snit = Staff_Salary.SNIT();
        double ti = Staff_Salary.taxableIncome();
        double it = Staff_Salary.incomeTax();
        double td = Staff_Salary.totalDeduction();
        double ns = Staff_Salary.totalDeduction();

        String output = String.format("Basic Salary: %5.2f\nTax Relief: %5.2f\nSNIT Contribution: %5.2f\nTaxable Income: %5.2f\nIncome Tax: %5.2f\nTotal Deduction: %5.2f\nNet Salary: %5.2f", bs, tf, snit, ti, it, td, ns);

        JOptionPane.showMessageDialog(null, output, "Output", 1);

    }
}
