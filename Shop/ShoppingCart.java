import java.util.Scanner;

public class ShoppingCart {

    // Method to display all items in the cart with thier corresponding prices
    public static void displayCart(Item[] arrItems, int numOfItems) {
        // Check if the cart is empty or not
        if (numOfItems < 1) {
            System.out.println("The cart is empty!");
            System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
        } else {
            for (int i = 0; i < numOfItems; i++) {
                System.out.println((i + 1) + ". " + arrItems[i].name + ": $" + arrItems[i].price);
            }
            // Calculate and display the total price
            double totalPrice = 0;
            for (int i = 0; i < numOfItems; i++) {
                totalPrice += arrItems[i].price;
            }
            System.out.println("The total price of items is $" + totalPrice);
            System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
        }
    }

    // Method to add item to the cart
    public static int addToCart(Item[] arrItems, int numOfItems, Scanner input) {
        System.out.println("Enter name of item: ");
        String itemName = input.nextLine();

        // Prompt user for the item and price and validate the input
        double itemPrice;
        while (true) {
            System.out.println("Enter item price: ");
            try {
                itemPrice = Double.parseDouble(input.nextLine());
                if (itemPrice >= 0) {
                    break;
                } else {
                    System.out.println("Price must be a non-negative number");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter a valid price");
            }
        }

        // Create new item and add it to the cart
        arrItems[numOfItems] = new Item(itemName, itemPrice);
        numOfItems++;
        System.out.println("Item added to cart");
        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
        return numOfItems;
    }

    // Method to remove items from cart
    public static int removeFromCart(Item[] arrItems, int numOfItems, Scanner input) {
        // If cart is empty prompt the user
        if (numOfItems == 0) {
            System.out.println("The cart is empty");
            System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
        } else {
            // Display current items in the cart
            displayCart(arrItems, numOfItems);

            // Prompt user for the item number to remove and validate the input
            int itemNumber;
            while (true) {
                System.out.print("Enter the item number to remove: ");
                try {
                    itemNumber = Integer.parseInt(input.nextLine());
                    if (itemNumber >= 1 && itemNumber <= numOfItems) {
                        break;
                    } else {
                        System.out.println("Invalid item number. Please enter a valid number.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid number.");
                }
            }

            // Remove the specified item by shifting the elements
            for (int i = itemNumber - 1; i < numOfItems - 1; i++) {
                arrItems[i] = arrItems[i + 1];
            }
            numOfItems--;
            System.out.println("Item removed from the cart.");
            System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
        }
        return numOfItems;
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Create an array to hold the items in the cart
        Item[] cart = new Item[100]; // Assuming a maximum of 100 items
        int itemCount = 0;
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        // Main loop to display the menu and process user choices

        while (true) {
            
            System.out.println("Menu:");
            System.out.println("1. Add item to cart");
            System.out.println("2. View cart");
            System.out.println("3. Remove item from cart");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = Integer.parseInt(input.nextLine());

            // Switch statement to handle the user's choice
            switch (choice) {
                case 1:
                    itemCount = addToCart(cart, itemCount, input);
                    break;
                case 2:
                    displayCart(cart, itemCount);
                    break;
                case 3:
                    itemCount = removeFromCart(cart, itemCount, input);
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    input.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

    }
}
