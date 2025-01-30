package Q3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog470a {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog464a.dat"));
            int[][] sort = new int[6][5];

            for (int r = 0; r < sort.length; r++)
                for (int c = 0; c < sort[0].length; c++)
                    sort[r][c] = file.nextInt();

            for (int c = 0; c < sort.length; c++) {
                int total = 0;
                for (int r = 0; r < sort[0].length; r++) {
                    total += sort[r][c];

                }
                sort[6][c] = total;
            }

            for (int r = 0; r < sort.length; r++) {
                for (int c = 0; c < sort[0].length; c++) {
                    System.out.print(sort[r][c] + " ");
                }
            }

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
