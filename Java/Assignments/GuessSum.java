/*Write a Java program that generates two random numbers,
*ask the user to add them, and keeps prompting the user until
*they provide the correct answer. it provides 
*immediate feedback to the user when they provide
*the correct answer
 */

import java.util.Random;
import java.util.Scanner;

public class GuessSum {
    public static void main(String[] args) {
        // Creating Scanner and Random objects
        Scanner input = new Scanner(System.in);
        Random randy = new Random();
        // Generating two random numbers
        int num1 = randy.nextInt(100);
        int num2 = randy.nextInt(100);
        // Sum of two random generated numbers
        int sum = num1 + num2;

        System.out.println("The two numbers are " + num1 + " and " + num2);
        System.out.println("Compute the sum");
        int guess_sum = input.nextInt();

        while (guess_sum != sum) {

            System.out.println("You entered the wrong sum, try again");
            guess_sum = input.nextInt(); 
        }
        input.close();
        System.out.println("Congrats!!! You guessed it right");
    }
}
