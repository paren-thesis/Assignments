//------Grade Calculator Using While Loop--------//


import java.util.Scanner;

public class GradeCalculatorDoWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char choice;
        do {
            System.out.println("Enter student index number ");
            int indexNumber = input.nextInt();

            System.out.println("Enter " + indexNumber + " exams score");
            int score = input.nextInt();

            char garde;
            if (score >= 90) {
                garde = 'A';
            }
            if (score >= 80) {
                garde = 'B';
            }
            if (score >= 70) {
                garde = 'C';
            }
            if (score >= 60) {
                garde = 'D';
            }
            if (score >= 50) {
                garde = 'E';
            } else {
                garde = 'F';
            }

            System.out.println("Student " + indexNumber + " had a grade of " + garde);
            System.out.println("Would you like to enter another student grade? (Y/N)");
            choice = input.next().charAt(0);
        } while (choice == 'Y' || choice == 'y');
        input.close();
    }
}
