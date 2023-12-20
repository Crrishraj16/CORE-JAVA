class ArithmeticDemo {

    // 1. Static Method
    public static int add(int a, int b) {
        return a + b;
    }

    // 2. Instance Method
    public int subtract(int a, int b) {
        return a - b;
    }

    // 3. Non-static Function Returning Function Object (Lambda)
    public static DoubleOperation multiply = (a, b) -> a * b;

    // 4. Anonymous Function (Lambda) within Expression
    public static double divide(double a, double b) {
        return b != 0 ? a / b : Double.NaN; // handle division by zero
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        // Using static method
        int sum = add(num1, num2);
        System.out.println("Sum (static method): " + sum);

        // Using instance method
        ArithmeticDemo demo = new ArithmeticDemo();
        int difference = demo.subtract(num1, num2);
        System.out.println("Difference (instance method): " + difference);

        // Using lambda function returned by another function
        double product = multiply.apply(num1, num2);
        System.out.println("Product (lambda from function): " + product);

        // Using anonymous lambda function within expression
        double quotient = divide(num1, num2);
        System.out.println("Quotient (anonymous lambda): " + quotient);
    }
}

// Interface for multiplication function
interface DoubleOperation {
    double apply(double a, double b);
}
