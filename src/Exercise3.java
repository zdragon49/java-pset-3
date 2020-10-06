import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Height : ");
        double h = in.nextDouble();

        System.out.print("Width : ");
        double w = in.nextDouble();

        double inchArea = w * h;
        double mmArea = inchArea * (25.4 * 25.4);

        DecimalFormat commaFormat;
        commaFormat = new DecimalFormat("#,###.##");

        System.out.println(" ");
        System.out.println(commaFormat.format(mmArea) + " square millimeters.");

        in.close();
    }
}