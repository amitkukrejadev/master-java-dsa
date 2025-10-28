// package 06_Loops;

import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {
        // Write a program to print all numbers from 1 to 10.
        int num;

        for (num = 1; num <= 10; num++) {
            System.out.println(num);
        }

        // Write a program to calculate and print the sum of all even numbers from 0
        // to 100.

        int sum = 0;
        int i = 0;
        while (i <= 100) {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        }
        System.out.println(sum);
        /*
         * Write a program to print the multiplication table of a given number (e.g., 5)
         * up to 10 using a do-while loop.
         */
        int table = 5;
        int multiplier = 1;
        do {
            System.out.println(table + " x " + multiplier + " = " + (table * multiplier));
            multiplier++;
        } while (multiplier <= 10);
        
        Scanner SC = new Scanner(System.in);
        System.out.println("if you want to Exit simply press `0`");
        System.out.print("Enter a Number here: ");
        int number = SC.nextInt();
        while (number != 0) {
            System.out.println("You have Entered: " + number);
            System.out.print("Enter a Number Again: ");
            number = SC.nextInt();
        }
        SC.close();

        int arr[] = { 1, 2, 3 };
        System.out.println(arr.length);
    }

}

