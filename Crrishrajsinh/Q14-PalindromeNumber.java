class PalindromeNumber {

    static boolean isPalindrome(int number) {
        if (number < 10) {
            return true; // single digit numbers are palindromes
        }
        int reversed = 0;
        int original = number;
        while (number > 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return number == reversed;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121) ? "121 is a palindrome." : "121 is not a palindrome.");
        System.out.println(isPalindrome(12321) ? "12321 is a palindrome." : "12321 is not a palindrome.");
    }
}
