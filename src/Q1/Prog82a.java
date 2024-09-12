package Q1;
import java.util.*;

public class Prog82a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the speed limit: ");
        int SPL = input.nextInt();

        System.out.print("Enter the vehicle speed: ");
        int VS = input.nextInt();

        if (VS < SPL) {
            System.out.print("Vehicle did not break speed limit");
            System.exit(0);
        }
        int OverLimit = VS - SPL;
        double Fine = 20.00 + (5.00 * OverLimit);

        System.out.println("The Fine is: $" + Fine);
    }
}
/*
Enter the speed limit: 30
Enter the vehicle speed: 42
The Fine is: $80.0
 */
