package Q1;
import java.util.Scanner;

public class LP46 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int num1 = (int) (Math.random() * (10-1)) +1;
        int num2 = (int) (Math.random() * (10-1)) +1;
        int equ = (int) (Math.random() * (4-1)) +1;
        String strque = "";
        double total = 0.0;

        if (equ == 1) {
            strque = "*";
            total = num1 * num2;
        }

        else if (equ == 2) {
            strque = "+";
            total = num1 + num2;
        }

        else if (equ == 3) {
            strque = "-";
            total = num1 - num2;
        }

        else if (equ == 4) {
            strque = "/";
            total = (double) num1 / num2;
        }

        System.out.print("What is " + num1 + " " + strque + " " +num2 + "? ");
        double answer = input.nextDouble();

        if (answer == total) {
            System.out.print("Correct");
        }
        else {
            System.out.print("Incorrect");
        }
    }
}
/*
What is 7 * 6? 2
Incorrect

What is 4 - 7? -3
Correct
 */
