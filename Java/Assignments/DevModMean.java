import java.util.Scanner;

public class DevModMean {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user to enter the number of element in array
        System.out.println("Enter the number of elements: ");
        int n = input.nextInt();

        //Handle cases where the number of elements is less than 1
        while (n < 1) {
            System.out.println("Number of elements should be at least ");
        }

        input.close();

    }
}
