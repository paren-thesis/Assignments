import java.util.Scanner;

public class Bank {
    public double balance = 0;
    Scanner check = new Scanner(System.in);


    public void show_balance() {
        System.out.printf("Your balance is %5.2f", balance);
    }

    public void deposit() {
        System.out.println("Enter amount for deposit");
        double amount = check.nextDouble();
        if (amount < 1) {
            System.out.println("Invalid amount");
        } else {
            balance += amount;
            System.out.printf("GHC %5.2f has been deposited into your account", amount);
        }
    }

    public void Withdraw() {
        System.out.println("Enter amount to withdraw");
        double amount1 = check.nextDouble();
        if (!(amount1 < 1) && !(amount1 > balance)) {
            balance -= amount1;
            System.out.printf("Ghc %5.2f has been withdrawn from your account", amount1);
        } else {
            if (amount1 < 1) {
                System.out.println("Invalid amount to withdraw");
            }
            if (amount1 > balance) {
                System.out.println("Insufficient balance to withdraw");
            }
        }
    }
    
}
