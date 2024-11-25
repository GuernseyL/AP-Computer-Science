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

        System.out.println("The total votes and percentage for Awbrey is " + Votes.getTOTAW() + " and " + Votes.getPERAW());
    }
}
