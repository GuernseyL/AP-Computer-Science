package Q3.Prog702q;

import Q3.Prog701g.Person;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prog702q {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog702q.txt"));
            List<Vehicle> list = new ArrayList<Vehicle>();

            while (file.hasNext()) {
            int Typing = file.nextInt();

            if (Typing == 1) {
                String N = file.next();
                int T = file.nextInt();
                double W = file.nextDouble();
                Vehicle V = new Car(N, T, W);
                list.add(V);
            }
            if (Typing == 2) {
                String N = file.next();
                int T = file.nextInt();
                int M = file.nextInt();
                double W = 50000 - (.25 * M);
                Vehicle V = new Truck(N, T, W, M);
                list.add(V);
            }
            if (Typing == 3) {
                String N = file.next();
                int T = file.nextInt();
                String H = file.next();
                double W = 50000;
                Vehicle V = new Bus(N, T, W, H);
                list.add(V);
            }
            }

            int TotalVehicle = 0; //done
            double TotalWorth = 0; //done
            double TotalWorthCar = 0; //done
            String Long = ""; //done
            String PeasantName = ""; //done
            double Peasant = 999999999;
            int TotalTireCar = 0;
            int TotalTireTruck = 0;
            int TotalTireBus = 0;

            for (Vehicle V : list) {
                if (V instanceof Car){
                    TotalVehicle++;
                    TotalWorth += V.getValue();
                    TotalWorthCar += V.getValue();
                    TotalTireCar += V.getTire();

                }
                if (V instanceof Truck) {
                    TotalVehicle++;
                    TotalWorth += (V.getValue()- (((Truck) V).getMileage()* .25));
                    if (V.getValue() < Peasant)
                        PeasantName = V.getName();
                    TotalTireTruck += V.getTire();
                }
                if (V instanceof Bus) {
                    TotalVehicle++;
                    TotalWorth += V.getValue();
                    if (((Bus) V).getTown().length() > Long.length())
                        Long = ((Bus) V).getTown();
                    TotalTireBus += V.getTire();
                }
            }
            System.out.println("Total number of vehicles: " + TotalVehicle);
            System.out.println("Total worth of all vehicles: " + TotalWorth);
            System.out.println("Total worth of all cars: " + TotalWorthCar);
            System.out.println("Longest home destination of all buses: " + Long);
            System.out.println("Truck with the least value: " + PeasantName);
            System.out.println("Total number of tires of all cars: " + TotalTireCar);
            System.out.println("Total number of tires of all trucks: " + TotalTireTruck);
            System.out.println("Total number of tires of all buses: " + TotalTireBus);



        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}

/*
Total number of vehicles: 13
Total worth of all vehicles: 322449.5
Total worth of all cars: 33950.0
Longest home destination of all buses: Minneapolis
Truck with the least value: Softy
Total number of tires of all cars: 15
Total number of tires of all trucks: 95
Total number of tires of all buses: 69
*/
