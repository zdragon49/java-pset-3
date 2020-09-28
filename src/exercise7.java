import java.text.DecimalFormat;
import java.util.Scanner;

public class exercise7 {
    public static void main(String[] args) {
        Scanner ni = new Scanner(System.in);
        DecimalFormat formatDecimal = new DecimalFormat("#.00");

        formatDecimal.setGroupingUsed(true);
        formatDecimal.setGroupingSize(3);

        System.out.print("Salary  : ");
        double salary = ni.nextDouble();
        System.out.print("401(k)  : ");
        double k401tax = ni.nextDouble() / 100;
        System.out.print("Federal : ");
        double feds = ni.nextDouble() / 100;
        System.out.print("State   : ");
        double state = ni.nextDouble() / 100;
        double salaryfinal = salary - (salary * k401tax);
        salaryfinal = salaryfinal - (salaryfinal * (feds + state));

        double salarybiweek = salaryfinal / 24;

        System.out.print("\n$" + formatDecimal.format(salarybiweek) + ".");

    }
}