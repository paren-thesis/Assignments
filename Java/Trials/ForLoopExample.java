
public class ForLoopExample {
    public static void main(String[] args) {
        Tried();
    }

    public static void Tried() {
        for (int i = 0; i < 5; i++) {
            System.out.println("The earth is my only home");
        }

        /// Ask why the first 3 still showed
        int[] numbers = { 1, 2, 3, 4, 3, 23 };
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);

            if (i == 3) {
                break;
            }
        }
    }
}
