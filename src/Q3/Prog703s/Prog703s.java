package Q3.Prog703s;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prog703s {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog703s.txt"));
            List<Computer> list = new ArrayList<Computer>();

            while (file.hasNext()) {
                int des = file.nextInt();

                if (des == 1) {
                    String NA = file.next();
                    int NU = file.nextInt();
                    double V = file.nextDouble();
                    String CO = file.next();
                    Computer C = new Apple(NA, NU, V, CO);
                    list.add(C);
                }

                if (des == 2) {
                    String NA = file.next();
                    int NU = file.nextInt();
                    double V = file.nextDouble();
                    double VE = file.nextDouble();
                    Computer C = new Windows(NA, NU, V, VE);
                    list.add(C);
                }

                if (des == 3) {
                    String NA = file.next();
                    int NU = file.nextInt();
                    double V = file.nextDouble();
                    int SC = file.nextInt();
                    Computer C = new Linux(NA, NU, V, SC);
                    list.add(C);
                }

            }

            int TotalColorofMoney = 0;
            int BadVersion = 0;
            int SecretCode = 0;

            for (Computer C : list) {
                if (C instanceof Windows) {
                    if (((Windows) C).getVersion() == 7.0) {
                        BadVersion++;
                    }
                }

                if (C instanceof Apple) {
                    if (((Apple) C).getColor().equals("Gold") || ((Apple) C).getColor().equals("Green")) {
                        TotalColorofMoney++;
                    }
                }

                if (C instanceof Linux) {
                    if (((Linux) C).getCode()%5 == 0) {
                        SecretCode++;
                    }
                }
            }

            System.out.println("Total number of Gold and Green Apple Computers: " + TotalColorofMoney);
            System.out.println("Total number of 7.0 version Windows Computers: " + BadVersion);
            System.out.println("Total number of Linux computers with hidden code ending in 5: " + SecretCode);

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
