class ReverseNumberDigits {

    public static void main(String[] args) {
        int number = 12345;
        int reversedNumber = 0;

        // Extract and reverse digits one by one
        while (number > 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        System.out.println("Original number: " + number);
        System.out.println("Reversed number: " + reversedNumber);
    }
}
