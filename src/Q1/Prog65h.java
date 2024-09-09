package Q1;
import java.util.*;

public class Prog65h {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of pounds: ");
        double pounds = input.nextDouble();

        System.out.print("Enter number of shillings: " );
        double shillings = input.nextDouble();

        System.out.print("Enter number of pence: ");
        double pence = input.nextDouble();

        shillings += pence/12;
        pounds += shillings/20;

        System.out.println("Your decimal pounds is: " + pounds);
    }
}
/*
Enter number of pounds: 7
Enter number of shillings: 17
Enter number of pence: 9
Your decimal pounds is: 7.8875
 */
