package Q3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog465c {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog465c.txt"));
            int[][] sort = new int[3][4];

            for (int r = 0; r < sort.length; r++)
                for (int c = 0; c < sort[0].length; c++)
                    sort[r][c] = file.nextInt();

            System.out.println("Original table\n");

            for (int r = 0; r < sort.length; r++) {
                for (int c = 0; c < sort[0].length; c++) {
                    System.out.print(sort[r][c] + " ");
                }
                System.out.println();
            }

            int tot = 0;

            for (int r = 0; r < sort.length; r++) {
                for (int c = 0; c < sort[0].length; c++) {
                    if (r == 0 || r == sort.length-1)
                        tot += sort[r][c];
                    else if (c == 0 || c == sort.length)
                            tot += sort[r][c];
                    }
                }

            System.out.println("\nThe total of the edges is: " + tot);

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}

/*
Original table

3 4 100 195
182 225 83 125
235 67 129 42

The total of the edges is: 1082
 */
