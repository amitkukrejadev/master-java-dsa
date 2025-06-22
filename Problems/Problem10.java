package Problems;

public class Problem10 {
    public static void main(String[] args) {
        /*
         * Problem 10:-
         * Create a program that:
         * • Stores the maximum and minimum values of int, byte, float, and double
         * using wrapper class constants (e.g., Integer.MAX_VALUE)
         * • Print each value with a proper label and formatting
         */
        int vr1 = Integer.MIN_VALUE;
        int vr2 = Integer.MAX_VALUE;
        System.out.println("Int Min " + vr1);
        System.out.println("Int Max " + vr2);
        byte vr3 = Byte.MAX_VALUE;
        byte vr4 = Byte.MIN_VALUE;
        System.out.println("Byte Min " + vr3);
        System.out.println("Byte Max " + vr4);
        float vr5 = Float.MAX_VALUE;
        float vr6 = Float.MIN_VALUE;
        System.out.println("Float Min " + vr5);
        System.out.println("Float Max " + vr6);
        double vr7 = Double.MAX_VALUE;
        double vr8 = Double.MIN_VALUE;
        System.out.println("Double Min " + vr7);
        System.out.println("Double Max " + vr8);
    }

}
