
import java.util.Arrays;
import java.util.Scanner;

public class Switcht {

    public static void ForEach() {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the limit of the array you would like to enter");
        int lim = in.nextInt();

        int[] numbers = new int[lim];

        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("Enter value at index [%d] ", i);
            numbers[i] = in.nextInt();
        }

        Arrays.sort(numbers);

        for (int i : numbers) {
            System.out.printf("%d ", i);
        }

        in.close();
    }

    public static void ForEachtu() {
        String[] names = new String[5];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < names.length; i++) {
            System.out.printf("Enter name at index [%d]", i);
            names[i] = input.nextLine();
        }

        for (String string : names) {
            System.out.printf("%s, ", string);
        }

        input.close();
    }
    public static void main(String[] args) {
        ForEach();
        ForEachtu();
    }
}