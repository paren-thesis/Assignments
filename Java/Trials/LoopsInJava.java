import java.util.Scanner;

public class LoopsInJava {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int x = (int) (Math.random() * 10);
        int y = (int) (Math.random() * 10);

        Scanner input = new Scanner(System.in);
        int guess_sum = x + y;
        System.out.println("The value of x is " + x + " and y is " + y);


        System.out.println("Please guess the sum");
        int user_guess = input.nextInt();
        
        while (user_guess != guess_sum) {
            System.out.println("Please try again");
            user_guess = input.nextInt();
        }

        System.out.println("You guessed the sum");
        input.close();
        }
    }


