import java.util.Random;

import javax.swing.JOptionPane;

public class MyArrays {

    public static String JOptioN() {
        String[] slection = { "Rock", "Paper", "Scissors" };

        Object selected = JOptionPane.showInputDialog(null,
                "Make a selection",
                "Select",
                1,
                null, slection,
                slection[0]);

        String choose = selected.toString();

        return choose;

    }

    public static void main(String[] args) {
    
        Random random = new Random();
        int number = random.nextInt(2);
        System.out.println(number);
        JOptionPane.showMessageDialog(null, JOptioN(), "Chosen", 1);
    }

}
