package Q2.LP39;
import java.util.Scanner;

public class ClLP39 {
    public static void main(String[] args) {
        int[] array = new int[6];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your birthyear, birthmonth, birthday, current year, " +
                "current month, and current day in this order: ");
        for (int lcv = 0; lcv < array.length; lcv++)
            array[lcv] = input.nextInt();

        LP39Class Math = new LP39Class(array[0], array[1], array[2], array[3], array[4],array[5]);
        Math.calc();

        System.out.println("You've been alive for " + Math.getAlive() + " days");
        System.out.println("You've been asleep for " + Math.getSleep() + " hours");


    }
}
/*Enter your birthyear, birthmonth, birthday, current year, current month, and current day in this order: 2007
9
27
2024
11
21
You've been alive for 6247.25 days
You've been asleep for 49978.0 hours
*/