package Q1;
import java.util.Scanner;

public class LP55 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a 3 digit number: ");
        int num = input.nextInt();

        int digone = 0;
        int digtwo = 0;
        int digthree = 0;

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
        System.out.println(digone);
        System.out.println(digtwo);
        System.out.println(digthree);
    }
}

/*
Enter a 3 digit number: 528
5
2
8
 */
