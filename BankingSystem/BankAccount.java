import java.util.Scanner;

class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private double balance;
    private boolean isActive;

    public BankAccount(int accountNumber, String accountHolderName, double balance, boolean isActive) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = 0;
        this.isActive = true;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public boolean isActive() {
        return isActive;
    }

    public double withdraw(double amount) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter amount to withdraw");
        amount = input.nextInt();

        double balance = getBalance();
        if (amount <= getBalance() && isActive()) {
            balance -= amount;
            System.out.printf("GHC %5.2 has been withdrawn from your account", amount);
        } else {
            if (amount > getBalance()) {
                System.out.println("Isufficient balance");
            }
            if (isActive == false) {
                System.out.println("Account is inactive to make withdrawal");
            }
            input.close();
        }
        return balance;
    }


}