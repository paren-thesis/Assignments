import java.util.Random;
import java.util.Scanner;

public class GuessTheSecretNumber {
    public static void main(String[] args) {
        Random selected = new Random();

        int numGen = selected.nextInt(10);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number from 1 to 10: ");
        int userNum = input.nextInt();
        
        while (true) {
            if (userNum > numGen) {
                System.out.println("Number is too high, try again");
                userNum = input.nextInt();
            } else if (userNum < numGen){
                System.out.println("Number is too low, try again");
                userNum = input.nextInt();
                // System.out.println("You did not get the secret number right");
            } else {
                System.out.println("Congratulations! you guessed the secret number");   
                break; 
            }
        }
        input.close();
    }
}
