package Q1;
import java.util.*;

public class Prog93a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter kilowatts used: ");
        int kilowatts = input.nextInt();

        double Base = kilowatts * 0.0475;
        double Surcharge = Base * 0.10;
        double CityTax = Base * 0.03;
        double Total = Base + Surcharge + CityTax;

        System.out.println("Pay this amount: " + Total);

        double LateFee = Total * 1.03;

        System.out.println("After May 20th pay this amount: " + LateFee);
    }
}
/*
Please enter kilowatts used: 993
Pay this amount: 53.299275
After May 20th pay this amount: 54.89825325
 */
