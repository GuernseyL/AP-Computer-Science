package Q1.FreetimeCoding;
import java.util.Scanner;

public class Crawler {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = 0;
        System.out.println("Welcome to the land of the 'Mysticality Zone.' " +
                            "What used to be a vibrant land of magic is now a desolate wasteland where you will " +
                            "learn how to survive, \naswell as finding great treasures. Now then, who were you? " +
                            "(Alchemist, Knight, Scholar, Hunter, Paladin, Seer)");
        String Role = "";
        String confirmation = "";
        while (x == 0) {
            String StrIn = input.nextLine();
            if      (StrIn.equals("Alchemist"))   { Role = "Alchemist"; }
            else if (StrIn.equals("Knight"))      { Role = "Knight"; }
            else if (StrIn.equals("Scholar"))     { Role = "Scholar"; }
            else if (StrIn.equals("Hunter"))      { Role = "Hunter"; }
            else if (StrIn.equals("Paladin"))     { Role = "Paladin"; }
            else if (StrIn.equals("Seer"))        { Role = "Seer"; }
            else if (StrIn.equals("Ichvesi"))     { Role = "Ichvesi"; }
            else if (StrIn.equals("Pandora"))     { Role = "Pandora"; }
            else if (StrIn.equals("Pandemonium")) { Role = "Pandemonium"; }
            else                                { System.out.println("You did not enter your role, closing game.");
                                                    System.exit(0); }
            CrPlayer Player = new CrPlayer(Role);
            if (!StrIn.equals("Ichvesi")&&!StrIn.equals("Pandora")&&!StrIn.equals("Pandemonium"))
                { System.out.println("Youre role is a " + Role + ". Is this correct? (Y/N)");
                confirmation = input.nextLine();
                if (confirmation.equals("Y")) { x++; }
                else { System.out.println ("Reselect your class."); } }
            else if (StrIn.equals("Ichvesi")) System.out.println("You are Ichvesi, the blood fiend. " +
                    "This journey has been long and gruelling, but you've made it. " +
                    "Paradise will be in the palm of your hand");
            else if (StrIn.equals("Pandora")) System.out.println("You are Pandora, the apathetic." +
                    "");

            }


        int Close = input.nextInt();
        if (Close == 1) { System.exit(0); }
    }
}