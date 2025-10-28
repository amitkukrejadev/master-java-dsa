import java.util.Scanner;

class SwitchStatements {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int num = SC.nextInt();
        switch (num) {
            case 1:
                System.out.println("You have Enter Number as Day " + num);
                System.out.println("Its Monday");
                break;
            case 2:
                System.out.println("You have Enter Number as Day " + num);
                System.out.println("Its Tuesday");
                break;
            case 3:
                System.out.println("You have Enter Number as Day " + num);
                System.out.println("Its Wednesday");
                break;
            case 4:
                System.out.println("You have Enter Number as Day " + num);
                System.out.println("Its Thursday");
                break;
            case 5:
                System.out.println("You have Enter Number as Day " + num);
                System.out.println("Its Friday");
                break;
            case 6:
                System.out.println("You have Enter Number as Day " + num);
                System.out.println("Its Saturday");
                break;
            case 7:
                System.out.println("You have Enter Number as Day " + num);
                System.out.println("Its Sunday");
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
        SC.close();
    }
}