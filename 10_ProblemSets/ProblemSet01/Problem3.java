package Problems;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        /*
         * Problem 3:-
         * Declare two variables of type int for length and breadth.
         * Calculate and print the area and perimeter of the rectangle.
         */
        int length;
        int breadth;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the INTEGER Values Only");

        System.out.print("Enter length: ");
        length = sc.nextInt();

        System.out.print("Enter breadth: ");
        breadth = sc.nextInt();

        int area = length * breadth;
        int perimeter = 2 * (length + breadth);

        System.out.println("Area of Rectangle: " + area);
        System.out.println("Perimeter of Rectangle: " + perimeter);

        sc.close();
    }
}
