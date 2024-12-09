
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {
    //Method to calculate total meal price
    public static double calculateTotalMealPrice(double tipRate, double taxRate, double totalMealPrice) {
        double tip = tipRate * totalMealPrice;
        double tax = taxRate * totalMealPrice;
        double result = totalMealPrice + tip + tax;
        return result;
    }

    //Scanner Method to receive input from user to calculate total meal price
    //This method then calls the calculateTotalMealPrice() to show calculated meal price in the terminal
    public static void InputScanner() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the meal price");
        double MealPrice = input.nextDouble();
        System.out.println("Enter the tip rate");
        double tipRate = input.nextDouble();
        System.out.println("Enter the tax rate");
        double taxRate = input.nextDouble();

        System.out.println("The total meal price is " + calculateTotalMealPrice(tipRate, taxRate, MealPrice));
        input.close();
    }

    //JOptionPane Method to receive input from user to calculate total meal price
    //This method then calls the calculateTotalMealPrice() to show calculated meal price in the terminal
    public static void InputJOpt() {
        double totalMealPrice = Double.parseDouble(JOptionPane.showInputDialog("Enter the meal price"));
        double tipRate = Double.parseDouble(JOptionPane.showInputDialog("Enter the the tip rate"));
        double taxRate = Double.parseDouble(JOptionPane.showInputDialog("Enter the tax rate"));

        String result = "The calculated meal price is " + calculateTotalMealPrice(tipRate, taxRate, totalMealPrice);
        JOptionPane.showMessageDialog(null, result, "Output", 1);
    }

    //Method to calculate simple interest using JOptionPane Dialog
    public static void SimpInterest() {
        //Creates an instance of the class NMain
        NMain input = new NMain();

        input.setPrincipal(Double.parseDouble(JOptionPane.showInputDialog("Enter the principal amount")));
        input.setRate(Double.parseDouble(JOptionPane.showInputDialog("Enter the rate")));
        input.setTime(Double.parseDouble(JOptionPane.showInputDialog("Enter the time period")));
 
        input.getSimpleInterest();

    }
    
    //Method to show an options dailog requesting user to choose input method
    public static void MealPriceOptions() {

        Object[] options = { "JOption", "Scanner" };

        Object selected = JOptionPane.showInputDialog(null, "Select your input method\n to calculate total meal price",
                "Selection",
                1,
                null, options,
                options[0]);

        if (selected == "JOption") {
            InputJOpt();
        } else if (selected == "Scanner") {
            InputScanner();
        } else {
            //When a user deosn't make a choice, they are shown a warning message
            JOptionPane.showMessageDialog(null, "No Option was selected", null, 0);
        }

    }

    //Main Method
    public static void main(String[] args) {
        // MealPriceOptions();
        SimpInterest();
    //    System.out.println(calculateTotalMealPrice(3, 2, 60));
    }

}