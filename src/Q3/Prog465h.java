package Q3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog465h {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog465h.dat"));
            int[][] sort = new int[5][6];

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

            int count = 0;

            for (int r = 0; r < sort.length; r++) {
                for (int c = 0; c < sort[0].length; c++) {
                    if (sort[r][c] != 0)
                        count += 3;
                }
            }
            if (count > 30) {
                System.out.println("\nThe Original Matrix is Abundant.");
                System.exit(0);
            }

            System.out.println("\nSparse Matrix\n");

            for (int r = 0; r < sort.length; r++) {
                for (int c = 0; c < sort[0].length; c++) {
                    if (sort[r][c] != 0)
                        System.out.println((r+1) + " " + (c+1) + " " + sort[r][c]);
                }
            }

            if (count == 30) {
                System.out.println("\n The Original Matrix and the Sparse Matrix are Equally Efficient.");
            }

            System.out.println("\nThe Original Matrix is Sparse.");

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}

/*
Original table

5 6 0 0 7 0
0 0 0 0 0 0
-8 0 0 0 0 0
0 0 2 0 0 0
0 0 0 0 0 0

Sparse Matrix

1 1 5
1 2 6
1 5 7
3 1 -8
4 3 2

The Original Matrix is Sparse.
 */