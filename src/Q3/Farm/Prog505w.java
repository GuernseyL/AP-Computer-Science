package Q3.Farm;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Prog505w {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog505w.dat"));
            List<Animal> animals = new ArrayList<>();

            int hay = file.nextInt();
            double hayCost = file.nextDouble();
            int corn = file.nextInt();
            double cornCost = file.nextDouble();

            int cowRows = file.nextInt();
            int cowPens = file.nextInt();
            for (int r = 0; r < cowRows; r++) {
                for (int p = 0; p < cowPens; p++) {
                    String name = file.next();
                    int weight = file.nextInt();
                    int milk = file.nextInt();
                    int hayEaten = file.nextInt();
                    int cornEaten = file.nextInt();
                    Cow wow = new Cow(name, weight, milk, cornEaten, hayEaten);
                    animals.add(wow);
                    hay -= hayEaten;
                    corn -= cornEaten;
                }
            }

            int horseRows = file.nextInt();
            int horsePens = file.nextInt();
            for (int r = 0; r < horseRows; r++) {
                for (int p = 0; p < horsePens; p++) {
                    String name = file.next();
                    int weight = file.nextInt();
                    int hayEaten = file.nextInt();
                    int cornEaten = file.nextInt();
                    int rides = file.nextInt();
                    double rideCost = file.nextDouble();
                    Horse fred = new Horse(name, weight, cornEaten, hayEaten, rides, rideCost);
                    animals.add(fred);
                    hay -= hayEaten;
                    corn -= cornEaten;
                }
            }
            double moneys = 0.0;
            double feed = 0.0;
            for (int lcv = 0; lcv < animals.size(); lcv++) {
                if (animals.get(lcv) instanceof Cow) {
                    Cow cow = (Cow) animals.get(lcv);
                    moneys += cow.value(cornCost, hayCost);
                }
                if (animals.get(lcv) instanceof Horse) {
                    Horse horse = (Horse) animals.get(lcv);
                    moneys = horse.value(cornCost, hayCost);
                }
            }

            for (Animal M : animals) {
                feed += M.getFeedCost(cornCost, hayCost);
            }

            int totalweight = 0;
            int maxCowIndex = 0;
            double maxCowValue = Double.MIN_VALUE;
            for (int lcv = 0; lcv < animals.size(); lcv++) {
                if (animals.get(lcv) instanceof Cow) {
                    Cow cow = (Cow) animals.get(lcv);
                    double cowValue = cow.value(cornCost, hayCost);
                    totalweight += cow.getWeight();
                    if (cowValue > maxCowValue) {
                        maxCowIndex = lcv;
                        maxCowValue = cowValue;
                    }
                }
            }

            int minHorseIndex = 0;
            double minHorseValue = Double.MAX_VALUE;
            for (int lcv = 0; lcv < animals.size(); lcv++) {
                if (animals.get(lcv) instanceof Horse) {
                    Horse horse = (Horse) animals.get(lcv);
                    double horseValue = horse.value(cornCost, hayCost);
                    totalweight += horse.getWeight();
                    if (horseValue < minHorseValue) {
                        minHorseIndex = lcv;
                        minHorseValue = horseValue;
                    }
                }
            }

            System.out.println("The income of day is: " + moneys);

            System.out.println("Culmative weight of all the animals is: " + totalweight);

            if (moneys >= 0) { System.out.println("There is enough money to feed all animals"); }

            System.out.printf("Cow %s makes the most money\n",
                    animals.get(maxCowIndex).getName());

            System.out.printf("Horse %s makes the least money\n",
                            animals.get(minHorseIndex).getName());

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}