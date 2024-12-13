package Q2.Prog215i;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class Prog215i {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog215i.dat"));
            ArrayList<Cl215i> list = new ArrayList<>();
            int Number = 1;
            double Miles;
            double Gallons;
            double MPG;

            while (Number != 0) {
                Number = file.nextInt();
                Miles = file.nextDouble();
                Gallons = file.nextDouble();
                Cl215i Gas = new Cl215i(Number, Miles, Gallons);
                list.add(Gas);

            }

            for (int lcv = 0; lcv < list.size(); lcv++) {
                MPG = MPG.calc(list.get(lcv));
            }

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
