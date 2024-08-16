import java.util.Scanner;
public class GradeTracker {
   static void calculateScores(int[] grades) {
        int sum = 0;
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;
        for (int grade : grades) {
            sum += grade;
            highest = Math.max(highest, grade);
            lowest = Math.min(lowest, grade);
        }
        double average = (double) sum / grades.length;

        System.out.println("Average score: " + average);
        System.out.println("Highest score: " + highest);
        System.out.println("Lowest score: " + lowest);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to the Student Grade Tracker!");
        System.out.print("Enter the number of students: ");
        int numStudents = s.nextInt();
        int[] grades = new int[numStudents];
         for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter grade for student " + (i + 1) + ": ");
            grades[i] = s.nextInt();
        }
        calculateScores(grades);
}
}