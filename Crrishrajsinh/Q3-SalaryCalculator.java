import java.util.Scanner;

class SalaryCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter hourly rate: ");
        double hourlyRate = scanner.nextDouble();

        System.out.print("Enter total hours worked: ");
        double hoursWorked = scanner.nextDouble();

        // Calculate gross salary
        double grossSalary = hourlyRate * hoursWorked;

        // Calculate tax amount
        double taxRate = 0.075;
        double taxAmount = grossSalary * taxRate;

        // Calculate net salary
        double netSalary = grossSalary - taxAmount;

        // Print results
        System.out.println("Gross salary: $" + grossSalary);
        System.out.println("Tax amount: $" + taxAmount);
        System.out.println("Net salary: $" + netSalary);
    }
}
