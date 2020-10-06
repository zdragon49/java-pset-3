import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Students : ");
        double students = in.nextDouble();
        System.out.print("Teachers : ");
        double teachers = in.nextDouble();
        System.out.print("Capacity : ");
        double cap = in.nextDouble();
        double passengers = students + teachers;
        double extra = passengers % cap;
        double buses = ((passengers - extra) / cap) + 1;
        String string1 = String.format("%.0f", buses);
        String string2 = String.format("%.0f", extra);

        System.out.println(" ");
        System.out.println("Buses required      : " + string1);
        System.out.println("Overflow passengers : " + string2);

        in.close();
    }
}