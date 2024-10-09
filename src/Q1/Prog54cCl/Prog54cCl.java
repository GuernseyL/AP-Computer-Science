package Q1.Prog54cCl;
import java.util.Scanner;

public class Prog54cCl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double rad = input.nextDouble();

        Cl54c wow = new Cl54c(rad);
        wow.calc();
        double area = wow.getArea();
        double circum = wow.getCircum();

        System.out.println("The circumfrence of the circle is: " + circum);
        System.out.println("The area of the circle is: " + area);
    }
}
/*
Enter radius: 3
The circumfrence of the circle is: 18.84
The area of the circle is: 28.26
 */
