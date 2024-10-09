package Q1.Prog82aCl;
import java.util.Scanner;

public class Prog82aCl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the speed limit: ");
        int limit = input.nextInt();
        System.out.print("Enter your speed: ");
        int speed = input.nextInt();

        Cl82a wow = new Cl82a(limit, speed);
        wow.calc();
        int fine = wow.getFine();

        if (speed < limit){
            System.out.println("you did not go over the speed limit");
        }

        else { System.out.println("Your fine: " + fine); }
    }
}
/*
Enter the speed limit: 30
Enter your speed: 42
Your fine: 80
 */
