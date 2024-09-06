package Q1;
import java.util.*;

public class Prog58h {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount saved: ");
        double saved = input.nextDouble();

        System.out.print("Enter the interest rate: ");
        double rate = input.nextDouble();

        System.out.print("Enter the number of times compounded: ");
        double compounded = input.nextDouble();

        System.out.print("Enter the number of days at interest: ");
        double days = input.nextDouble();

        double rpd = ((rate * .01)/compounded) + 1;
        double power = (compounded * days)/365;
        double rpdpower = Math.pow(rpd, power);
        double total = rpdpower * saved;
        double interest = total - saved;

        System.out.println("The amount of interest earned = " + interest);
        System.out.println("The total amount currently in savings = " + total);


    }
}
/*
Enter the amount saved: 5000
Enter the interest rate: 11.5
Enter the number of times compounded: 365
Enter the number of days at interest: 900
The amount of interest earned = 1638.9571470100136
The total amount currently in savings = 6638.957147010014
 */
