package Q1;

public class LP59 {
    public static void main(String[] args) {
        System.out.println("x^1 \t\t x^2 \t\t x^3 \t\t x^4 \t\t x^5");

        int square;
        int cube;
        int fourth;
        int fifth;

        for(int x = 1; x <= 10; x++){
            square = (int) Math.pow(x, 2);
            cube = (int) Math.pow(x, 3);
            fourth = (int) Math.pow(x, 4);
            fifth = (int) Math.pow(x, 5);
            if (x < 3) {
                System.out.println(x + "\t\t\t  " + square + "\t\t\t  " + cube + "\t\t\t " + fourth + "\t\t\t " + fifth);
            }
            else if (x == 3){
                System.out.println(x + "\t\t\t  " + square + "\t\t\t  " + cube + "\t\t " + fourth + "\t\t\t " + fifth);
            }
            else {
                System.out.println(x + "\t\t\t  " + square + "\t\t  " + cube + "\t\t " + fourth + "\t\t " + fifth);
            }
        }
    }
/*
x^1 		 x^2 		 x^3 		 x^4 		 x^5
1			  1			  1			 1			 1
2			  4			  8			 16			 32
3			  9			  27		 81			 243
4			  16		  64		 256		 1024
5			  25		  125		 625		 3125
6			  36		  216		 1296		 7776
7			  49		  343		 2401		 16807
8			  64		  512		 4096		 32768
9			  81		  729		 6561		 59049
10			  100		  1000		 10000		 100000
*/
}
