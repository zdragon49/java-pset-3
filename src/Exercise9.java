import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner ni = new Scanner(System.in);

        System.out.print("Amount : ");
        double amoun = ni.nextDouble();

        amoun = amoun * 100;

        int quat = (int) amoun / 25;
        int left = (int) (amoun % 25);
        int dime = left / 10;
        left = left % 10;
        int nick = left / 5;
        left = left % 5;
        int penn = left;

        System.out.println("\nQuarters : " + quat);
        System.out.println("Dimes    : " + dime);
        System.out.println("Nickels  : " + nick);
        System.out.print("Pennies  : " + penn);

    }
}