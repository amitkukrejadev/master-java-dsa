package ScratchPad;

import java.util.Scanner;

public class ScratchInput {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter a Number here: ");
        int b = SC.nextInt();
        while (b != 0) {
            System.out.println("You have entered number " + b + " Press 0 to Stop");
            System.out.print("Enter a Number here Again: ");
            b = SC.nextInt();
        }
        SC.close();
    }
}
