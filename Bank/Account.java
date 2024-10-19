import javax.swing.JOptionPane;

public class Account {
    private double accountBalance;
    private String accountName;
    private String accountID;
    private int accountPin;

    public Account() {
    }

    public Account(double accountBalance, String accountName, String accountID, int accountPin) {
        setAccountBalance(accountBalance);
        setAccountName(accountName);
        setAccountID(accountID);
        setAccountPin(accountPin);
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        try {
            if (accountBalance <= 0)
                prompt("Invalid account balance\nbalance should not be a negative number or zero", "Invalid balance!",
                        0);
            else
                this.accountBalance = accountBalance;
        } catch (Exception e) {
            prompt(accountName, accountID, accountPin);
        }
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        try {
            if (accountName.length() < 5)
                prompt("Account name should\nhave more than five characters", "Invalid Name", 0);
            else
                this.accountName = accountName;
        } catch (Exception e) {
            prompt("" + e, "Error!", 0);
        }
    }

    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        try {
            if (accountID.length() < 7)
                prompt("Invalid account ID entered", "Invalid ID", 0);
            else
                this.accountID = accountID;
        } catch (Exception e) {
            prompt("" + e, "Error!", 0);
        }
    }

    public int getAccountPin() {
        return accountPin;
    }

    public void setAccountPin(int accountPin) {
        try {
            if (accountPin < 1000 && accountPin > 9999)
                prompt("Invalid pin code\nshould be four digits long and should not start with zero", "Invalid pin", 0);
            else
                this.accountPin = accountPin;
        } catch (Exception e) {
            prompt("", "Error!", 0);
        }
    }

    public void prompt(String message, String title, int type) {
        JOptionPane.showMessageDialog(null, message, title, type);
    }

}
