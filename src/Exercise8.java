import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner ni = new Scanner(System.in);
        DecimalFormat formatDecimal = new DecimalFormat("#.00");

        System.out.print("Students : ");
        int studnum = ni.nextInt();
        System.out.print("Teachers : ");
        int teachernum = ni.nextInt();
        System.out.print("Capacity : ");
        int totalcapacity = ni.nextInt();

        int passangerstotalnum = studnum + teachernum;
        int busesnum = passangerstotalnum / totalcapacity;
        int extra = passangerstotalnum % totalcapacity;
        System.out.println("\n" + "Buses required      : " + formatDecimal.format(busesnum + 1));
        System.out.print("Overflow passengers : " + extra);
    }
}