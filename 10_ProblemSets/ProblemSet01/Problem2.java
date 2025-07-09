package Problems;

public class Problem2 {
    public static void main(String[] args) {
        /*
         * Problem 2:-
         * Declare a variable of type double for temperature in Celsius.
         * Convert it to Fahrenheit using the formula:
         * F = (C × 9/5) + 32
         * Print the result with labels.
         */
        double celsius = 36.5;
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Temperature in Celsius: " + celsius);
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    }
}
