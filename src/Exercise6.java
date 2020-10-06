import java.text.NumberFormat;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Wage      : ");
        double wage = in.nextDouble();
        System.out.print("Monday    : ");
        double mon = in.nextDouble();
        System.out.print("Tuesday   : ");
        double tues = in.nextDouble();
        System.out.print("Wednesday : ");
        double wed = in.nextDouble();
        System.out.print("Thursday  : ");
        double thur = in.nextDouble();
        System.out.print("Friday    : ");
        double fri = in.nextDouble();
        System.out.print("Saturday  : ");
        double sat = in.nextDouble();
        System.out.print("Sunday    : ");
        double sun = in.nextDouble();

        double payGross = (mon * wage) + (tues * wage) + (wed * wage) + (thur * wage) + (fri * wage) + (sat * wage) + (sun * wage);

        NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();
        defaultFormat.setMinimumFractionDigits(2);

        System.out.println(" ");
        System.out.println((defaultFormat.format(payGross)) + ".");

        in.close();
    }
}