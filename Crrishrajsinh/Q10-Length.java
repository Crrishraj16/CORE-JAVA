class Length {
    private double feet;

    public Length(double feet) {
        this.feet = feet;
    }

    public Length(Length other) {
        this.feet = other.feet;
    }

    public double getFeet() {
        return feet;
    }

    public double getCentimeters() {
        return feet * 30.48;
    }

    public String toString() {
        return String.format("%.2f feet", feet);
    }
}

public class FeetToCentimeters {

    public static void main(String[] args) {
        // Create a Length object with a specific length in feet
        Length originalLength = new Length(5);

        // Copy the object using the copy constructor
        Length convertedLength = new Length(originalLength);

        // Convert feet to centimeters in the copied object
        convertedLength.feet = convertedLength.getCentimeters();

        // Print the original and converted lengths
        System.out.println("Original length: " + originalLength);
        System.out.println("Converted length: " + convertedLength);
    }
}
