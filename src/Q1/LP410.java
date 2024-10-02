package Q1;
import java.util.Scanner;

public class LP410 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Rectangular Prism:");
        System.out.print("Enter the length: ");
        int length = input.nextInt();
        System.out.print("Enter the width: ");
        int width = input.nextInt();
        System.out.print("Enter the height: ");
        int height = input.nextInt();

        int RPV = length * width * height;
        System.out.println("Rectangular Prism Volume: " + RPV);
        System.out.println("");

        System.out.println("Sphere:");
        System.out.print("Enter the radius: ");
        int radius = input.nextInt();

        double SV = (double) (Math.pow(radius, 3) * 3.14 * 4) / 3;
        System.out.println("Sphere Volume: " + SV);
        System.out.println("");

        System.out.println("Cube:");
        System.out.print("Enter the side length: ");
        int side = input.nextInt();

        double CV = Math.pow(side, 3);
        System.out.println("Cube Volume: " + CV);
    }
}
/*
Rectangular Prism:
Enter the length: 3
Enter the width: 4
Enter the height: 5
Rectangular Prism Volume: 60

Sphere:
Enter the radius: 3
Sphere Volume: 113.04

Cube:
Enter the side length: 4
Cube Volume: 64.0
 */
