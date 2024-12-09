
import javax.swing.JOptionPane;

public class NumberSorter1 {
    
    public static void main(String[] args) {
        String num1 = JOptionPane.showInputDialog("Please enter first number");
        int a = Integer.parseInt(num1);
        String num2 = JOptionPane.showInputDialog("Please enter the second number");
        int b = Integer.parseInt(num2);
        String num3 = JOptionPane.showInputDialog("Please enter the third number");
        int c = Integer.parseInt(num3);


        int temp;

        
        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        if (b > c) {
            temp = b;
            b = c;
            c = temp;
        }
        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }

        JOptionPane.showMessageDialog(null, "Sorted numbers: " + a + ", " + b + ", " + c);
    }

}
