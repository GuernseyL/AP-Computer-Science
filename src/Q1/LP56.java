package Q1;
import java.util.Scanner;

public class LP56 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a 3 digit number: ");
        int num = input.nextInt();

        int digone = 0;
        int digtwo = 0;
        int digthree = 0;
        int digsum;

        while (num >= 100) {
            num -= 100;
            digone++;
        }
        while (num >= 10) {
            num -= 10;
            digtwo++;
        }
        while (num >= 1){
            num--;
            digthree++;
        }
        digsum = digone + digtwo + digthree;

        System.out.println("The sum of all the digits is: " + digsum);
    }
}

/*
Enter a 3 digit number: 528
The sum of all the digits is: 15
 */
