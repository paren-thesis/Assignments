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

    // Making JOptionPane Message Dialog DRY (Don't Repeat Yourself) Code
    void prompt(String message, String title, int type) {
        JOptionPane.showMessageDialog(null, message, title, type);
    }

    // Making show message dialog code DRY
    String input(String message) {
        return JOptionPane.showInputDialog(message);
    }

    // Validators
    boolean validName() {
        String name = getAccountName();
        final boolean v;
        v = name.length() >= 5;
        return v;
    }

    boolean validID() {
        String id = getAccountID();
        final int l = 7;
        // Pattern to check that string contains only integer
        // values, and it has a length of 7
        final String regex = "^[1-9][0-9]{" + (l - 1) + "}$";
        final boolean v;
        v = Pattern.matches(regex, id);
        return v;
    }

    boolean validPinCode() {
        int pin = getAccountPinCode();
        final int l = 4;
        final String regex = "^[1-9][0-9]{" + (l - 1) + "}$";
        final boolean v;
        v = Pattern.matches(regex, Integer.toString(pin));
        return v;
    }

    boolean allowToCreate() {
        boolean v;
        if (validName() && validID() && validPinCode()) {
            setAccountBalance(100.00);
            v = true;
        } else {
            v = false;
        }
        return v;
    }

    boolean activateAccount() {
        boolean v;
        if (allowToCreate()) {
            StringBuilder str = new StringBuilder();
            str.append("Your account has been created\n");
            str.append("and credited with $" + getAccountBalance());
            str.append("\n\nWould you like to activate your account?");

            int op = JOptionPane.showOptionDialog(null, str,
                    "Activation Required",
                    JOptionPane.YES_NO_OPTION, 1,
                    null, null, null);
            v = op == 0;
            return v;
        } else {
            v = false;
        }
        return false;
    }

    boolean createAccount() {
        StringBuilder b = new StringBuilder();
        boolean v;
        setAccountName(input("Enter your account name\n-account name should have \nmore than five characters"));
        setAccountID(input("Enter an account ID\naccount ID should not begin with zero"));
        setAccountPinCode(Integer.parseInt(input("Enter your four digit pin code")));

        if (activateAccount()) {
            displayMenuOne();
            v = true;
        } else {
            if (!validID()) {
                b.append("Invalid ID\n");
            }
            if (!validName()) {
                b.append("Invalid Name\n");
            }
            if (!validPinCode()) {
                b.append("Invalid PIN code entered\n");
            }
            String m = b + "";
            prompt(m, "Invalid Inputs", 0);
            v = false;
        }
        return v;
    }

    int displayMenuOne() {
        StringBuilder cd = new StringBuilder();
        cd.append("Welcome to Bank Of Java (BOJ)\n");
        cd.append("1. Deposit Account\n");
        cd.append("2. Show Account Balance\n");
        cd.append("3. Withdraw Account\n");
        cd.append("4. Change Pin Code\n");
        cd.append("5. View Account Details\n");
        cd.append("6. Exit");

        int option = 0;

        try {
            option = Integer.parseInt(input(cd + "Select from options 1-6"));
        } catch (Exception e) {
            prompt("An Error Occurred" + e, "Error!", 0);
        }

        return option;
    }

    int selectMainMenu() {
        StringBuilder b = new StringBuilder();
        b.append("---Small Java Bank---\n");
        b.append("1. Create An Account\n");
        b.append("2. View  Our Policy\n");
        b.append("3. Exit Menu\n");
        b.append("\nSelect from Options 1-3:");
        int option = 0;
        try {
            option = Integer.parseInt(input(b + ""));
        } catch (Exception e) {
            prompt(e + "", "Error!", 0);
        }
        return option;
    }

    String ourPolicy() {
        StringBuilder st = new StringBuilder();
        st.append("---Bank Of Java---");
        st.append("This bank gives you $100 when you create an account");
        st.append("We give you the best");

        return st + "";
    }

    void Switcher() {
        int option = selectMainMenu();
        switch (option) {
            case 1:
                createAccount();
                break;
            case 2:
                prompt(ourPolicy(), "Our Policy", 1);
                break;
            case 3:
                prompt("Thank you for using our service.", "Goodbye", 1);
                break;
            default:

                break;
        }
    }

    void showAccountBalance() {
        f.format("Your current account balance is $%2f", accountBalance);
        String value = f + "";
        String value2 = f + " you do not have funds in your account";

        if (accountBalance <= 0) {
            prompt(value2, "Current Balance", 1);
        } else {
            prompt(value, "Current Balance", 1);
        }
    }

    public static void main(String[] args) {
        Account ac = new Account();
        System.out.println(ac.selectMainMenu());
        ac.Switcher();
    }
}