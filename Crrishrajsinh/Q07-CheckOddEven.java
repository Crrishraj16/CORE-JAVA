import javax.swing.JOptionPane;

class CheckOddEven {

    public static void main(String[] args) {
        // Get user input for the number
        String numberStr = JOptionPane.showInputDialog(null, "Enter a number:");

        // Try converting the input to an integer
        try {
            int number = Integer.parseInt(numberStr);

            // Create an object using the parameterized constructor
            NumberChecker checker = new NumberChecker(number);

            // Check and display the result
            String message = checker.isOdd() ? number + " is an odd number." : number + " is an even number.";
            JOptionPane.showMessageDialog(null, message);
        } catch (NumberFormatException e) {
            // Handle invalid input
            JOptionPane.showMessageDialog(null, "Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}

class NumberChecker {

    private final int number;

    public NumberChecker(int number) {
        this.number = number;
    }

    public boolean isOdd() {
        return number % 2 != 0;
    }
}
