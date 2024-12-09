// import javax.swing.JOptionPane;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class SaddyAndIrene {
    
    static Scanner input = new Scanner(System.in);

    public static int Add(int num1, int num2) {

        int sum = num1 + num2;
        return sum;
    }

    public static void Irene() {
        

        System.out.println("Enter first number ");
        int num1 = input.nextInt();
        System.out.println("Enter second number");
        int num2 = input.nextInt();

        int sum = num1 + num2;

        System.out.printf("The sum of %d and %d is %d", num1, num2, sum);

        input.close();
    }


    public static void Sandy() {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter first number"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the second number"));

        int sum = num1 + num2;

        String result = String.format("The sum of %d and %d is %d", num1, num2, sum);

        JOptionPane.showMessageDialog(null, result, "Output ", 1);
    }
    public static void main(String[] args) {
        
        System.out.println(Add(1, 4));
       
    }
}
