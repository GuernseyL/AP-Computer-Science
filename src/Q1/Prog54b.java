package Q1;
import java.util.*;

public class Prog54b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter Num 1:");
        int num1 = input.nextInt();

        System.out.print("Please enter Num 2:");
        int num2 = input.nextInt();

        System.out.print("Please enter Num 3:");
        int num3 = input.nextInt();

        System.out.print("Please enter Num 4:");
        int num4 = input.nextInt();

        int Sum = num1 + num2 + num3 + num4;
        System.out.print("Sum = " + Sum);

    }
}
/*
Please enter Num 1:5
Please enter Num 2:10
Please enter Num 3:15
Please enter Num 4:20
Sum = 50
*/
