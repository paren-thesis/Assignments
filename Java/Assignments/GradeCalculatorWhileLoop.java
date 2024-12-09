//------Grade Calculator Using While Loop--------//

import java.util.Scanner;

public class GradeCalculatorWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char choice = 'Y';

        while (choice == 'Y' || choice == 'y') {
            System.out.println("Please enter student index number");
            int indexNumber = input.nextInt();

            System.out.println("Enter " + indexNumber + " exams score");
            int score = input.nextInt();

            char grade;
            if (score >= 90) {
                grade = 'A';
            }
            if (score >= 80) {
                grade = 'B';
            }
            if (score >= 70) {
                grade = 'C';
            }
            if (score >= 60) {
                grade = 'D';
            }
            if (score >= 50) {
                grade = 'E';
            } else {
                grade = 'F';
            }

            System.out.println("Student " + indexNumber + " recieved a garde " + grade);
            System.out.println("Would you like to enter another student garde? (Y/N):");
            choice = input.next().charAt(0);
        }
        input.close();
    }
}
