import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Salary  : ");
        double salary = in.nextDouble();
        System.out.print("401(k)  : ");
        double k401 = in.nextDouble();
        System.out.print("Federal : ");
        double feds = in.nextDouble();
        System.out.print("State   : ");
        double state = in.nextDouble();
        double taxPost = (salary * ((100 - k401) / 100));
        double homeTake = taxPost - (taxPost * (feds / 100)) - (taxPost * (state / 100));
        double paycheck = homeTake / 24;

        DecimalFormat commaFormat;
        commaFormat = new DecimalFormat("#,###.##");

        System.out.println(" ");
        System.out.println("$" + (commaFormat.format(paycheck)) + ".");

        in.close();
    }
}