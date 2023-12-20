import java.util.Scanner;

class GradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks obtained (out of 100): ");
        int marks = scanner.nextInt();

        // Define grade boundaries
        int[] grades = {90, 80, 70, 60, 50};
        String[] gradeLabels = {"A", "B", "C", "D", "E"};

        // Use else-if ladder to determine grade
        for (int i = 0; i < grades.length; i++) {
            if (marks >= grades[i]) {
                System.out.println("Your grade is: " + gradeLabels[i]);
                break;
            }
        }

        // Handle marks below minimum grade
        if (marks < grades[grades.length - 1]) {
            System.out.println("Your grade is: F");
        }
    }
}
