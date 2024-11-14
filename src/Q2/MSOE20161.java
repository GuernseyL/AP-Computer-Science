package Q2;
import java.util.Scanner;

public class MSOE20161 {
    public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            String palin  = input.nextLine().toLowerCase().trim();
            String delta  = "";
            for  (int x = palin.length(); x > 0; x--) { delta += palin.substring(x - 1, x); }
            if   (palin.equals(delta))                { System.out.print(palin + " is a palindrome."); }
            else                                      { System.out.print(palin + " is not a palindrome."); }
    }
}
