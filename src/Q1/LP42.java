package Q1;
import java.util.*;

public class LP42 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter package weight in kilograms: ");
        int weight = input.nextInt();

        System.out.print("Enter package length in centimeters: ");
        int length = input.nextInt();

        System.out.print("Enter package width in centimeters: ");
        int width = input.nextInt();

        System.out.print("Enter package height in centimeters: ");
        int height = input.nextInt();

        int volume = length * width * height;

        if (volume > 100000 && weight > 27) {
            System.out.print("Your package is too heavy and large");
        }
        else if (volume > 100000) {
            System.out.print("Your package is too large");
        }
        else if (weight > 27) {
            System.out.print("Your package is too heavy");
        }
        else {
            System.out.print("Your package meets the requirements");
        }

    }
}
/*
Enter package weight in kilograms: 32
Enter package length in centimeters: 10
Enter package width in centimeters: 25
Enter package height in centimeters: 38
Your package is too heavy
 */
