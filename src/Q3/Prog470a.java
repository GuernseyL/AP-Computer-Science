package Q3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog470a {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog464a.dat"));
            int[][] sort = new int[6][5];

            for (int r = 0; r < sort.length-1; r++)
                for (int c = 0; c < sort[0].length; c++)
                    sort[r][c] = file.nextInt();

            for (int c = 0; c < sort[0].length; c++) {
                int total = 0;
                for (int r = 0; r < sort.length-1; r++) {
                    total += sort[r][c];

                }
                sort[5][c] = total;
            }

            for (int r = 0; r < sort.length; r++) {
                for (int c = 0; c < sort[0].length; c++) {
                    System.out.print(sort[r][c] + " ");
                }
                System.out.println();
            }

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}

/*
45 67 89 12 -3
-3 -6 -7 -4 -9
96 81 -8 52 12
14 -7 72 29 -1
19 43 28 63 87
171 178 174 152 86
 */
