package Q1;
import java.util.*;

public class Prog76a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 1 and 9: ");
        int Num = input.nextInt();

        int Data = Num * 9;
        int Total = Data * 12345679;

        System.out.print("Number Manipulation Total is: " + Total);
    }
}
/*
Enter a number between 1 and 9: 5
Number Manipulation Total is: 555555555
 */
