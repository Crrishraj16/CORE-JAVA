import java.util.Scanner;

class NumberCalculations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Calculate square and cube
        int square = number * number;
        int cube = number * number * number;

        // Display results
        System.out.println("The square of " + number + " is: " + square);
        System.out.println("The cube of " + number + " is: " + cube);
    }
}
