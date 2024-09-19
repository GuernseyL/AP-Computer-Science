package Q1;
import java.util.*;

public class Prog166f {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the last positive integer: ");
        int INT = input.nextInt();
        int placeholder = 0;
        int IntPlusOne;
        int output;
        int HalfInt;
        int X = 0;

        double tester = INT % 2.0;
        if (tester == 1) {
            placeholder = INT;
            INT --;
            X = 1;
        }
        IntPlusOne = INT + 1;
        HalfInt = INT/2;
        output = IntPlusOne * HalfInt + placeholder;

        if (X == 1) {
            INT ++;
        }

        System.out.print("The sum of the numbers from 1 to " + INT + " is " + output);
    }
}
