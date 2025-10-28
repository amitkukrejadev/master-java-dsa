import java.util.Scanner;

public class Loop2 {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.print("If you want exit Press 0: ");

        int num = SC.nextInt();
        while (num != 0) {
            System.out.print("You have Entered Number: " + num);
            System.out.print("Please Try Again: ");
            num = SC.nextInt();
        }
        System.out.println("Finished!");
        SC.close();
    }
}
