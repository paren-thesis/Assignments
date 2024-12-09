import java.util.Arrays;
import java.util.Scanner;

public class ModMeanDev {

    
    // Method to calculate the mean (average) of the entered numbers
    public static double calculateMean(double[] numbers) {
        double sum = 0.0;
        for (double num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }

    // Method to calculate the median (middle value) of the entered numbers
    public static double calculateMedian(double[] numbers) {
        Arrays.sort(numbers);
        int n = numbers.length;
        if (n % 2 == 0) {
            return (numbers[n / 2 - 1] + numbers[n / 2]) / 2.0;
        } else {
            return numbers[n / 2];
        }
    }

    // Method to calculate the standard deviation of the entered numbers
    public static double calculateStandardDeviation(double[] numbers) {
        int n = numbers.length;
        if (n < 2) {
            System.out.println("Standard deviation requires at least two elements.");
            return 0.0;
        }
        
        double mean = calculateMean(numbers);
        double sumSquaredDiffs = 0.0;
        for (double num : numbers) {
            sumSquaredDiffs += Math.pow(num - mean, 2);
        }
        return Math.sqrt(sumSquaredDiffs / (n - 1));
    }
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
        
                // Prompt the user to enter the number of elements in the array
                System.out.print("Enter the number of elements: ");
                int n = scanner.nextInt();
        
                // Handle cases where the number of elements is less than 1
                while (n < 1) {
                    System.out.println("Number of elements should be at least 1, try again");
                    n = scanner.nextInt();
                }
        
                // Accept the user's input for each element of the array
                double[] numbers = new double[n];
                System.out.println("Enter the elements:");
                for (int i = 0; i < n; i++) {
                    System.out.printf("Enter element at position [%d] ", i+1);
                    numbers[i] = scanner.nextDouble();
                }
        
                // Assign the functions used to calculate mean, median, and standard deviation
                // to variables
                double mean = calculateMean(numbers);
                double median = calculateMedian(numbers);
                double standardDeviation = calculateStandardDeviation(numbers);
        
                // Display the mean, median, and standard deviation
                System.out.printf("Mean: %.2f \n", mean);
                System.out.printf("Median: %.2f\n", median);
                System.out.printf("Standard Deviation: %.2f\n", standardDeviation);
        
                scanner.close();
            }
}