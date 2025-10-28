import java.util.Arrays;

public class BasicArrays {
    public static void main(String[] args) {
        // Declare an array of integers with 5 elements
        int[] numbers = new int[5];

        // Assign values to the array elements
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // Print all elements of the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        System.out.println();
        System.out.println(Arrays.toString(numbers));
    }
}