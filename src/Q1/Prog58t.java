package Q1;
import java.util.*;

public class Prog58t {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter purchase price: ");
        double purchase = input.nextDouble();

        System.out.print("Enter amount received: ");
        double received = input.nextDouble();

        double change = received - purchase;
        System.out.println("Change due: " + change);
        int dollars = 0;
        int quarters = 0;
        int dimes = 0;
        int nickels = 0;
        int pennies = 0;

        while (change > 1){
            change --;
            dollars ++;
        }
        while (change > .25){
            change -= .25;
            quarters ++;
        }
        while (change > .10){
            change -= .10;
            dimes ++;
        }
        while (change > .05){
            change -= .05;
            nickels ++;
        }
        while (change > .01){
            change -= .01;
            pennies ++;
        }
        System.out.println("dollars: " + dollars);
        System.out.println("quarters: " + quarters);
        System.out.println("dimes: " + dimes);
        System.out.println("nickels: " + nickels);
        System.out.println("pennies: " + pennies);
    }
}
/*
Enter purchase price: 125.32
Enter amount received: 140.00
Change due: 14.680000000000007
dollars: 14
quarters: 2
dimes: 1
nickels: 1
pennies: 3
 */
