import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        BankAccount user = new BankAccount();

        String[] options = { "Show Balance", "Deposit", "Withdraw", "Exit" };

        while (true) {
            Object selected = JOptionPane.showInputDialog(null, "Options Banking App?\n--------------------",
                    "Options", 1, null, options, options[0]);
            if (selected == "Show Balance") {
                user.DisplayBalance();
            } else if (selected == "Deposit") {
                user.deposit();
            } else if (selected == "Withdraw") {
                user.withdraw();
            } else {
                break;
            }
            
        }
    }
}
