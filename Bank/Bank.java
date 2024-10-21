public class Bank {
    double accountBalance;
    String accountName;
    String accountID;
    int accountPinCode;
    boolean isActive;

    public Bank() {
    }

    public Bank(double accountBalance, String accountName, String accountID, int accountPinCode, boolean isActive) {
        this.accountBalance = accountBalance;
        this.accountName = accountName;
        this.accountID = accountID;
        this.accountPinCode = accountPinCode;
        this.isActive = isActive;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public int getAccountPinCode() {
        return accountPinCode;
    }

    public void setAccountPinCode(int accountPinCode) {
        this.accountPinCode = accountPinCode;
    }
}