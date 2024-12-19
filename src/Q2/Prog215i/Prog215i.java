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
            int Number = file.nextInt();
            double Miles;
            double Gallons;
            double MPG = 0.0;
            MPG mpg = new MPG(MPG);

            while (Number != 0) {
                Miles = file.nextDouble();
                Gallons = file.nextDouble();
                Cl215i Gas = new Cl215i(Number, Miles, Gallons, MPG);
                list.add(Gas);
                Number =  file.nextInt();

            }
            System.out.println("Vehicle\tMiles\tGallons\tMPG");



        for (int v = 0; v < list.size(); v++) {
            Cl215i thing = list.get(v);
            MPG = mpg.calc(list.get(v));
            System.out.printf("%d\t%.2f\t%.2f\t%.2f\n", thing.getVehicle(), thing.getGallons(), thing.getMiles(), MPG);
        }

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
/*Vehicle	Miles	Gallons	MPG
1005	380.50	15.00	0.04
1007	0.00	0.00	0.00
1003	240.10	12.00	0.05
1006	172.30	9.00	0.05
1008	317.70	14.00	0.04
1001	0.00	0.00	0.00
1010	390.20	17.00	0.04
1015	152.10	4.00	0.03
1017	310.00	12.30	0.04
1020	409.90	17.90	0.04
