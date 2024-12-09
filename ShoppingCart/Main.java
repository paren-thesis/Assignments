import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Item[] cart = new Item[100];
        int itemCount = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Shopping Cart Menu");
            System.out.printf("1. Add Item\n2. View Cart\n3. Remove Item\n4. Exit\nSelect an option: ");
            int selected = scanner.nextInt();

            if (selected == 1) {
                ShoppingCart.addToCart(cart, itemCount, scanner);
            } else if (selected == 2) {
                ShoppingCart.displayCart(cart, itemCount);
            } else if (selected == 3) {
                ShoppingCart.removeFromCart(cart, itemCount, scanner);
                itemCount--;
            } else if (selected == 4) {
                System.out.println("Exiting the program");
                scanner.close();
                return;
            } else {
                System.out.println("Invalid option, try again");
            }

        }
    }
}
