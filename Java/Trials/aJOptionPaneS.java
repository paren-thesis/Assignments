import javax.swing.JOptionPane;

public class aJOptionPaneS {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "This is a simple calculator \n Click Okay to continue","Something",JOptionPane.WARNING_MESSAGE);
        String num1Str = JOptionPane.showInputDialog("Please enter the first number");
        int num1 = Integer.parseInt(num1Str);
        String num2Str = JOptionPane.showInputDialog("Please enter the second number");
        int num2 = Integer.parseInt(num2Str);

        int sum = num1 + num2;

        JOptionPane.showMessageDialog(null, "The sum of the two numbers is " + sum,
                "Results",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
