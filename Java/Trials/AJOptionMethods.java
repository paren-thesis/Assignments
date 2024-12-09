import java.util.Scanner;
import javax.swing.JOptionPane;

public class AJOptionMethods {

    public static void main(String[] args) {
        // Object[] menu = { "Simple interest calculator", "Add two numbers" };

        // Object selection = JOptionPane.showInputDialog(null,
        //         "Select an option",
        //         "Select",
        //         JOptionPane.INFORMATION_MESSAGE,
        //         null,
        //         menu,
        //         menu[0]);

        // String selected = selection.toString();
        // if (selected != null) {
        //     if (selected == "Simple interest calculator") {
        //         SimpleInterest();
        //     } else if (selected == "Add two numbers") {
        //         SumTwoNumbers();
        //     } else {
        //         System.out.println("Invalid selection");
        //     }
        // } else {
        //     JOptionPane.showMessageDialog(null, "No selection made ", "Uh oh", 1);
        // }
        NewArrays();
    }

    public static void JOptionTake() {
        String p = JOptionPane.showInputDialog("Enter the principal amount");
        String t = JOptionPane.showInputDialog("Enter the time period (in years)");
        String r = JOptionPane.showInputDialog("Enter the rate in percentage");

        JOptionIntD(p, t, r);
    }

    public static void JOptionIntD(String principalstr, String timestr, String ratestr) {
        double principal = Double.parseDouble(principalstr);
        double time = Double.parseDouble(timestr);
        double rate = Double.parseDouble(ratestr);

        double simpleInterest = (principal * time * rate) / 100;

        JOptionPane.showMessageDialog(null, "The simple interest calculated for the principal amount of \nGHC" +
                principal + "\nat a rate of " + rate +
                "% \nand a time period of " + time +
                " years\nis GHC" + simpleInterest, "Output", 1);
    }

    public static void ScannerTake() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the principal amount ");
        String p = input.nextLine();
        System.out.println("Enter the time period (in years)");
        String t = input.nextLine();
        System.out.println("Enter the rate (in percentage)");
        String r = input.nextLine();

        JOptionIntD(p, t, r);

        input.close();

    }

    public static void SumTwoNumbers() {
        String num1str = JOptionPane.showInputDialog("Please enter the first number");
        int num1 = Integer.parseInt(num1str);
        String num2str = JOptionPane.showInputDialog("Enter the second number");
        int num2 = Integer.parseInt(num2str);

        int sum = num1 + num2;

        JOptionPane.showMessageDialog(null, "The sum of the two numbers is " + sum, "Output", 1);
    }

    public static void NewArrays() {
        // String list = new String();
        // Scanner input = new Scanner(System.in);
        // for (int i = 0; i < list.length(); i++) {
        //     System.out.println("Enter the name" + i);
        // }
        // for (int i = 0; i < list.length(); i++) {
        //     System.out.println(i);
        // }
    }

    public static void SimpleInterest() {
        Object[] menu = { "Scanner", "JOptionPane" };

        Object selection = JOptionPane.showInputDialog(null,
                "Select an option to take input to calculate\nfor the simple interest",
                "Select",
                JOptionPane.INFORMATION_MESSAGE,
                null,
                menu,
                menu[0]);

        String selected = selection.toString();
        if (selected != null) {
            if (selected == "Scanner") {
                ScannerTake();
            } else if (selected == "JOptionPane") {
                JOptionTake();
            } else {
                System.out.println("Invalid selection");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No selection made ", "Uh oh", 1);
        }

    }
}