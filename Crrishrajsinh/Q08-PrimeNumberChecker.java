import java.util.Scanner;

class PrimeNumberChecker {

    private final int number;

    public PrimeNumberChecker(int number) {
        this.number = number;
    }

    public boolean isPrime() {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int inputNumber = scanner.nextInt();

        PrimeNumberChecker checker = new PrimeNumberChecker(inputNumber);

        String message = checker.isPrime() ? inputNumber + " is a prime number." : inputNumber + " is not a prime number.";
        System.out.println(message);
    }
}
