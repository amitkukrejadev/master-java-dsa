package Input;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        int x = SC.nextInt();
        // System.out.println("You have Entered " + x);
        int y = SC.nextInt();
        // System.out.println("You have Entered " + y);

        String name = SC.nextLine();

        System.out.println("");
        System.out.println("Sum of X + Y = " + (x + y) + name);
        SC.close();
    }
}
