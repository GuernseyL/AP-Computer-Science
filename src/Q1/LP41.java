package Q1;
import java.util.*;

public class LP41 {
    public static void main(String[] args){
        System.out.println("B \t\t I \t\t\t N \t\t\t G \t\t\t O");
        int bingo = 0;
        while (bingo <= 2){
            int Bnum = (int) (Math.random() * (15-1)) + 1;
            int Inum = (int) (Math.random() * (30-16)) + 16;
            int Nnum = (int) (Math.random() * (45-31)) + 31;
            int Gnum = (int) (Math.random() * (60-46)) + 46;
            int Onum = (int) (Math.random() * (75-61)) + 61;
            System.out.println(Bnum + " \t\t " + Inum + " \t\t " + Nnum + " \t\t " + Gnum + " \t\t " + Onum);
            bingo ++;
        }
        while (bingo == 3) {
            int Bnum = (int) (Math.random() * (15 - 1)) + 1;
            int Inum = (int) (Math.random() * (30 - 16)) + 16;
            int Gnum = (int) (Math.random() * (60 - 46)) + 46;
            int Onum = (int) (Math.random() * (75 - 61)) + 61;
            System.out.println(Bnum + " \t\t " + Inum + " \t FreeSpace \t\t " + Gnum + " \t\t " + Onum);
            bingo++;
        }
        while (bingo <= 5) {
            int Bnum = (int) (Math.random() * (15 - 1)) + 1;
            int Inum = (int) (Math.random() * (30 - 16)) + 16;
            int Nnum = (int) (Math.random() * (45 - 31)) + 31;
            int Gnum = (int) (Math.random() * (60 - 46)) + 46;
            int Onum = (int) (Math.random() * (75 - 61)) + 61;
            System.out.println(Bnum + " \t\t " + Inum + " \t\t " + Nnum + " \t\t " + Gnum + " \t\t " + Onum);
            bingo++;
        }
    }
}
/*
B 		 I 			 N 			 G 			 O
4 		 18 		 41 		 58 		 70
5 		 17 		 31 		 52 		 70
10 		 25 		 43 		 55 		 63
12 		 29 	 FreeSpace 		 56 		 64
4 		 28 		 38 		 52 		 63
9 		 28 		 33 		 48 		 61
 */
