package Q3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog465b {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog465b.dat"));
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

            System.out.println("Numbers less than 100\n\nRow\tColumn");

            for (int r = 0; r < sort.length; r++)
                for (int c = 0; c < sort[0].length; c++) {
                    if (sort[r][c] < 100) {
                        System.out.println((r+1) + "\t" + (c+1));
                    }
                }


        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}

/*
100 195 182 225
83 125 235 67
129 42 100 750
Numbers less than 100

Row	Column
2	1
2	4
3	2
 */
