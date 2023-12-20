import javax.swing.JOptionPane;

class LeapYear {

    public static void main(String[] args) {
        // Get user input for year
        String yearStr = JOptionPane.showInputDialog(null, "Enter a year to check:");

        // Try converting the input to an integer
        try {
            int year = Integer.parseInt(yearStr);

            // Check if it's a leap year
            boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;

            // Display the result
            String message = isLeapYear ? year + " is a leap year." : year + " is not a leap year.";
            JOptionPane.showMessageDialog(null, message);
        } catch (NumberFormatException e) {
            // Handle invalid input
            JOptionPane.showMessageDialog(null, "Please enter a valid year.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
