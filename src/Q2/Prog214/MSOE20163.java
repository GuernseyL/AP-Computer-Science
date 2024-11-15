package Q2.Prog214;
import java.util.Scanner;

public class MSOE20163 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radii one of the spherical lens (R > 0): ");           double rone     = input.nextDouble();
        System.out.print("Enter radii two of the spherical lens (R < 0): ");           double rtwo     = input.nextDouble();
        System.out.print("Enter the refractive index the spherical lens (N >= 1): ");  double index    = input.nextDouble();
        System.out.print("Enter the diameter of the spherical lens (D > 0): ");        double dia      = input.nextDouble();
        System.out.print("The focal length of the lens is: " + 1/((index - 1)*(1/rone) - (1/rtwo) + (((index - 1)*dia)/(index*rone*rtwo))));
    }
}
