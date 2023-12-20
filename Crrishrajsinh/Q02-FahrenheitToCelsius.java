class FahrenheitToCelsius {

    public static void main(String[] args) {
        // Declare Fahrenheit temperature
        double fahrenheit = 77.0;  // Replace with your desired temperature

        // Calculate Celsius temperature
        double celsius = (fahrenheit - 32.0) / 1.8;

        // Print the converted temperature
        System.out.printf("%s°F is equal to %.2f°C", fahrenheit, celsius);
    }
}
