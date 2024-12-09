import java.util.Random;
import javax.swing.JOptionPane;

public class MyPro {

    static String pickstr;

    /**
     * @param args
     */
    public static void main(String[] args) {

        String limitstr = JOptionPane.showInputDialog("Enter the number of times you'd like to play");
        int limit = Integer.parseInt(limitstr);
        
        for (int i = 0; i < limit; i++) {

            Object[] Selections = { "Rock", "Paper", "Scissors" };

            Object selected = JOptionPane.showInputDialog(null,
                    "Make a selection",
                    "Options",
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    Selections,
                    Selections[0]);

            String selectedValue = selected.toString();

            Random pick = new Random();
            int rand = pick.nextInt(3);

            switch (rand) {
                case 0:
                    pickstr = "Rock";
                    break;
                case 1:
                    pickstr = "Paper";
                    break;
                case 2:
                    pickstr = "Scissors";
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Did not get any pick");
                    break;
            }

            if (selectedValue == pickstr) {
                JOptionPane.showMessageDialog(null,
                        "Computer picked " + pickstr + " and you picked " + selectedValue + "\nIt's a tie");
            } else {
                if ((selectedValue == "Rock" && pickstr == "Scissors") ||
                        (selectedValue == "Paper" && pickstr == "Rock") ||
                        (selectedValue == "Scissors" && pickstr == "Paper")) {
                    JOptionPane.showMessageDialog(null,
                            "Computer picked " + pickstr + " and you picked " + selectedValue + "\nYou Won");
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Computer picked " + pickstr + " and you picked " + selectedValue + "\nYou Lost");
                }
                limit--;

            }
        }
    }
}
