class PrimeOddNumbers {

    public static void main(String[] args) {
        // Loop from 50 to 100
        for (int number = 51; number <= 100; number += 2) {
            if (isPrime(number)) {
                System.out.println(number);
            }
        }
    }

    // Method to check if a number is prime
    private static boolean isPrime(int number) {
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
}
