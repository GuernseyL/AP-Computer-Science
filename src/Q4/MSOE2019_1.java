package Q4;
import java.util.Scanner;

public class MSOE2019_1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input the first letter: ");
        String letA = input.nextLine().toLowerCase();
        System.out.print("Input the second letter: ");
        String letB = input.nextLine().toLowerCase();
        String Words = "0";
        int count = 0;
        while (!Words .equals("-1")) {
            System.out.print("Enter a string (enter -1 to stop): ");
            Words = input.nextLine().toLowerCase();
            for (int x = 0; x < Words.length()-1; x++) {
                if (Words.substring(x, x+2).equals(letA+letB)) {
                    count++;
                }
                else if (Words.substring(x, x+2).equals(letB+letA)){
                    count++;
                }
            }
            System.out.println("The amount of two letter pairs containing '" + letA + "' and '" + letB + "' in '" +
                    Words + "' is " + count);
            count = 0;
        }
    }
}
