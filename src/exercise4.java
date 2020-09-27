import java.util.Scanner;
import java.text.DecimalFormat;


public class exercise4 {
    public static void main(String[] args) {
        final double inchtocenti = 2.54; // there are 2.54 centimeters in 1 in

        Scanner ni = new Scanner(System.in);

        DecimalFormat formatDecimal = new DecimalFormat("#.00");
        formatDecimal.setGroupingUsed(true);
        formatDecimal.setGroupingSize(3);

        System.out.print("Height : ");
        float h = (float) (ni.nextFloat() * inchtocenti);
        System.out.print("Width : ");
        float w = (float) (ni.nextFloat() * inchtocenti);

        float perimeter = (2 * h) + (2 * w);

        System.out.print("\n" + formatDecimal.format(perimeter) + " centimeters.");

    }
}