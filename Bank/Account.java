import java.util.Formatter;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class Account extends Bank {
    Formatter f = new Formatter();

    Account() {
        super(0.0, null, null, 0, false);
    }

    Account(double accountBalance, String accountName, String accountID, int accountPinCode, boolean isActive) {
        super(accountBalance, accountName, accountID, accountPinCode, isActive);
    }

    // Making JOptionPane Message Dialog DRY
    void prompt(String message, String title, int type) {
        JOptionPane.showMessageDialog(null, message, title, type);
    }

    // Validators
    boolean validName() {
        String name = getAccountName();
        final boolean v = (name.length() >= 5) ? true : false;
        return v;
    }

    boolean validID() {
        String id = getAccountID();
        final int l = 7;
        // Pattern to check that string contains only integer
        // values and it has a length of 7
        final String regex = "^[1-9][0-9]{" + (l - 1) + "}$";
        final boolean v = (Pattern.matches(regex, id)) ? true : false;
        return v;
    }

    boolean validPinCode() {
        int pin = getAccountPinCode();
        final int l = 4;
        final String regex = "^[1-9][0-9]{" + (l - 1) + "}$";
        final boolean v = (Pattern.matches(regex, Integer.toString(pin))) ? true : false;
        return v;
    }

    boolean allowedToCreate() {
        boolean v;
        if (validName() && validID() && validPinCode()) {
            setAccountBalance(100.00);
            v = true;
        } else {
            v = false;
        }
        return v;
    }

    public boolean createAccount() {
        
        return true;
    }

    void showAccountBalance() {
        f.format("Your current account balance is $%2f%", accountBalance);
        String value = f + "";
        String value2 = f + " you do not have funds in your account";

        if (accountBalance <= 0) {
            prompt(value2, "Current Balance", 1);
        } else {
            prompt(value, "Current Balance", 1);
        }
    }

}