package Q1.Prog52aCl;
import java.util.Scanner;

public class Prog52aCl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter length: ");
        int l = input.nextInt();
        System.out.print("enter width: ");
        int w = input.nextInt();

        Cl52a wow = new Cl52a(l, w);
        wow.calc();
        int area = wow.getArea();
        int perim = wow.getPerim();

        System.out.println("Area: " + area);
        System.out.println("Perim: " + perim);
    }
}