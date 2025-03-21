package Q3;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String cityZip = input.nextLine();
        String delta = "";
        for (int x = 0; x < cityZip.length(); x++) {
            if (cityZip.substring(x, x+1).equals(",")) {
                x += 999999;
            }
            else { delta += cityZip.substring(x, x+1); }
        }
        System.out.println(delta);
    }
}
