import java.util.Arrays;
import java.util.Scanner;

public class Statistics{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] elements;

        System.out.println("Enter number of array");
        int num_of_elements = input.nextInt();

        while (num_of_elements < 1) {
            System.out.println("Number of elements should be at least more than 1 element, try again");
            num_of_elements = input.nextInt();
        }
        elements = new double[num_of_elements];

        System.out.println("Enter the elements");
        for (int i = 0; i < elements.length; i++) {
            elements[i] = input.nextDouble();
        }

        input.close();
    }
    
    public static double calculateMean(double[] num_of_elements) {
        int sum = 0;
        for (double d : num_of_elements) {
            sum += d;
        }
        return sum / num_of_elements.length;
    }

    public static double calculateMedian(double[] num_of_elements) {
        Arrays.sort(num_of_elements);
        int n = num_of_elements.length;
        if (n % 2 == 0) {
            return (num_of_elements[n / 2 - 1] + num_of_elements[n / 2]) / 2.0;
        } else {
            return num_of_elements[n / 2];
        }
    }

    public static void calculateStandardDeviation(double[] num_of_elements) {
        
    }

}