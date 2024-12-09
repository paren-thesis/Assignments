//------Grade Calculator Using For Loop--------//

import java.util.Scanner;

public class GradeCalculatorForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of student");
        int numStudent = input.nextInt();

        for (int i = 1; i < numStudent; i++) {
            System.out.println("Student " + i);
            System.out.print("Enter Student Index Number: ");
            int indexNum = input.nextInt();

            System.out.println("Enter score for index number " + indexNum + ":");
            int score = input.nextInt();

            char grade;
            if (score >= 90) {
                grade = 'A';
            } else if (score >= 80) {
                grade = 'B';
            } else if (score >= 70) {
                grade = 'C';
            } else if (score >= 60) {
                grade = 'D';
            } else if (score >= 50) {
                grade = 'E';
            } else {
                grade = 'F';
            }
            System.out.println("Student " + indexNum + " had a grade score of " + grade);
        }
        input.close();
    }
}
