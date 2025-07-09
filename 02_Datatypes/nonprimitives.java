package Datatypes;

public class nonprimitives {
    public static void main(String[] args) {
        // String - Non-primitive type
        String name = "Amit Kukreja";
        String greeting = "Welcome to Java!";

        // Print string variables
        System.out.println("Name: " + name);
        System.out.println("Greeting: " + greeting);

        // Array - Non-primitive type
        int[] marks = { 85, 90, 78 };

        // Print array values
        System.out.println("Marks:");
        System.out.println("Subject 1: " + marks[0]);
        System.out.println("Subject 2: " + marks[1]);
        System.out.println("Subject 3: " + marks[2]);

        // Null value example
        String empty = null;
        System.out.println("Empty string variable: " + empty);
    }
}