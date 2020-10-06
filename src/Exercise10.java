import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        decimalFormat.setGroupingUsed(true);
        decimalFormat.setGroupingSize(3);

        System.out.print("Fahrenheit : ");
        double fahrenheit = in.nextDouble();

        double kelvin = ((fahrenheit - 32) * (5/9f)) + 273.15;
        double celsius = kelvin - 273.15;

        System.out.println(" ");
        System.out.println("Celsius    : " + decimalFormat.format(celsius));
        System.out.print("Kelvin     : " + decimalFormat.format(kelvin));
        System.out.println(" ");
    }
}