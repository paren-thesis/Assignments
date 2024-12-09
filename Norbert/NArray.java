import java.util.Scanner;

import javax.swing.JOptionPane;

public class NArray {
    static Scanner input = new Scanner(System.in);

    public static int Add(int num1, int num2) {
        int sum = num2 + num1;
        return sum;
    }

    public static void ScanINput() {
        System.out.println("Enter the first number");
        int num1 = input.nextInt();
        System.out.println("Enter the second number");
        int num2 = input.nextInt();

        System.out.println("The results is " + Add(num1, num2));
    }

    public static void JopINput() {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the first number"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the second number"));

        JOptionPane.showMessageDialog(null, "The results is " + Add(num1, num2), "Output", 1);
    }

    public static void main(String[] args) {
        String[] options = { "JOptionPane", "Scanner" };
        Object selection = JOptionPane.showInputDialog(null, "Select input method", "Menu", 1, null, options,
                options[0]);

        if (selection == "JOptionPane") {
            JopINput();
        } else if (selection == "Scanner") {
            ScanINput();
        } else {
            System.out.println("Nothing was selected");
        }
    }
}