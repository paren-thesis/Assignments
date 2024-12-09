
import javax.swing.JOptionPane;

public class NewJava {
    public static void main(String[] args) {
        // This is a simple interest calculator using JOptionPane

        // Receiving inputs from user
        String princString = JOptionPane.showInputDialog("Please enter the principal amount");
        double principal = Double.parseDouble(princString);
        String timeString = JOptionPane.showInputDialog("Please enter the time period in years");
        double time = Double.parseDouble(timeString);
        String raString = JOptionPane.showInputDialog("Pleaese enter the rate given");
        double rate = Double.parseDouble(raString);
        
        double simpleInterest = (principal * time * rate) / 100;

        JOptionPane.showMessageDialog(null,
                "The simple interest to be paid is " + simpleInterest + " cedis");

    }
}
