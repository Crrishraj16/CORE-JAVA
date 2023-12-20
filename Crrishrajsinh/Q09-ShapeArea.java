class ShapeArea {

    private double base;
    private double height;

    // Constructor for Triangle
    public ShapeArea(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Constructor for Rectangle (overloading)
    public ShapeArea(double length, double width) {
        this.base = length;
        this.height = width; // reusing height field for rectangle area calculation
    }

    public double getTriangleArea() {
        return (base * height) / 2;
    }

    public double getRectangleArea() {
        return base * height; // using "height" as width for rectangle area
    }

    public static void main(String[] args) {
        // Calculate area of a triangle
        ShapeArea triangle = new ShapeArea(10, 5);
        double triangleArea = triangle.getTriangleArea();
        System.out.println("Area of triangle: " + triangleArea);

        // Calculate area of a rectangle
        ShapeArea rectangle = new ShapeArea(6, 3); // using same constructor with different values
        double rectangleArea = rectangle.getRectangleArea();
        System.out.println("Area of rectangle: " + rectangleArea);
    }
}
