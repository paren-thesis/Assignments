/*Program to guess magic number*/

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Random rand = new Random();
        int magic_num = rand.nextInt(100);

        System.out.println("Please enter the magic number");
        int guess = input.nextInt();

        while (guess != magic_num) {
            if (guess > magic_num) {
                System.out.println("Your Guess is too high, try again");
            }
            if (guess < magic_num) {
                System.out.println("Your Guess is too low, try again");
            }
            guess = input.nextInt();
        }
        System.out.println("The magic number is " + guess + ", you guessed it right");
        input.close();
    }
}
