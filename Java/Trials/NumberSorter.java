import java.util.Arrays;

import javax.swing.JOptionPane;

public class NumberSorter {
    public static void main(String[] args){
       
        int[] numbers = new int[3];

        for (int i = 0; i < 3; i++) {
            String values = JOptionPane.showInputDialog("Enter number " + (i + 1) + ": ");
            numbers[i] = Integer.parseInt(values);
        }

        Arrays.sort(numbers);

        StringBuilder output = new StringBuilder("The numbers in ascending order is ");

        for (int num : numbers) {
            output.append(num).append(", ");
        }
        JOptionPane.showMessageDialog(null, output.toString());
    }
}
