package Q1.FreetimeCoding;
import java.util.Scanner;

public class Crawler {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = 0;
        int y = 0;
        System.out.println("(Welcome to the Abyssal Wastes. You were hired and sent out by the king of the " +
                "Abyss, Dreadwing, in order to exterminate all of the warlords in the region. Please enter your" +
                "role in this war. [Alchemist/Fighter/Scholar/Hunter/Paladin/Seer] )");
        String Role = "";
        String confirmation = "";
        while (x != 1) {
            String StrIn = input.nextLine();
            while (y != 1) {
                if      (StrIn.equals("Alchemist"))   { Role = "Alchemist";   y++; }
                else if (StrIn.equals("Fighter"))     { Role = "Fighter";     y++; }
                else if (StrIn.equals("Scholar"))     { Role = "Scholar";     y++; }
                else if (StrIn.equals("Hunter"))      { Role = "Hunter";      y++; }
                else if (StrIn.equals("Paladin"))     { Role = "Paladin";     y++; }
                else if (StrIn.equals("Seer"))        { Role = "Seer";        y++; }
                else if (StrIn.equals("Night"))       { Role = "Night";       y++; }
                else if (StrIn.equals("Moonlight"))   { Role = "Moonlight";   y++; }

                else { System.out.println("You did not enter your role. Reselect your role.");
                    StrIn = input.nextLine();
                }
            }
            CrPlayer Player = new CrPlayer(Role);
            if (!Role.equals("Night")&&!Role.equals("Moonlight"))
                { System.out.println("Youre role is a " + Role + ". Is this correct? (Y/N)");
                confirmation = input.nextLine();
                if (confirmation.equals("Y")) { x++; }
                else { System.out.println ("Reselect your role."); } }
            else if (Role.equals("Night")) System.out.println("You are Night, the princess of the" +
                    "abyss, you fled from home due to all of the family drama within the civil war. However" +
                    "you were dragged back, and decided to end this war yourself.");
            else if (Role.equals("Moonlight")) System.out.println("You are Moonlight, the prince of the " +
                    "abyss. You were once highly respected in your kingdom, however due to restrictions on" +
                    "your experiments, you left to fend for yourself.");
            }


        int Close = input.nextInt();
        if (Close == 1) { System.exit(0); }
    }
}