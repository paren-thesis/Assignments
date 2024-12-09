public class StudentGradeTracker {

    private String[] students;
    private int[] grades;

    // Contructors to initialise the arrays
    public StudentGradeTracker(String[] students, int[] grades) {
        this.students = students;
        this.grades = grades;
    }

    // Methods to calculate the average grade
    public double calculateAverage() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    // Method to find highest grade
    public int findHighestGrade() {
        int highest = grades[0];
        for (int grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }
        return highest;
    }

    // Method to find lowest grade
    public int findLowestGrade() {
        int lowest = grades[0];
        for (int grade : grades) {
            if (grade < lowest) {
                lowest = grade;
            }
        }
        return lowest;
    }

    // Method to display all student grades
    public void displayGrades() {
        System.out.println("Student Grades:");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i] + ": " + grades[i]);
        }
    }

    // Method to display statistics
    public void displayStatistics() {
        System.out.println("\nStatistics");
        System.out.println("Average Grade: " + calculateAverage());
        System.out.println("Highest Grade: " + findHighestGrade());
        System.out.println("Lowest Grade: " + findLowestGrade());
    }

    public static void main(String[] args) {
        // Sample data
        String[] student = { "Alice", "Bob", "Charlie", "Diana", "Edward" };
        int[] grades = { 85, 92, 78, 90, 88 };

        StudentGradeTracker tracker = new StudentGradeTracker(student, grades);

        tracker.displayGrades();

        tracker.displayStatistics();
    }
}
