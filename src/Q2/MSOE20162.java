package Q2;
import java.util.Scanner;

public class MSOE20162 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length of side a: ");       double sidea = input.nextDouble();
        System.out.print("Enter length of side c: ");       double sidec = input.nextDouble();
        System.out.print("Enter the degree of angle a: ");  double degreeA = input.nextDouble();
        double degreeC = Math.asin((Math.sin(degreeA)/sidea) * sidec);
        System.out.print("Degree of angle C is: " + degreeC);
    }
}
