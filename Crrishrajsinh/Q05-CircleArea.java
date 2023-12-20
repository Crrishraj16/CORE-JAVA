import java.util.Scanner;

class CircleArea {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for radius
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Calculate and display area
        double area = Math.PI * radius * radius;
        System.out.println("The area of the circle is: " + area);
    }
}
