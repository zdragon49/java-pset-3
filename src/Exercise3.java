import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercise3 {
    public static void main(String[] args) {
        final double inchtomili = 25.4;  // there are 25.4 mili in 1 inch

        Scanner ni = new Scanner(System.in);

        DecimalFormat formatDecimal = new DecimalFormat("#.00");
        formatDecimal.setGroupingUsed(true);
        formatDecimal.setGroupingSize(3);

        System.out.print("Height : ");
        float h = (float) (ni.nextFloat() * inchtomili);
        System.out.print("Width : ");
        float w = (float) (ni.nextFloat() * inchtomili);

        float area = h * w;

        System.out.print("\n" + formatDecimal.format(area) + " square millimeters.");
    }
}