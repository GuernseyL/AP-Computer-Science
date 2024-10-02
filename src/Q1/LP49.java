package Q1;
import java.util.Scanner;

public class LP49 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int rndnum = (int) (Math.random() * (20-1)) +1;

        System.out.print("Enter a number between 1 and 20: ");
        int gsnum = input.nextInt();

        System.out.println("Computer's number: " + rndnum);
        System.out.println("Player's number: " + gsnum);

        if (rndnum == gsnum) {
            System.out.println("You Won!");
        }
        else {
            System.out.println("Better luck next time");
        }
    }
}

/*
Enter a number between 1 and 20: 20
Computer's number: 8
Player's number: 20
Better luck next time
 */
