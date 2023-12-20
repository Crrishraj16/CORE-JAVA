import java.util.Scanner;

class FindSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int number2 = scanner.nextInt();

        // Use conditional operator to find the smallest
        int smallest = (number1 < number2) ? number1 : number2;

        System.out.println("The smallest number is: " + smallest);
    }
}
