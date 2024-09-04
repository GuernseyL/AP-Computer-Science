package Q1;
import java.util.*;

public class Prog54c {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter radius:");
        double Rad = input.nextDouble();

        double Circum = 2 * Rad * 3.14;
        double Area = Rad * Rad * 3.14;

        System.out.println("Radius = " + Rad);
        System.out.println("Circumfrence = " + Circum);
        System.out.println("Area = " + Area);
    }
}
/*
Please enter radius:9
Radius = 9.0
Circumfrence = 56.52
Area = 254.34
 */
