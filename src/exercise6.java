import java.util.Scanner;
import java.text.DecimalFormat;

public class exercise6 {
    public static void main(String[] args) {
        Scanner ni = new Scanner(System.in);
        DecimalFormat formatDecimal = new DecimalFormat("#.00");

        formatDecimal.setGroupingUsed(true);
        formatDecimal.setGroupingSize(3);

        System.out.print("Wage      : ");
        double hrwage = ni.nextDouble();
        System.out.print("Monday    : ");
        double monhrs = ni.nextDouble();
        System.out.print("Tuesday   : ");
        double tuehrs = ni.nextDouble();
        System.out.print("Wednesday : ");
        double wedhrs = ni.nextDouble();
        System.out.print("Thursday  : ");
        double thurhrs = ni.nextDouble();
        System.out.print("Friday    : ");
        double frihrs = ni.nextDouble();
        System.out.print("Saturday  : ");
        double sathrs = ni.nextDouble();
        System.out.print("Sunday    : ");
        double sunhrs = ni.nextDouble();

        double allhrs = monhrs + tuehrs + wedhrs
                + thurhrs + frihrs + sathrs + sunhrs;

        double salaryweek = allhrs * hrwage;
        System.out.print("\n$" + formatDecimal.format(salaryweek) + ".");
    }
}