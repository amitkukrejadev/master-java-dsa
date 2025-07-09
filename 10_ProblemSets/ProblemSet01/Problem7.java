package Problems;

public class Problem7 {
    public static void main(String[] args) {
        /*
         * Problem 7:-
         * Declare four int variables: a, b, c, d.
         * Assign values and compute this expression:
         * result = a * b + c / d - (a + d) % b
         * Print the result and show each step using intermediate variables.
         */

        int a = 6;
        int b = 4;
        int c = 12;
        int d = 3;
        int result = (a * b + c / d - (a + d) % b);
        System.out.println(result);
    }
}
