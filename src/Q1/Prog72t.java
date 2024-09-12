package Q1;
import java.util.*;

public class Prog72t {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first time: ");
        int TimeA = input.nextInt();

        System.out.print("Enter the second time: ");
        int TimeB = input.nextInt();

        int TimeTotal;
        int Hours = 0;
        if (TimeA > TimeB) {
            TimeTotal = TimeA - TimeB;
        } else {
            TimeTotal = TimeB - TimeA;
        }
        while (TimeTotal > 60) {
            Hours ++;
            TimeTotal -= 100;
        }
        int Minutes = TimeTotal;

        System.out.println(Hours + " Hours " + Minutes + " Minutes ");
    }
}
/*
Enter the first time: 1730
Enter the second time: 900
8 Hours 30 Minutes
 */
