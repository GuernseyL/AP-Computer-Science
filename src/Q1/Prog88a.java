package Q1;
import java.util.*;

public class Prog88a {
    public static void main(String[] args) {

        int num1 = (int) (Math.random() * (13-1)) +1;
        int num2 = (int) (Math.random() * (20-2)) +2;
        //Scanner input = new Scanner(System.in);

        //System.out.print("Please enter number 1: ");
        //double num1 = input.nextDouble();

        //System.out.print("Please enter number 2: ");
        //double num2 = input.nextInt();

        int Sum = num1 + num2;
        int Difference = num1 - num2;
        int Product = num1 * num2;
        int Average = (num1 + num2) / 2;
        int Absolute = Math.abs(Difference);
        int max, min;
        if (num1 > num2) {
            max = num1;
        }
        else {
            max = num2;
        }
        if (num1 == max) {
            min = num2;
        }
        else {
            min = num1;
        }

        System.out.println("Your originally numbers are " + num1 + " and " + num2);
        System.out.println("Sum = " + Sum);
        System.out.println("Difference  = " + Difference);
        System.out.println("Product = " + Product);
        System.out.println("Average = " + Average);
        System.out.println("Absolute Differance = " + Absolute);
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);

    }
}
