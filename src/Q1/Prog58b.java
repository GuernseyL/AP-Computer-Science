package Q1;
import java.util.*;

public class Prog58b {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter num A: ");
        double NumA = input.nextDouble();

        System.out.print("Please enter num B: ");
        double NumB = input.nextDouble();

        System.out.print("Please enter num C: ");
        double NumC = input.nextDouble();

        double RootForm = (Math.sqrt(Math.pow(NumB, 2) - (-4 * (NumA * NumC))))/(2 * NumA);
        double rootA = (-1 * NumB) + RootForm;
        double rootB = (-1 * NumB) - RootForm;

        System.out.println("Your roots are " + rootA + " and " + rootB);
    }
}

/*
Please enter num A: 1
Please enter num B: 5
Please enter num C: 6
Your roots are -1.5 and -8.5
 */