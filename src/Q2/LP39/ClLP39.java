package Q2.LP39;
import java.util.Scanner;

public class ClLP39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your birthyear: "); int BY = input.nextInt();
        System.out.print("Enter your birthmonth: "); int BM = input.nextInt();
        System.out.print("Enter your birthyday: "); int BD = input.nextInt();
        System.out.print("Enter the current year: "); int CY = input.nextInt();
        System.out.print("Enter the current month: "); int CM = input.nextInt();
        System.out.print("Enter the current day: "); int CD = input.nextInt();

        LP39Class Math = new LP39Class(BY, BM, BD, CY, CM, CD);
        Math.calc();

        System.out.println("You've been alive for " + Math.getAlive() + " days");
        System.out.println("You've been asleep for " + Math.getSleep() + " hours");


    }
}
