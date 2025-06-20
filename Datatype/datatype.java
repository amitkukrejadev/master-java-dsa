package Datatype;
public class datatype {
    public static void main(String[] args) {
        // Declare a variable of type int
        // int number = 2147483647;
        //You Can Store a Maximum Value of 2147483647 in an Integer Variable.
        // If you try to store a value greater than this, it will result in an overflow.
        // Declare a variable of type int
        int number = 10;
        
        // Declare a variable of type double
        double decimalNumber = 20.5;
        
        // Declare a variable of type char
        char letter = 'A';
        
        // Declare a variable of type boolean
        boolean isTrue = true;
        
        // Print the values of the variables
        System.out.println("Integer: " + number);
        System.out.println("Double: " + decimalNumber);
        System.out.println("Character: " + letter);
        System.out.println("Boolean: " + isTrue);


        int num = 5 / 2;
        double num2 = 5.0 / 2.0; // Using double to get a precise result
        System.out.println("Integer Division Result: " + num); // Outputs 2
        // This will output 2 because both operands are integers, and integer division truncates the decimal part.
        //truncate means to remove the decimal part without rounding.
        // The result is 2 because integer division discards the fractional part.
        System.out.println("Double Division Result: " + num2); // Outputs 2.5
        // This will output 2.5 because at least one operand is a double, so the division is performed in floating-point arithmetic.
        // Example of type casting
        double castedValue = (double) number; // Casting int to double
        System.out.println("Casted Value: " + castedValue); // Outputs 10.0


        //String

    }
}
