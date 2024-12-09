
/*
 * Write a program that reads an unspecified number of integers,
 * determine how many positive and negative values have been read
 * and compute the total average of the input values (not counting zeros)
 * your program ends with the input 0.
 */

import java.util.Scanner;

public class NumberAnalyzer {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);

        int positiveCount = 0;
        int negativeCount = 0;
        int total = 0;
        int count = 0;
        
        System.out.println("Enter an integer value (0 to end)");
        while (true) {
            int number = enter.nextInt();

            if (number == 0) {
                break;
            }

            if (number > 0) {
                positiveCount += 1;
            } else if (number < 0) {
                negativeCount += 1;
            }

            total += number;
            count += 1;
        }
        if (count == 0) {
            System.out.println("No Numbers entered");
        } else {
            double average = (double) total / count;
            System.out.println("Positive numbers " + positiveCount);
            System.out.println("Negative numbers " + negativeCount);
            System.out.println("Sum of all numbers entered: " + total);
            System.out.println("Average: " + String.format("%,2f", average));
        }
        enter.close();
    }

}