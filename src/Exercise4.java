import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Height : ");
        double inHeight = in.nextDouble();

        System.out.print("Width  : ");
        double inWidth = in.nextDouble();

        double cmHeight = inHeight * 2.54;
        double cmWidth = inWidth * 2.54;

        double perimeter = cmHeight + cmHeight + cmWidth + cmWidth;

        DecimalFormat commaFormat;
        commaFormat = new DecimalFormat("#,###.##");

        System.out.println(" ");
        System.out.println(commaFormat.format(perimeter) + " centimeters.");

        in.close();
    }
}