import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercise5 {
    public static void main(String[] args) {

        Scanner ni = new Scanner(System.in);
        DecimalFormat formatDecimal = new DecimalFormat("#.00");

        final double hwweight = 0.15;
        final double quizweight = 0.35;
        final double testweight = 0.5;

        System.out.print("Homework 1 : ");
        double hw1 = ni.nextDouble();
        System.out.print("Homework 2 : ");
        double hw2 = ni.nextDouble();
        System.out.print("Homework 3 : ");
        double hw3 = ni.nextDouble();
        System.out.print("Quiz 1     : ");
        double quiz1 = ni.nextDouble();
        System.out.print("Quiz 2     : ");
        double quiz2 = ni.nextDouble();
        System.out.print("Test 1     : ");
        double test1 = ni.nextDouble();

        double hwgrade = ((hw1 + hw2 + hw3) / 3) * hwweight;
        double quizgrade = ((quiz1 + quiz2) / 2) * quizweight;
        double testgrade = test1 * testweight;

        double final_grade = hwgrade + quizgrade + testgrade;

        System.out.print("\n" + formatDecimal.format(final_grade) + "%.");
    }
}