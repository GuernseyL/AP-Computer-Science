package Q1;
import java.util.*;

public class Prog54a {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the car model: ");
        String model = keyboard.nextLine();

        System.out.print("Enter miles driven: ");
        int miles =  keyboard.nextInt();

        System.out.print("Enter gallons: ");
        int gallons = keyboard.nextInt();

        double mpg = miles / (double)gallons;
        System.out.println("MPG used by " + model + " is " + mpg + "m/g");

    }
}

/*
Enter the car model: bug
Enter miles driven: 286
Enter gallons: 9
MPG used by bug is 31.77777777777778m/g
 */