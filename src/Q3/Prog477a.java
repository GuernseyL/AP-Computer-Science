package Q3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog477a {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog464a.dat"));
            int[][] sort = new int[6][3];

            while (file.hasNext()) {
                if (file.nextInt() == 1) {
                    if (file.nextInt() == 1)
                        sort[0][0] += 1;
                    else if (file.nextInt() == 2)
                        sort[1][0] += 1;
                    else if (file.nextInt() == 3)
                        sort[2][0] += 1;
                    else if (file.nextInt() == 4)
                        sort[3][0] += 1;
                    else if (file.nextInt() == 5)
                        sort[4][0] += 1;
                }
                else if (file.nextInt() == 2) {
                    if (file.nextInt() == 1)
                        sort[0][1] += 1;
                    else if (file.nextInt() == 2)
                        sort[1][1] += 1;
                    else if (file.nextInt() == 3)
                        sort[2][1] += 1;
                    else if (file.nextInt() == 4)
                        sort[3][1] += 1;
                    else if (file.nextInt() == 5)
                        sort[4][1] += 1;
                }
            }

            for (int r = 0; r < sort.length; r++)
                sort[5][0] += sort[r][0];
            for (int r = 0; r < sort.length; r++)
                sort[5][1] += sort[r][1];
            for (int r = 0; r < sort.length-1; r++)
                for (int c = 0; c < sort[0].length; c++)
                    sort[r][2] += sort[r][c];
            for (int r = 0; r < sort.length; r++)
                sort[5][2] += sort[r][2];

            for (int r = 0; r < sort.length; r++){
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
