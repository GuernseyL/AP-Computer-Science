package Q1.FreetimeCoding;

public class CrPlayer extends CrEntity {
    private String myClass;
    private int    Level;
    private String Skill1;
    private String Skill2;
    private String Skill3;
    private String Skill4;
    private String Skill5;
    private String Skill6;
    private String Skill7;
    private String Skill8;


    public CrPlayer(String Class) {
        myClass = Class;
        Level = 0;
    }
    public void Initialize(){
        if (myClass == ("Alchemist")) {
            Skill1 = "Firestorm";
            Skill2 = "Hail";
            Skill3 = "Thunderstorm";
            Skill4 = "Meteor Shower";
            Skill5 = "Lightning Bolt";
            Skill6 = "Blizzard";
            Skill7 = "Alpha";
            Skill8 = "Beta";
        }
    }
}
