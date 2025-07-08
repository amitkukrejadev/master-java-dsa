package Datatype;

public class ArithmeticOperations {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        int c = 25;

        // Original expression (Java will follow operator precedence)
        int result = c - b * a / c + a - b;
        System.out.println("Original Expression: c - b * a / c + a - b");
        System.out.println("Result (with Java's precedence): " + result);

        // Showing how Java evaluates it with brackets
        // Step-by-step: c - ((b * a) / c) + a - b
        int correctOrder = c - ((b * a) / c) + a - b;
        System.out.println("Evaluated as: c - ((b * a) / c) + a - b = " + correctOrder);

        // Now try a different bracket variation to show effect
        int customOrder1 = ((c - b) * a) / (c + a - b);
        System.out.println("Different Bracket Expression: ((c - b) * a) / (c + a - b) = " + customOrder1);

        /*
         * Operator Precedence in Java:
         * 1. Parentheses ()
         * 2. Multiplication (*) and Division (/)
         * 3. Addition (+) and Subtraction (-)
         *
         * Java evaluates: c - (b * a / c) + a - b
         */

        // One-line version
        // System.out.println("Expression Result: " + (c - b * a / c + a - b));
    }
}