package Q3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog470b {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog464a.dat"));
            int[][] sort = new int[5][5];

            for (int r = 0; r < sort.length; r++)
                for (int c = 0; c < sort[0].length; c++)
                    sort[r][c] = file.nextInt();

            int DiagSum = 0;
            int DiagSumAlt = 0;

            for (int r = 0; r < sort.length; r++) {
                for (int c = 0; c < sort[0].length; c++) {
                    if (r == c)
                        DiagSum += sort[r][c];
                    if (r + c == 4)
                        DiagSumAlt += sort[r][c];
                }
            }

            System.out.println("Original Matrix \n");
            for (int r = 0; r < sort.length; r++) {
                for (int c = 0; c < sort[0].length; c++) {
                    System.out.print(sort[r][c] + " ");
                }
                System.out.println();
            }

            System.out.println("\nMain Diagonal Sum: " + DiagSum);
            System.out.println("Other Diagonal Sum: " + DiagSumAlt);

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}

/*
Original Matrix

45 67 89 12 -3
-3 -6 -7 -4 -9
96 81 -8 52 12
14 -7 72 29 -1
19 43 28 63 87

Main Diagonal Sum: 147
Other Diagonal Sum: -3
 */
