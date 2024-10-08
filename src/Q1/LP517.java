package Q1;
import java.util.Scanner;

public class LP517 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String password = "MXNE903";
        int delta = 0;

        for(int x = 1; x <= 3; x++){
            System.out.print("Enter the password: ");
            String guess = input.nextLine();

            if (guess.equals(password)){
                System.out.println("Welcome");
                delta = 5;
            }
            else{
                System.out.println("The password you typed is incorrect");
            }
        }
        if (delta != 5) {
            System.out.println("Access Denied!");
        }
    }
}
