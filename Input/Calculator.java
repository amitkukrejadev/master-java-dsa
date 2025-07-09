package Input;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        try {
            System.out.println("Calculator Started.....");
            System.out.println("Enter Two Numbers Here: ");
            int a = SC.nextInt();
            int b = SC.nextInt();

            System.out.println("Addition: " + (a + b));
            System.out.println("Multiplication: " + (a * b));
            System.out.println("Subtraction: " + (a - b));

            if (b != 0) {
                System.out.println("Division: " + (a / b));
            } else {
                System.out.println("Division by zero is not allowed.");
            }
            System.out.println("Thanks for Trying Our Calculator");

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter valid integers.");
        } catch (ArithmeticException e) {
            System.out.println("Error in arithmetic operation: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Something went wrong: " + e.getMessage());
        } finally {
            SC.close();
        }
    }
}
