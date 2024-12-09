import java.util.Scanner;

public class Try {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name");
        String name = input.nextLine();
        System.out.println("Enter your age");
        String age = input.nextLine();
        System.out.println("Enter the name of your hometown");
        String ht = input.nextLine();

        System.err.printf("%s is my name.\nI am %s years old\nI come from %s in a region in Ghana", name, age, ht);
        input.close();
        
    }
}
