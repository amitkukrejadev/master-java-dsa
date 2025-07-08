package Problems;

class Problem6 {
    public static void main(String[] args) {
        /*
         * Problem 6:-
         * Create a program that:
         * • Takes a double value of 99.99
         * • Casts it to an int
         * • Then stores it in a long and adds 10000
         * • Prints all 3 values with labels
         * Add comments to explain the behavior during casting and conversion.
         */

        double percent = 99.99;

        int newNum = (int) percent;

        long finalValue = newNum;
        finalValue += 10000;

        System.out.println("Original double value: " + percent);
        System.out.println("After casting to int: " + newNum);
        System.out.println("After storing in long and adding 10000: " + finalValue);

    }
}