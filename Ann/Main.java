import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner check = new Scanner(System.in);

        Bank main = new Bank();
        while (true) {
            
            System.out.println("\nConsole banking app");
            System.out.println("1.Show balance\n2. Deposit\n3.Withdraw\n4.Exit");
            System.out.print("\nSelect option(1 to 4): ");
            int option = check.nextInt();

            if(option == 1){
                main.show_balance();
            }else if (option == 2) {
                main.deposit();
            }else if (option == 3) {
                main.Withdraw();
            }else if (option == 4) {
                break;
            } else {
                System.out.println("Invalid option");
            }

            //  check.close();   
        }
    }
}
