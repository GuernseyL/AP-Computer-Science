package Q1.Prog88aCl;
import java.util.Scanner;

public class Prog88aCl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter num1: ");
        int num1 = input.nextInt();
        System.out.print("Enter num2: ");
        int num2 = input.nextInt();

        Cl88a wow = new Cl88a(num1, num2);
        wow.calc();
        int Sum = wow.getSum();
        int Diff = wow.getDiff();
        int Prod = wow.getProd();
        double Ave = wow.getAve();
        int Abs = wow.getAbs();
        int Min = wow.getMin();
        int Max = wow.getMax();

        System.out.println("The sum of the two numbers is: " + Sum);
        System.out.println("The differance of the two numbers is: " + Diff);
        System.out.println("The product of the two numbers is: " + Prod);
        System.out.println("The average of the two numbers is: " + Ave);
        System.out.println("The absolute differance of the two numbers is: " + Abs);
        System.out.println("The minimum of the two numbers is: " + Min);
        System.out.println("The maximum of the two numbers is: " + Max);
    }
}
/*
Enter num1: 2
Enter num2: 5
The sum of the two numbers is: 7
The differance of the two numbers is: -3
The product of the two numbers is: 10
The average of the two numbers is: 3.5
The absolute differance of the two numbers is: 3
The minimum of the two numbers is: 2
The maximum of the two numbers is: 5
 */

