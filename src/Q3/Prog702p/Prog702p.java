package Q3.Prog702p;

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

            ArrayList<String> GigaString = new ArrayList<String>();

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
                    TotalSize += ((Beepers) A).getSpecial().length();
                    for (int x = 0; x < ((Beepers) A).getSpecial().length(); x++ ){
                        GigaString.add(((Beepers) A).getSpecial().substring(x, x+1));
                    }
                }
            }

            String CC = "";
            int CCI = 0;
            String CCT = "";
            int CCTI = 0;

            for (int y = 0; y < GigaString.size(); y++ ){
                for (int z = 0; z < GigaString.size() ; z++) {
                    CCT = GigaString.get(y);
                    CCTI ++;
                    if (y != z && GigaString.get(z).equals(GigaString.get(y))) {
                        CCTI ++;
                    }
                }
                if (CCTI > CCI) {
                    CC = CCT;
                    CCTI = 0;
                    CCI = CCTI;
                }
                else if (CCTI == CCI) {
                    CC += (" " + CCT);
                    CCTI = 0;
                    CCI = CCTI;
                }
            }

            AverageWorth = (double) TotalWorth/TotalHiccas;
            AverageSteps = (double) TotalSteps/TotalWallies;
            AverageSize = (double) TotalSize/TotalBeepers;

            System.out.println("Total number of animals: " + TotalAnimals);
            System.out.println("Total number of Hiccas: " + TotalHiccas);
            System.out.println("Total number of Wallies: " + TotalWallies);
            System.out.println("Total number of Beepers: " + TotalBeepers);
            System.out.println("Average worth of Hiccas' fur: " + AverageWorth);
            System.out.println("Average number of steps: " + AverageSteps);
            System.out.println("Average length of Beepers' special word: " + AverageSize);
            System.out.println("The most common letter(s) in Beeper's special words: " + CC);


        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}

/*
Total number of animals: 15
Total number of Hiccas: 6
Total number of Wallies: 5
Total number of Beepers: 4
Average worth of Hiccas' fur: 2.6666666666666665
Average number of steps: 63.2
Average length of Beepers' special word: 7.25
The most common letter(s) in Beeper's special words: e
 */
