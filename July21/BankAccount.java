import javax.swing.JOptionPane;

class BankAccount{
    public double balance = 0;

    public void deposit() {
        double amount = Double.parseDouble(JOptionPane.showInputDialog("Enter amount to deposit:"));
        if (amount > 0 ) {
            balance += amount;
            String neb = String.format("GHC %5.2f has been deposited into your account\nYour new balance is GHC %5.2f",
                    amount, balance);
            JOptionPane.showMessageDialog(null, neb, "Message", 1);
        } else {
            JOptionPane.showMessageDialog(null, "You entered an invalid amount", "Error", 0);
        }
    }
    
    public void withdraw() {
        double amount = Double.parseDouble(JOptionPane.showInputDialog("Enter amount to deposit:"));
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            String neb = String.format(
                    "GHC %5.2f has been withdrawn from your account\nYour new balance is GHC %5.2f", amount, balance);
            JOptionPane.showMessageDialog(null, neb, "Message", 1);
        } else {
            JOptionPane.showMessageDialog(null, "You don't have enough balance to make that withdrawal", "Insufficient Balance ", 0);
        }
    }
    
    public double DisplayBalance() {
        String output = String.format("Your current balance is GHC %5.2f", balance);
        JOptionPane.showMessageDialog(null, output, "Current Balance", 0);
        return balance;
    }

}