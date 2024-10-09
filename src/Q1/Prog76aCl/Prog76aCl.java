package Q1.Prog76aCl;
import java.util.Scanner;

public class Prog76aCl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number you dislike: ");
        int dis = input.nextInt();

        Cl76a wow = new Cl76a(dis);
        wow.calc();
        int surprise = wow.getSurprise();

        System.out.println("Surprise! " + surprise);
    }
}
/*
Enter a number you dislike: 5
Surprise! 555555555
 */
