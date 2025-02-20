package Q3;

import Q3.Prog702p.Beepers;

import java.util.ArrayList;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Data = input.next();
        ArrayList<String> Words = new ArrayList<String>();
        for (int x = 0; x < Data.length(); x++ ) {
            System.out.println(Data.substring(x, x+1));
            Words.add((Data.substring(x, x+1)));
        }
        for (int y = 0; y < Words.size(); y++ ){
            System.out.println(Words.get(y));
        }
    }
}
