package Q1.Prog209aCl;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog209aCl {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog215a.dat"));

            while (file.hasNext()) {
                int Num = file.nextInt();
                Cl209a numbers = new Cl209a(Num);
                numbers.setComm();
                numbers.toString();


            }

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
