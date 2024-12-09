
import javax.swing.JOptionPane;

public class MOption {
    public static void main(String[] args) {

        // int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter first
        // number"));
        // int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter second
        // number"));

        // int sum = num1 + num2;
        // int product = num1 * num2;
        // int quotient = num1 / num2;

        // String result = String.format("The sum is %d\nThe product is %d\nThe quotient
        // is %d", sum, product, quotient);

        // JOptionPane.showMessageDialog(null, result, "Output", 1);

        String CONSTANT = "Kofi";
        String CONSTANT1 = "Ama";

        String input = JOptionPane.showInputDialog("Enter your name");

        while (!(input.equalsIgnoreCase(CONSTANT) || input.equalsIgnoreCase(CONSTANT1))) {
            input = JOptionPane.showInputDialog("Invalid input, please try again");
        }

        int score = Integer.parseInt(JOptionPane.showInputDialog("Welcome  students\nEnter your score"));

        if (score > 85) {
            JOptionPane.showMessageDialog(null, "A", "Output", 1);
        } else if (score > 75) {
            JOptionPane.showMessageDialog(null, "B", "Output", 1);
        } else if (score > 65) {
            JOptionPane.showMessageDialog(null, "C", "Output", 1);
        } else if (score > 55) {
            JOptionPane.showMessageDialog(null, "D", "Output", 1);
        } else {
            JOptionPane.showMessageDialog(null, "F", "Output", 1);
        }

    }
}
