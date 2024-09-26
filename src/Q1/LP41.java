package Q1;
import java.util.*;

public class LP41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of copies to print: ");
        int copies = input.nextInt();
        double price = 0;

        if (copies >= 1000) {
            price = 0.25;
        }
        else if (copies >= 750) {
            price = 0.26;
        }
        else if (copies >= 500) {
            price = 0.27;
        }
        else if (copies >= 100) {
            price = 0.28;
        }
        else {
            price = 0.30;
        }

        double total = price * copies;
        System.out.println("Price per copy is: $" + price);
        System.out.print("Total cost is: $" + total);
    }
}
/*
Enter the number of copies to print: 1001
Price per copy is: $0.25
Total cost is: $250.25
 */
