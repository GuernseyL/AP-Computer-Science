package Q3.Prog702p;

import Q3.Prog702q.Bus;
import Q3.Prog702q.Car;
import Q3.Prog702q.Truck;
import Q3.Prog702q.Vehicle;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prog702p {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog701g.dat"));
            List<BIG> list = new ArrayList<BIG>();

            int num = file.nextInt();
            while (num != 99) {
                if (num == 1) {
                    String MN = file.next();
                    String MW = file.next();
                    double MM = file.nextDouble();
                    BIG A = new Hiccas(MN, MW, MM);
                    list.add(A);
                    num = file.nextInt();
                }
                if (num == 2) {
                    String MN = file.next();
                    String MW = file.next();
                    int S = file.nextInt();
                    BIG A = new Wallies(MN, MW, S);
                    list.add(A);
                    num = file.nextInt();
                }
                if (num == 3) {
                    String MN = file.next();
                    String MW = file.next();
                    String MS = file.next();
                    BIG A = new Beepers(MN, MW, MS);
                    list.add(A);
                    num = file.nextInt();
                }
            }

            int TotalAnimals = 0;
            int TotalHiccas = 0;
            int TotalWallies = 0;
            int TotalBeepers = 0;
            int TotalWorth = 0;
            double AverageWorth = 0.0;
            int TotalSteps = 0;
            double AverageSteps = 0.0;
            int TotalSize = 0;
            double AverageSize = 0.0;
            String CommonLetter = "";

            for (BIG A : list) {
                if (A instanceof Hiccas){
                    TotalAnimals++;
                    TotalHiccas++;
                    TotalWorth += ((Hiccas) A).getMoney();
                }
                if (A instanceof Wallies) {
                    TotalAnimals++;
                    TotalWallies++;
                    TotalSteps += ((Wallies) A).getSteps();
                }
                if (A instanceof Beepers) {
                    TotalAnimals++;
                    TotalBeepers++;
                    TotalSize += ((Beepers) A).getSpecial();
                }
            }

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
