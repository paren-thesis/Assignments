import javax.swing.JOptionPane;

public class MainClass {
    public static void main(String[] args) {
        RockPaperScissors rpt = new RockPaperScissors();

        String[] user = { "Rock", "Paper", "Scissors" };

        Object selected = JOptionPane.showInputDialog(null, "Make a selection", "Select", 1, null, user, user[0]);
        String a = rpt.getMchoice();

        if (selected == a) {
            JOptionPane.showMessageDialog(null,
                    "It is a tie,\nYour choise was [" + selected + "]\nComputer selected [" + a + "]", "Outcome", 1);
        } else if (selected == "Rock" && a == "Scissors" ||
                selected == "Scissors" && a == "Paper"
                || selected == "Paper" && a == "Rock") {
            JOptionPane.showMessageDialog(null,
                    "You won,\nYour choise was [" + selected + "]\nComputer selected [" + a + "]", "Outcome", 1);
        } else {
            JOptionPane.showMessageDialog(null,
                    "You lost,\nYour choise was [" + selected + "]\nComputer selected [" + a + "]", "Outcome", 1);

        }

    }
}
