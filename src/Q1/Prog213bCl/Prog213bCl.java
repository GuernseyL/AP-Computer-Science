package Q1.Prog213bCl;
import Q1.Prog213bCl.Cl213b;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog213bCl {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog213b.txt"));

            while (file.hasNext()) {
                int qnt = file.nextInt();
                Cl213b wowza = new Cl213b(qnt);
                wowza.calc();
                System.out.println(wowza);

            }

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
