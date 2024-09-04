package Q1;
import java.util.*;

public class Prog88a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter number 1: ");
        double num1 = input.nextDouble();

        System.out.print("Please enter number 2: ");
        double num2 = input.nextInt();

        double Sum = num1 + num2;
        double Difference = num1 - num2;
        double Product = num1 * num2;
        double Average = (num1 + num2) / 2;
        double Absolute = Math.abs(num1 - num2);
        double Greater = 0.0;
        double Lesser = 0.0;
        if (num1 > num2) {
            Greater = num1;
            Lesser = num2;
        }
        else {
            Greater = num2;
            Lesser = num1;
        }

        System.out.println("Sum = " + Sum);
        System.out.println("Difference  = " + Difference);
        System.out.println("Product = " + Product);
        System.out.println("Average = " + Average);
        System.out.println("Absolute Differance = " + Absolute);
        System.out.println("Max = " + Greater);
        System.out.println("Min = " + Lesser);

    }
}
