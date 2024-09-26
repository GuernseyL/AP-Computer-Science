package Q1;
import java.util.Scanner;

public class LP43 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of eggs purchased: ");
        int eggs = input.nextInt();
        double dozens = eggs/12.0;
        double price = 0;

        if (dozens > 11) {
            price = 0.35;
        }
        else if (dozens > 6) {
            price = 0.40;
        }
        else if (dozens > 4) {
            price = 0.45;
        }
        else {
            price = 0.50;
        }
        double totprice = dozens * price;

        System.out.print("The bill is equal to: $" + totprice);
    }
}
/*
Enter the number of eggs purchased: 18
The bill is equal to: $0.75
 */
