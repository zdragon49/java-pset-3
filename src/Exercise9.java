import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Amount : ");
        double amount = in.nextDouble();

        int quarter = 25;
        int dime = 10;
        int nickel = 5;

        double change = amount * 100;
        double change1 = change % quarter;
        double quarters = (change - change1) / quarter;
        double change2 = change1 % dime;
        double dimes = (change1 - change2) / dime;
        double change3 = change2 % nickel;
        double nickels = (change2 - change3) / nickel;
        double penn = change3;

        String var1 = String.format("%.0f", quarters);
        String var2 = String.format("%.0f", dimes);
        String var3 = String.format("%.0f", nickels);
        String var4 = String.format("%.0f", penn);

        System.out.println(" ");
        System.out.println("Quarters : " + var1);
        System.out.println("Dimes    : " + var2);
        System.out.println("Nickels  : " + var3);
        System.out.println("Pennies  : " + var4);

        in.close();
    }
}