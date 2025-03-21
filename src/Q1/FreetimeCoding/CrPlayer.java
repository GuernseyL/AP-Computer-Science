package Q1.FreetimeCoding;

import java.lang.reflect.Array;

public class CrPlayer extends CrEntity {
    private String myClass;
    private int    Level;
    private String[][] Skills = new String[2][8];


    public CrPlayer(String Class) {
        myClass = Class;
        Level = 0;
    }
    public void Initialize(){
        Skills[1][3] = "Locked";
        Skills[1][4] = "Locked";
        Skills[1][5] = "Locked";
        Skills[1][6] = "Locked";
        Skills[1][7] = "Locked";
        if (myClass == ("Alchemist")) {
            Skills[0][0] = "Firestorm";
            Skills[0][1] = "Hail";
            Skills[0][2] = "Thunderstorm";
            Skills[0][3] = "Meteor Shower";
            Skills[0][4] = "Lightning Bolt";
            Skills[0][5] = "Blizzard";
            Skills[0][6] = "Alpha";
            Skills[0][7] = "Beta";
        }
        if (myClass == ("Alchemist")) {
            Skills[0][0] = "Firebomb";
            Skills[0][1] = "Lightning Bottle";
            Skills[0][2] = "Frostbomb";
            Skills[0][3] = "Self-Heal";
            Skills[0][4] = "Overdrive";
            Skills[0][5] = "Blizzard";
            Skills[0][6] = "";
            Skills[0][7] = "Shadoo's Blessing";
        }
        if (myClass == ("Alchemist")) {
            Skills[0][0] = "Firestorm";
            Skills[0][1] = "Hail";
            Skills[0][2] = "Thunderstorm";
            Skills[0][3] = "Meteor Shower";
            Skills[0][4] = "Lightning Bolt";
            Skills[0][5] = "Blizzard";
            Skills[0][6] = "Alpha";
            Skills[0][7] = "Beta";
        }
    }
}
