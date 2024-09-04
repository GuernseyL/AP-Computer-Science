package Q1;
import java.util.*;

public class Prog52aInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter length:");
        int len = input.nextInt();

        System.out.print("Please enter width:");
        int wid = input.nextInt();

        int area = len * wid;
        int perim = len * 2 + wid * 2;
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perim);
    }
}
/*
Please enter length:143
Please enter width:82
Area = 11726
Perimeter = 450
 */