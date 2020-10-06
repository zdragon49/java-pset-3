import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner ni = new Scanner(System.in);
        DecimalFormat formatDecimal = new DecimalFormat("0.00");

        formatDecimal.setGroupingUsed(true);
        formatDecimal.setGroupingSize(3);

        System.out.print("Fahrenheit : ");
        double f = ni.nextDouble();

        double k = ((f - 32) * (5/9f)) + 273.15;
        double c = k - 273.15;

        System.out.println("\nCelsius    : " + formatDecimal.format(c));
        System.out.print("Kelvin     : " + formatDecimal.format(k));

    }
}