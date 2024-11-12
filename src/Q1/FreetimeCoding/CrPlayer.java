package Q1.FreetimeCoding;

public class CrPlayer extends CrEntity {
    private String myClass;
    private int    Level;
    private String Skill1;
    private String Skill2;
    private String Skill3;
    private String Skill4;
    private String Skill5;
    private String skill6;
    private String skill7;
    private String skill8;


    public CrPlayer(String Class) {
        myClass = Class;
        Level = 0;
    }
    public void Initialize(){
        if (myClass == ("Alchemist")) {
            Skill1 = "Firestorm";
            Skill2 = "Blizzard";
            Skill3 = "Thunderstorm";
            Skill4 = "Inferno";
            Skill5 = "Lightning Bolt";
            //Skill6 = "Ice Storm";
            //Skill7 = "Alpha";
            //Skill8 = "Beta";
        }
    }
}
