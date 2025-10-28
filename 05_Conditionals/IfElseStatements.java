import java.util.InputMismatchException;
import java.util.Scanner;

class IfElseStatement {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        try {
            byte age = SC.nextByte();
            // if (age > 18) {
            // System.out.println("You Can Vote");
            // } else {
            // System.out.println("You Can't Vote");
            // }
            if (age < 13) {
                System.out.println("Child");
            } else if (age >= 13 && age <= 17) {
                System.out.println("Teenager");
            } else if (age >= 18 && age <= 50) {
                System.out.println("Adult");
            } else {
                System.out.println("Old");
            }
        } catch (InputMismatchException e) {
            System.out.println("You haven't Entered a Valid Number");
        }
        SC.close();
    }
}