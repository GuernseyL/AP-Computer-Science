package Q1;
import java.util.Scanner;

public class StrInt6 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str1 = input.nextLine();
        str1 = str1.trim();
        str1 = str1.toLowerCase();
        int strlen = str1.length();
        String cha1;
        String cha2;

        for(int x = 0; x < strlen; x++){
            cha1 = str1.substring(x, x);
            for(int j = 0; j < strlen; j++) {
                System.out.print(cha1);
            }
        }
    }


}
