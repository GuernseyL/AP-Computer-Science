package Q2.LP314;
import Q2.LP310.LP310Class;

import java.util.Scanner;

public class ClLP314 {
    public static void main(String[] args) {
        int[] array = new int[6];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the votes in this order, New York, New Jersey, and Conneticut. Enter all of " +
                "of the votes for Awbrey then for Martinez.");
        for (int x = 0; x < array.length; x++) {
            array[x] = input.nextInt();
        }
        LP314Class Votes = new LP314Class(array[0], array[1], array[2], array[3], array[4], array[5]);
        Votes.calc();
        double PerAW = Votes.getPERAW();
        double PerMR = Votes.getPERMR();

        System.out.printf("\t\t\t\tVotes\t\tPercentage\nAwbrey:\t\t\t%d\t\t%.2f\nMartinez:\t\t%d\t\t%.2f\nTotal Votes:\t%d",
                Votes.getTOTAW(), Votes.getPERAW()*100, Votes.getTOTMR(), Votes.getPERMR()*100, Votes.getTOT());
    }
}
/*Enter the votes in this order, New York, New Jersey, and Conneticut. Enter all of of the votes for Awbrey then for Martinez.
314159
89008
213451
271860
121032
231034
				Votes		Percentage
Awbrey:			616618		49.71
Martinez:		623926		50.29
Total Votes:	1240544*/
