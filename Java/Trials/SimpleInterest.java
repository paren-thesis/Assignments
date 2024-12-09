import java.util.Scanner;

import javax.swing.JOptionPane;

public class SimpleInterest {

    static Scanner input = new Scanner(System.in);

    public static double Interest() {
        System.out.println("Enter the principal amount");
        double principal = input.nextDouble();
        System.out.println("Enter the rate");
        double rate = input.nextDouble();
        System.out.println("Enter the time period");
        double time = input.nextDouble();

        double si = (principal * rate * time) / 100;

        return si;
    }

    public static void main(String[] args) {
        // System.out.println("The simple interst is " + InterestJOptionPane());
        // JOptionPane.showMessageDialog(null, "The simple interst is " + InterestJOptionPane(), "Output",
        //         JOptionPane.INFORMATION_MESSAGE);
        // Interest2(input.nextDouble(), 2, 1.5);
        Call();
    }
    
    public static void Call() {
        String p = JOptionPane.showInputDialog("Please enter the principal amount");
        String t = JOptionPane.showInputDialog("Enter the time");
        String r = JOptionPane.showInputDialog("Enter the rate");
    
        InterestJOptionPaneArg(p, t, r);
        
    }

    public static double InterestJOptionPane() {
        String princstr = JOptionPane.showInputDialog("Enter the principal amount");
        double principal = Double.parseDouble(princstr);
        String timestr = JOptionPane.showInputDialog("Enter the time in years");
        double time = Double.parseDouble(timestr);
        String ratestr = JOptionPane.showInputDialog("Enter the rate");
        double rate = Double.parseDouble(ratestr);

        double si = (principal * time * rate) / 100;

        return si;
    }

    public static void Interest2(double principal, double time, double rate) {
        double si = (principal * rate * time) / 100;
        System.out.println("The interst is " + si);
    }

    public static void InterestJOptionPaneArg(String principalstr, String timestr, String ratestr) {
        double principal = Double.parseDouble(principalstr);
        double time = Double.parseDouble(timestr);
        double rate = Double.parseDouble(ratestr);
        double si = (principal * time * rate) / 100;
        JOptionPane.showMessageDialog(null, "The simple interest " + si, "Output", JOptionPane.INFORMATION_MESSAGE);
    }

}
