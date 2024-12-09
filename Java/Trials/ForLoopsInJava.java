

import java.util.Scanner;

public class ForLoopsInJava {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        for (int i = 0; i < 4; i++) {
            System.out.println("Please enter the index number of the student");
            String stu_index = input.nextLine();
            System.out.println("Please enter the student exams score");
            double exams_score = input.nextDouble();
            
            char grade;
            if (exams_score > 80) {
                grade = 'A';
            } else if (exams_score > 70) {
                grade = 'B';
            } else if (exams_score > 60) {
                grade = 'C';
            } else if (exams_score > 50) {
                grade = 'D';
            } else if (exams_score > 40) {
                grade = 'E';
            } else {
                grade = 'F';
            }
            System.out.println("The student " + stu_index + " had a grade " + grade);
        }
        input.close();
    }
}
