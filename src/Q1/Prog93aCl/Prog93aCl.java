package Q1.Prog93aCl;
import java.util.Scanner;

public class Prog93aCl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter kilowats per hour: ");
        int kwh = input.nextInt();

        Cl93a thing = new Cl93a(kwh);
        thing.calc();
        String output = thing.toString();

        System.out.println(output);
    }
}
/*
Enter kilowats per hour: 993
KWH Used: 993
Base Rate: 47.167500000000004
Surchage: 4.71675
City Tax: 1.415025
Total: 53.299275
Late Total: 54.89825325
 */
